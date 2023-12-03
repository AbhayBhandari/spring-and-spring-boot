package com.learnJPA.learnJPA.repository;

import com.learnJPA.learnJPA.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    public User findByName(String name);
}
