package com.recipebook.recipebook.controller;

import com.recipebook.recipebook.model.User;
import com.recipebook.recipebook.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RequestMapping("/users")
@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public @ResponseBody Map<Integer, User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("{userId}")
    public @ResponseBody User getUserById(@PathVariable("userId") int userId) {
        return userService.getUserById(userId);
    }
//
//    @GetMapping
//    public @ResponseBody Map<i>
}
