package com.example.demo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Data
public class User {
	
	@Id
	private String userId;
	private String password;
	private String name;
	@OneToMany
	private List<Blog> blogs;
	private String email;
	
	@ManyToMany
	@JsonIgnoreProperties("following")
	private List<User> following;
	
	

}
