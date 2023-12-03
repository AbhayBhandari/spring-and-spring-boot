package com.learnJPA.learnJPA.repository;

import com.learnJPA.learnJPA.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    // https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html#jpa.query-methods.query-creation
    public User findByName(String name);
}
