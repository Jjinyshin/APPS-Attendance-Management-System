package jiny.apps_ams.service.user;

import jiny.apps_ams.domain.user.User;
import jiny.apps_ams.dto.request.UserCreateRequest;
import jiny.apps_ams.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public void saveUser(UserCreateRequest request) {
        userRepository.save(new User(request.getName(), request.getSchoolNumber(), request.getClubRole(), request.getTeamRole(), request.getTeamName(), request.getClubYear(), request.getBirthDay()));
    }

}
