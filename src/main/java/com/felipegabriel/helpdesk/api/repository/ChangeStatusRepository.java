package com.felipegabriel.helpdesk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.felipegabriel.helpdesk.api.model.ChangeStatus;


public interface ChangeStatusRepository extends MongoRepository<ChangeStatus, String>{
	
}
