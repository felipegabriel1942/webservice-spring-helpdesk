package com.felipegabriel.helpdesk.api.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.felipegabriel.helpdesk.api.enums.PriorityEnum;
import com.felipegabriel.helpdesk.api.enums.StatusEnum;

import lombok.Getter;
import lombok.Setter;

@Document
public class Ticket {
	
	@Id
	@Getter
	@Setter
	private String id;
	
	@DBRef(lazy = true)
	@Getter
	@Setter
	private User user;
	
	@Getter
	@Setter
	private Date date;
	
	@Getter
	@Setter
	private Integer number;
	
	@Getter
	@Setter
	private StatusEnum status;
	
	@Getter
	@Setter
	private PriorityEnum priority;
	
	@DBRef(lazy = true)
	@Getter
	@Setter
	private User assignedUser;
	
	@Getter
	@Setter
	private String description;
	
	@Getter
	@Setter
	private String image;
	
	@Getter
	@Setter
	private List<ChangeStatus> changes;
}
