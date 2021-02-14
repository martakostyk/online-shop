package com.mrtk.onlineshop.user;

import org.springframework.stereotype.Component;

import java.util.Set;


@Component
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(String userId) {
        return userRepository.getUser(userId)
                .orElseThrow(() -> new NoUserFoundException(String.format("No user found for id %s", userId)));
    }

    public Set<User> getUsers() {
        return userRepository.getUsers();
    }
}
