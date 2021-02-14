package com.mrtk.onlineshop.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}/info")
    public User getUserInfo(@PathVariable("id") String userId) {
        return userService.getUser(userId);
    }

    @GetMapping
    public Set<User> getUsers() {
        return userService.getUsers();
    }
}
