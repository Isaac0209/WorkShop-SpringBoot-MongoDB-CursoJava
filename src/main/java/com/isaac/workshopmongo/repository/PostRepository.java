package com.isaac.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.isaac.workshopmongo.entity.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}
