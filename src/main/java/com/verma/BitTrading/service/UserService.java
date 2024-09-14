package com.verma.BitTrading.service;

import com.verma.BitTrading.Model.User;
import com.verma.BitTrading.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {

        return userRepository.save(user);
    }
}
