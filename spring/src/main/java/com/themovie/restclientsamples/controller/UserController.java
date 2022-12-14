package com.themovie.restclientsamples.controller;

import com.themovie.restclientsamples.service.UserService;
import com.themovie.restclientsamples.service.dto.user.login.LoginRequest;
import com.themovie.restclientsamples.service.dto.user.login.LoginResponse;
import com.themovie.restclientsamples.service.dto.user.register.RegisterUserRequest;
import com.themovie.restclientsamples.service.dto.user.register.RegisteredUserResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("themovies/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public RegisteredUserResponse registerUser(@RequestBody RegisterUserRequest registerUserRequest) {
        return this.userService.create(registerUserRequest);
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest loginRequest) {
        return this.userService.login(loginRequest);
    }

}
