package com.learnJPA.learnJPA;

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
		UserRepository userRepository = context.getBean(UserRepository.class);

		User user = new User();
		user.setName("Abhay Bhandari");
		user.setCity("Pune");

		User getUser = userRepository.save(user);
		System.out.println(getUser);
	}

}
