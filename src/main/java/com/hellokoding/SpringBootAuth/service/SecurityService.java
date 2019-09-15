package com.hellokoding.SpringBootAuth.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}