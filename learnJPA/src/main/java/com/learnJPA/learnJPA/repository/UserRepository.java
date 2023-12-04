package com.learnJPA.learnJPA.repository;

import com.learnJPA.learnJPA.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

// can also use JpaRepository instead of CrudRepository
public interface UserRepository extends CrudRepository<User, Integer> {
    // https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html#jpa.query-methods.query-creation
    public User findByName(String name);

    @Query(value = "Select * from user_table u where u.city=:city", nativeQuery = true)
    public User findByCityy(String city);
}
