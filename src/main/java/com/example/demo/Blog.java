package com.example.demo;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Blog {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String title;
	@OneToOne
	private Category category;
	private String description;	
	@OneToOne
	private User createdBy;	
	private Date date;
	@OneToMany (mappedBy="blog")
	private List<Comment> comments;	
	private int noOfLikes;
	
	@OneToOne
	private FileDB file;
	

}
