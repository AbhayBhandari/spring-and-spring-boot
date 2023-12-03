package com.learnJPA.learnJPA;

import com.learnJPA.learnJPA.crudOperations.CRUD_Operations;
import com.learnJPA.learnJPA.entities.User;
import com.learnJPA.learnJPA.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearnJpaApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(LearnJpaApplication.class, args);

		//we cannot create object of UserRepository as it is an interface but we can create its Bean
		UserRepository userRepository = context.getBean(UserRepository.class);

		CRUD_Operations crudOperations = new CRUD_Operations();

//		crudOperations.update(1, userRepository);

		Iterable<User>itr= crudOperations.getAllUser(userRepository);
		itr.forEach(user-> System.out.println(user));

//		crudOperations.deleteById(52, userRepository);

																		//this name string is not case sensititve
		System.out.println("find by name " + userRepository.findByName("Abhay bhandari"));

	}

}
