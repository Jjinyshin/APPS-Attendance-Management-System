package jiny.apps_ams.controller.user;

import jiny.apps_ams.dto.request.UserCreateRequest;
import jiny.apps_ams.service.user.UserService;
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
