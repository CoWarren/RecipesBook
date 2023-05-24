package com.recipebook.recipebook.service;

import com.recipebook.recipebook.model.User;
import com.recipebook.recipebook.repository.InMemoryUserRepository;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public class UserService {

    private final InMemoryUserRepository inMemoryUserRepository;

    public UserService(InMemoryUserRepository inMemoryUserRepository){
        this.inMemoryUserRepository = inMemoryUserRepository;
    }

    public Map<Integer, User> getAllUsers(){
        return inMemoryUserRepository.getAllUsers();
    }

    public User getUserById(int userId){
        return inMemoryUserRepository.getUserById(userId);
    }
}
