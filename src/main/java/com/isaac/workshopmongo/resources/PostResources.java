package com.isaac.workshopmongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isaac.workshopmongo.dto.PostDTO;
import com.isaac.workshopmongo.entity.Post;
import com.isaac.workshopmongo.services.PostService;

@RestController
@RequestMapping("/posts")
public class PostResources {

	@Autowired
	private PostService service;
	
	@GetMapping("/user/{id}")
	public ResponseEntity<List<PostDTO>> findByUser(@PathVariable String id){
		return ResponseEntity.ok().body(service.findByUser(id));
	}
}
