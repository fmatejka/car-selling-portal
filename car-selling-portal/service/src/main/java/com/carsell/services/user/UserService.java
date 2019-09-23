package com.carsell.services.user;

import java.util.List;

import com.carsell.models.User;
import com.carsell.services.user.dto.UserDTO;

public interface UserService {
	
	public UserDTO getUserById(int id);
	public List<UserDTO> getUsers();
	public User addUser(User u); 
	public User updateUser(Integer id,User u);
	public void deleteUser(Integer id);
	

}
