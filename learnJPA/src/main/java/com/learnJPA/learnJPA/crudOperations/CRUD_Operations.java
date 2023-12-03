package com.learnJPA.learnJPA.crudOperations;

import com.learnJPA.learnJPA.entities.User;
import com.learnJPA.learnJPA.repository.UserRepository;

import java.util.List;
import java.util.Optional;

public class CRUD_Operations {
    public void insert(User user, UserRepository userRepository){
        userRepository.save(user);
    }
    public void insertMultiple(List<User> users, UserRepository userRepository){
        userRepository.saveAll(users);
    }
    public void update(int id, UserRepository userRepository){
        Optional<User> optional = userRepository.findById(id);
        User user = (User) optional.get();
        user.setName("Updated Name");
        user.setCity("Updated City");
        insert(user, userRepository);

    }
    public void deleteById(int id, UserRepository userRepository){
        userRepository.deleteById(id);
    }
    public User getUserById(int id, UserRepository userRepository){
        Optional<User> optional = userRepository.findById(id);
        return optional.get();
    }
    public Iterable<User> getAllUser(UserRepository userRepository){
        return userRepository.findAll();
    }
}
