package com.isaac.workshopmongo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isaac.workshopmongo.dto.UserDTO;
import com.isaac.workshopmongo.entity.User;
import com.isaac.workshopmongo.repository.UserRepository;
import com.isaac.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
	
		return repository.findAll();
	}
	public User findById(String id) {
		Optional<User> user = repository.findById(id);
	
		return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	public User insert(User obj) {
		return repository.insert(obj);
	}
	public User update(User user) {
		User use = findById(user.getId());
		use.setEmail(user.getEmail());
		use.setName(user.getName());
		return repository.save(use);
	}
	public void delete(String id) {
		findById(id);
		repository.deleteById(id);
	}
	public User fromDTO(UserDTO dto) {
		return new User(dto.getId(), dto.getName(), dto.getEmail());
	}
}
