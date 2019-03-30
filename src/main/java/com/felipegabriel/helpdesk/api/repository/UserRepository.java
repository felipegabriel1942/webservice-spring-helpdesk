package com.felipegabriel.helpdesk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.felipegabriel.helpdesk.api.model.User;

public interface UserRepository extends MongoRepository<User, String>{
	
	User findByEmail(String email);
}
