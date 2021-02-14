package com.mrtk.onlineshop.user;

import java.util.Optional;
import java.util.Set;

public interface UserRepository {

    Optional<User> getUser(String userId);

    Set<User> getUsers();
}
