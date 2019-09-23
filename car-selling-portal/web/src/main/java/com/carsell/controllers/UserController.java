package com.carsell.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carsell.models.User;
import com.carsell.services.user.UserService;
import com.carsell.services.user.dto.UserDTO;



@RestController
@RequestMapping("/user")
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/selectedUser/{id}")
	public ResponseEntity<UserDTO> getUser(@PathVariable Integer id) {
		UserDTO  user = userService.getUserById(id);
		return ResponseEntity.ok(user);
	}
	
	@GetMapping("/users")
	public ResponseEntity<List<UserDTO>> getUsers(){
	
		List<UserDTO> users = userService.getUsers();
		return ResponseEntity.ok(users);
	}
	
	
	@PostMapping("/add")
	public ResponseEntity<UserDTO> addUser(@RequestBody User c){
		
		userService.addUser(c);
		UserDTO newUser = new UserDTO(c);
		return ResponseEntity.ok(newUser);
		
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<UserDTO> updateUser(@RequestBody User c,@PathVariable Integer id){
		
		c.setId(id);
		userService.updateUser(id, c);
		UserDTO newUser = new UserDTO(c);
		return ResponseEntity.ok(newUser);
	
	}
	
	@GetMapping("/delete/{id}")
	public ResponseEntity<Void> deleteUser(@PathVariable Integer id){

		userService.deleteUser(id);
		return ResponseEntity.ok().build();
	}
	

}
