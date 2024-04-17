package apps.ams_spring.controller.user;

import apps.ams_spring.dto.request.UserCreateRequest;
import apps.ams_spring.service.user.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public void saveUser(@RequestBody UserCreateRequest userCreateRequest) {

        log.info("username={}, birthday={}", userCreateRequest.getName(), userCreateRequest.getBirthDay());

        userService.saveUser(userCreateRequest);
    }
}
