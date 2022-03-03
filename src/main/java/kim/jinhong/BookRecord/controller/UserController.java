package kim.jinhong.BookRecord.controller;

import kim.jinhong.BookRecord.dto.UserDto;
import kim.jinhong.BookRecord.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(path = "/users/{userId}")
    public UserDto getUserInfo(@PathVariable Integer userId) {
        return userService.getUserInfo(userId);
    }
}