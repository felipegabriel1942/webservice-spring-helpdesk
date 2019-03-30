package com.felipegabriel.helpdesk.api.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.felipegabriel.helpdesk.api.enums.StatusEnum;

import lombok.Getter;
import lombok.Setter;

@Document
public class ChangeStatus {
	
	@Id
	@Getter
	@Setter
	private String id;
	
	@DBRef
	@Getter
	@Setter
	private Ticket ticket;
	
	@DBRef
	@Getter
	@Setter
	private User userChange;
	
	@Getter
	@Setter
	private Date dateChangeStatus;
	
	@Getter
	@Setter
	private StatusEnum status;
}
