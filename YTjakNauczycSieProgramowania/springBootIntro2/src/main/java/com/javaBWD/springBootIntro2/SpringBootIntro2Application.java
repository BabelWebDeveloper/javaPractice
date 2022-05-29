package com.javaBWD.springBootIntro2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootIntro2Application implements CommandLineRunner {

	@Autowired
	UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootIntro2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userService.registerUser("Przemo");
	}
}
