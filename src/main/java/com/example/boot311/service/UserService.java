package com.example.boot311.service;

import com.example.boot311.model.User;

import java.util.List;

public interface UserService {
    public User findById(int id);

    public List<User> findAll();

    public User saveUser(User user);

    public void deleteById(int id);
}
