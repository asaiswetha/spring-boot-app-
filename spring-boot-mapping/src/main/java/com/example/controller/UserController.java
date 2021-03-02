package com.example.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Comments;
import com.example.entities.Customer;
import com.example.entities.Employee;
import com.example.entities.Gender;
import com.example.entities.Post;
import com.example.entities.User;
import com.example.entities.UserProfile;
import com.example.services.UserServices;

@RestController
public class UserController {

	@Autowired
	private UserServices userServices;
	
	@GetMapping("/user")
	public User saveUserDetails() {
		
		User user=new User();
		user.setEmail("mailtosweth97@gmail.com");
		user.setId(1);
		user.setName("swetha");
		
		UserProfile userProfile=new UserProfile();
		userProfile.setAddress("Chennai");
		userProfile.setGender(Gender.FEMALE);
		userProfile.setPhonenumber("9176724437");
		userProfile.setBirthDate(LocalDate.of(1997, 6, 4));

		user.setUserProfile(userProfile);
		System.out.println("inside controller");
		return userServices.saveUserDetails(user);
	}
	
	@GetMapping("/post")
	public Post savePostDetails() {
		Post post=new Post();
		post.setTitle("Spring");
		post.setDescription("I like Spring");
		post.setId(1);
		
		Comments com1=new Comments("com1");
		Comments com2=new Comments("com2");
		
		List<Comments> comments=new ArrayList<Comments>();		
		comments.add(com1);
		comments.add(com2);
		
		post.setComments(comments);
		return userServices.savePostDetails(post);
	}
	
	@GetMapping("/employee")
	public Employee saveEmpDetails() {
		Employee emp=new Employee();
		
		Customer c1=new Customer();
		c1.setCustName("swetha");
		c1.setCustPhone("81743654");
		c1.setId(1);
		
		Customer c2=new Customer();
		c2.setCustName("geethika");
		c2.setCustPhone("12536435");
		c2.setId(2);
		
		Set<Customer> cust_set=new HashSet<Customer>();
		cust_set.add(c1);
		cust_set.add(c2);
		
		emp.setId(1);
		emp.setName("swetha");
		emp.setPhonenumber("9176724437");
		emp.setCustomers(cust_set);
		return userServices.saveEmpDetails(emp);
	}
}
