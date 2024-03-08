package com.isaac.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.isaac.workshopmongo.entity.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
