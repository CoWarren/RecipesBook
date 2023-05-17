package com.recipebook.recipebook.repository;

import com.recipebook.recipebook.model.User;
import org.springframework.stereotype.Component;


import java.util.HashMap;
import java.util.Map;

@Component
public class InMemoryUserRepository {
    private final Map<Integer, User> users;

    public InMemoryUserRepository() {
        users = new HashMap<>();
        initialiseUsers();
    }

    public void initialiseUsers() {
        User user1 = new User(1, "obin1", "obin@gmail.com", "pass123");
        User user2 = new User(2, "chris24", "chris@gmail.com", "wawa24");
        User user3 = new User(3, "ismail", "ishy@gmail.com", "ish43");
        users.put(user1.getUserId(), user1);
        users.put(user2.getUserId(), user2);
        users.put(user3.getUserId(), user3);
    }

    public Map<Integer, User> getAllUsers() {
        return users;
    }

    public User getUserById(int userId) {
        return users.get(userId);
    }
}
