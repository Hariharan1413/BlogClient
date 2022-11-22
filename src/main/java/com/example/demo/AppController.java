package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@Autowired
	BlogRepository blogRepo;
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	CommentRepository comRepo;
	
	@Autowired
	CategoryRepository catRepo;
	
	@Autowired
	FileDBRepository fileDbRepo;
}
