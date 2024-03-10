package com.isaac.workshopmongo.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.isaac.workshopmongo.dto.AuthorDTO;
import com.isaac.workshopmongo.entity.Post;
import com.isaac.workshopmongo.entity.User;
import com.isaac.workshopmongo.repository.PostRepository;
import com.isaac.workshopmongo.repository.UserRepository;


@Configuration
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userR;
	@Autowired
	private PostRepository postR;
	
	
	@Override
	public void run(String... args) throws Exception {
		userR.deleteAll();
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		userR.saveAll(Arrays.asList(maria,alex,bob));
		postR.deleteAll();
		Post p1 = new Post(null, Instant.now(), "Partiu Viagem", "Vou viajar para são paulo", new AuthorDTO(maria));
		Post p2 = new Post(null, Instant.now(), "Bom dia", "Acordei feliz", new AuthorDTO(maria));
		postR.saveAll(Arrays.asList(p1, p2));
		
		maria.getPosts().addAll(Arrays.asList(p1, p2));
		userR.save(maria);
	}
}
