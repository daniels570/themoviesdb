package com.themovie.restclientsamples.service;


import com.themovie.restclientsamples.service.dto.user.login.LoginRequest;
import com.themovie.restclientsamples.service.dto.user.login.LoginResponse;
import com.themovie.restclientsamples.service.dto.user.register.RegisterUserRequest;
import com.themovie.restclientsamples.service.dto.user.register.RegisteredUserResponse;

public interface UserService {
    RegisteredUserResponse create(RegisterUserRequest user);
    LoginResponse login(LoginRequest loginRequest);
}
