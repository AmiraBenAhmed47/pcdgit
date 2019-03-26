package com.example.com.repositories;

import com.example.com.entities.User;
import java.util.List;

import org.springframework.data.repository.Repository;



public interface UserRepository extends Repository<User,Long> {

    void delete(User user);

    List<User> findAll();

    User findOne(int id);

    User save(User user);
    }