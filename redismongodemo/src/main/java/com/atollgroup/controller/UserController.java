package com.atollgroup.controller;

import com.atollgroup.model.User;
import com.atollgroup.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by aszatyin on 2017-01-06.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value = "/user")
    public void saveUser() {
        userService.saveUserAndProduct();
    }

    @GetMapping(value = "/user")
    public List<User> getUsers(){
        return userService.getUsers();
    }

}
