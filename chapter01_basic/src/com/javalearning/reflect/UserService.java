package com.javalearning.reflect;

public class UserService {
    public boolean login(String username, String password) {
        return "admin".equals(username) && "admin".equals(password);
    }
}
