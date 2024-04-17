package apps.ams_spring.controller.user;

import apps.ams_spring.dto.request.UserCreateRequest;
import apps.ams_spring.service.user.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public void saveUser(UserCreateRequest userCreateRequest) {
        userService.saveUser(userCreateRequest);
    }
}
