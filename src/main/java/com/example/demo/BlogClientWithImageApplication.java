package com.example.demo;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient 
public class BlogClientWithImageApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BlogClientWithImageApplication.class, args);
	}
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	CategoryRepository catRepo;
	
	@Autowired
	BlogRepository blogRepo;
	
	@Autowired
	CommentRepository comRepo;

	@Override
	public void run(String... args) throws Exception {
		User u=new User();
		u.setName("Alex");
		u.setPassword("123");
		u.setUserId("Uabc");
		u.setEmail("abc@gmail.com");
		
		userRepo.save(u);
		
		User u1=new User();
		u1.setName("Max");
		u1.setPassword("123");
		u1.setUserId("Umax");
		u1.setEmail("max@gmail.com");
		
		userRepo.save(u1);
		
		u.setFollowing(Arrays.asList(u1));
		
		Category c=new Category();
		c.setCName("Education");
		catRepo.save(c);
		
		Blog b=new Blog();
		b.setCategory(c);
		b.setCreatedBy(u1);
		b.setDate(new Date());
		
		b.setTitle("Maths");
		b.setDescription("Maths is a subject which is not only applicable in our academics but also in real life. "
				+ "Making kids love this subject is a challenge, especially for parents. "
				+ "It takes a lot of brainpower to master Maths and this can be tough for kids. "
				+ "Some students may find Maths hard to learn. ");
		
		
		Comment comment=new Comment();
		comment.setBlog(b);
		comment.setMessage("Cool");
		comment.setNoOfLikes(2);
		comment.setUser(u);
		
		comRepo.save(comment);
	
		b.setComments(Arrays.asList(comment));
		
	
		blogRepo.save(b);
		
		
		
	}

}
