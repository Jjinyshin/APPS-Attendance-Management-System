package apps.ams_spring.service.user;


import apps.ams_spring.domain.user.User;
import apps.ams_spring.dto.request.UserCreateRequest;
import apps.ams_spring.repository.UserRepository;
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
