package com.example.com.services;

import java.util.List;

import com.example.com.entities.User;

public interface UserService {

    User create(User user);

    User delete(int id);

    List<User> findAll();

    User findById(int id);

    User update(User user);
}
