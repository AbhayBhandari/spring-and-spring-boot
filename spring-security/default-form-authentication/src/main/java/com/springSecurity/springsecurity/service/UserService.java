package com.springSecurity.springsecurity.service;

import com.springSecurity.springsecurity.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService {
    private List<User>list = new ArrayList<>();

    public UserService(){
        list.add(new User("Abhay", 1, "password1"));
        list.add(new User("Rakshit", 2, "password2"));
        list.add(new User("Bhandari", 3, "password3"));
    }

    public List<User> getAllUsers(){
        return this.list;
    }

    public User getUserById(String name){
        return this.list.stream().filter((user)->user.getName().equals(name)).findAny().orElse(null);
    }

    public User addUser(User user){
        this.list.add(user);
        return user;
    }
}
