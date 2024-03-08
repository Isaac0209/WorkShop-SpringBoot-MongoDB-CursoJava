package com.isaac.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.isaac.workshopmongo.entity.User;
import com.isaac.workshopmongo.repository.UserRepository;


@Configuration
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userR;
	
	
	
	@Override
	public void run(String... args) throws Exception {
		userR.deleteAll();
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		userR.saveAll(Arrays.asList(maria,alex,bob));
		
	}
}
