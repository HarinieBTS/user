package com.example.user.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.example.user.entity.User; // Import User entity

@Service
public class UserServiceImpl {

    private List<User> users = new ArrayList<>();

    public User createUser(User user) {
        System.out.println(user);
        users.add(user);
        return user;
    }

    public String updateUser() {
        return "updated user";
    }

    public String deleteUser() {
        return "deleted user";
    }

    public List<User> getUser() {
        return users;
    }
}
