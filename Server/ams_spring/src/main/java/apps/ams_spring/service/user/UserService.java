package apps.ams_spring.service.user;


import apps.ams_spring.domain.user.User;
import apps.ams_spring.dto.request.UserCreateRequest;
import apps.ams_spring.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public void saveUser(UserCreateRequest request) {
        log.info("username={}, birthday={}", request.getName(), request.getBirthDay());

        User savedUser = userRepository.save(new User(null, request.getName(), request.getSchoolNumber(), request.getClubRole(), request.getTeamRole(), request.getTeamName(), request.getClubYear(), request.getBirthDay()));

        System.out.println(savedUser.toString());
    }

}
