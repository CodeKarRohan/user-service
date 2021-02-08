package com.rohancode.userservice.service;

import com.rohancode.userservice.entity.User;
import com.rohancode.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User createUser(User user) {

       return  userRepository.save(user);
    }

    public User getUser(Long userId) {
        return userRepository.getUserByUserId(userId);

    }
}
