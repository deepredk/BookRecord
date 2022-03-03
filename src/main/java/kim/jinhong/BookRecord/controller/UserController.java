package kim.jinhong.BookRecord.controller;

import kim.jinhong.BookRecord.dto.UserDto;
import kim.jinhong.BookRecord.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(path = "/users/{userId}")
    public UserDto getUserInfo(@PathVariable Integer userId) {
        return userService.getUserInfo(userId);
    }

    @PostMapping(path = "/users")
    public ResponseEntity<UserDto> join(@RequestParam String userName) {
        Integer userId = userService.join(userName);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(userId)
                .toUri();

        return ResponseEntity.created(location).build();
    }
}