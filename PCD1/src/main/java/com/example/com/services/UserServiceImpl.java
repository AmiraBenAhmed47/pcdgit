package com.example.com.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.com.entities.User;
import com.example.com.repositories.UserRepository;
import java.util.List;
public class UserServiceImpl implements UserService {
	 @Autowired
	    private UserRepository repository;

	    @Override
	    public User create(User user) {
	        return repository.save(user);
	    }

	    @Override
	    public User delete(int id) {
	        User user = findById(id);
	        if(user != null){
	            repository.delete(user);
	        }
	        return user;
	    }

	    @Override
	    public List findAll() {
	        return repository.findAll();
	    }

	    @Override
	    public User findById(int id) {
	        return repository.findOne(id);
	    }

	    @Override
	    public User update(User user) {
	        return null;
	    }
}
