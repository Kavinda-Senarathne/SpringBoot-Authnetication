package com.hellokoding.SpringBootAuth.service;

import com.hellokoding.SpringBootAuth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}