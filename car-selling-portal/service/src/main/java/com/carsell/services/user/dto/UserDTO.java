package com.carsell.services.user.dto;

import java.util.Set;

import com.carsell.models.Manufacturer;
import com.carsell.models.Role;
import com.carsell.models.User;

public class UserDTO {
	
	private String username;
	private String firstName;
	private String lastName;
	private Set<Role> roles;	
	
	
	public UserDTO() {
		super();
	}
	public UserDTO(String username, String firstName, String lastName, Set<Role> roles, Manufacturer manufacturer) {
		super();
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.roles = roles;
	}
	
	public UserDTO(User u) {
		this.username = u.getUsername();
		this.firstName = u.getFirstName();
		this.lastName = u.getLastName();
		this.roles = u.getRoles();
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	

}
