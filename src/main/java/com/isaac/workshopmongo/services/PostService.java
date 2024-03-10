package com.isaac.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isaac.workshopmongo.dto.PostDTO;
import com.isaac.workshopmongo.entity.Post;
import com.isaac.workshopmongo.entity.User;
import com.isaac.workshopmongo.repository.PostRepository;
import com.isaac.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repository;
	@Autowired
	private UserService userService;
	
	public List<PostDTO> findByUser(String id) {
		User user = userService.findById(id);
		List<PostDTO> posts = user.getPosts().stream().map(x -> new PostDTO(x)).toList();
		return posts;
	}
	public Post findById(String id) {
		Optional<Post> post = repository.findById(id);
		return post.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}
