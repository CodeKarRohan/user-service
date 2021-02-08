package com.rohancode.userservice.controller;

import com.rohancode.userservice.entity.User;
import com.rohancode.userservice.service.UserService;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/")
    public User saveUser(@RequestBody  User user){
        log.info("inside user service save user");
        return userService.createUser(user);

    }


    @GetMapping("/{userId}")
    public User getUser(@PathVariable  Long userId){
        return userService.getUser(userId);
    }




}
