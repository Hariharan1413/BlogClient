package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	
	@PostMapping("reguser")
	public ResponseEntity<User> regUser(@RequestBody User user){
	  User u=	userRepo.save(user);
	return new ResponseEntity(u,HttpStatus.OK);
	}
	
	
	@GetMapping("user/{id}")
	public ResponseEntity<User> getUser(@PathVariable String id) {
		 User u=	userRepo.findById(id).get();
		return new ResponseEntity(u,HttpStatus.OK);
	}
	
}
