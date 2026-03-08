package com.example.service.impl;

import com.example.model.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final SendEmailService sendEmailService;

    @Override
    public void save(User user) {
        userRepository.save(user);
        if (user.getUsername().contains("@")) {
            sendEmailService.sendMail(user.getUsername(),
                    "Welcome to our platform",
                    "You have successfully registered. please login http://localhost:8081/loginPage");
        }
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
