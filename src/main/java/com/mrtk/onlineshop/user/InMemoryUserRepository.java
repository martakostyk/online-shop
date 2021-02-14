package com.mrtk.onlineshop.user;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.*;

@Component
public class InMemoryUserRepository implements UserRepository {

    private final Map<String, User> users = new HashMap<>();

    @PostConstruct
    public void initializeRepository() {
        users.put("0001", new User("Jan", "Kowalski"));
        users.put("0002", new User("Ola", "Fasola"));
    }

    @Override
    public Optional<User> getUser(String userId) {
        return Optional.ofNullable(users.get(userId));
    }

    @Override
    public Set<User> getUsers() {
        return Set.copyOf(users.values());
    }
}
