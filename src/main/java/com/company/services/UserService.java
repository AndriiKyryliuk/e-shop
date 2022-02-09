package com.company.services;

import com.company.dao.UserRepository;
import com.company.model.User;
import com.company.model.UserList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User getUser() {
        return repository.findById(1).get();
    }

    public UserList getUserList() {
        User jax = new User(1, 30, "Jax");
        User sonya = new User(2, 27, "Sonya");
        List<User> users = new ArrayList<>();
        users.add(jax);
        users.add(sonya);



        return new UserList(users, 5);
    }
}
