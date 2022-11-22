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
	FileDBRepository fileRepo;
	
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
//		User u=new User();
//		u.setName("Alex");
//		u.setPassword("123");
//		u.setUserId("Uabc");
//		u.setEmail("abc@gmail.com");
//		
//		
//		
//		
//		FileDB file= fileRepo.findById("99138bb3-c314-45f5-8b48-1577e83bfa64").get();
//		u.setProfilePic(file);
//		u.setRole("user");
//		userRepo.save(u);
//		
//		
//		
//		User u1=new User();
//		u1.setName("Max");
//		u1.setPassword("123");
//		u1.setUserId("Umax");
//		u1.setEmail("max@gmail.com");
//		u1.setRole("user");
//		
//		FileDB files= fileRepo.findById("a2bcb787-1c72-4caf-b83e-7dc5f06d6638").get();
//		u1.setProfilePic(files);
//		
//		userRepo.save(u1);
//		
//		u.setFollowing(Arrays.asList(u1));
//		
//		Category c=new Category();
//		c.setCName("Education");
//		catRepo.save(c);
//		
//		Blog b=new Blog();
//		b.setCategory(c);
//		b.setCreatedBy(u1);
//		b.setDate(new Date());
//		
//		b.setTitle("Maths");
//		b.setContent("Maths is a subject which is not only applicable in our academics but also in real life. "
//				+ "Making kids love this subject is a challenge, especially for parents. "
//				+ "It takes a lot of brainpower to master Maths and this can be tough for kids. "
//				+ "Some students may find Maths hard to learn. ");
//		b.setFile(files);
//		blogRepo.save(b);
//		
//		Comment comment=new Comment();
//		comment.setBlog(b);
//		comment.setMessage("Cool");
//		comment.setNoOfLikes(2);
//		comment.setUser(u);
//		
//		comRepo.save(comment);
//	
//		b.setComments(Arrays.asList(comment));
//		
//	
//		blogRepo.save(b);
//		
		
		
	}

}
