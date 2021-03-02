package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Employee;
import com.example.entities.Post;
import com.example.entities.User;
import com.example.repo.EmployeeRepository;
import com.example.repo.PostRepository;
import com.example.repo.UserRepository;

@Service
public class UserServices {

	@Autowired(required = true)
	private UserRepository userRepo;
	
	@Autowired
	private PostRepository postRepo;
	
	@Autowired
	private EmployeeRepository empRepo;
	
	public User saveUserDetails(User user) {
		System.out.println("inside service");
		return userRepo.save(user);
	}
	
	public Post savePostDetails(Post post) {
		return postRepo.save(post);
	}
	
	public Employee saveEmpDetails(Employee emp) {
		return empRepo.save(emp);
	}
}
