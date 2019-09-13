package com.carsell.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepository ur;
	
	@PostMapping("/addUsers")
	public String addUsers(@RequestBody List<User> users) {
		
		ur.saveAll(users);
		return "Manufacturer booked:" + ur.toString();
	}
	
	@GetMapping("/getUsers")
	public List<User> getUsers() {
		
		return (List<User>) ur.findAll();
	}
	

}
