package com.felipegabriel.helpdesk.api.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.felipegabriel.helpdesk.api.enums.ProfileEnum;

import lombok.Getter;
import lombok.Setter;

@Document
public class User {
	
	@Id
	private String id;
	
	@Indexed(unique = true)
	@NotBlank(message = "Email obrigatorio")
	@Email(message = "Email invalido")
	@Getter
	@Setter
	private String email;
	
	@NotBlank(message = "Password obrigatorio")
	@Size(min = 6)
	@Getter
	@Setter
	private String password;
	
	@Getter
	@Setter
	private ProfileEnum profile;
	
}
