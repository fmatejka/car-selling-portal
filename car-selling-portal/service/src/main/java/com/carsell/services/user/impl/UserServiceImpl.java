package com.carsell.services.user.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carsell.models.User;
import com.carsell.services.user.dto.UserDTO;
import com.carsell.repositories.UserRepository;
import com.carsell.services.user.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User addUser(User c) {

		if(c.getUsername()!=null) {
			for(User u : userRepository.findAll())
				if(c.getUsername().equals(u.getUsername()))
					return null;
		}
		return userRepository.save(c);
		
	}
	

	@Override
	public UserDTO getUserById(int id) {
		
		User c = userRepository.getOne(id);
		if(c==null)
			return null;
		else 
			return new UserDTO(c);
	}

	@Override
	public List<UserDTO> getUsers() {
		
		List <UserDTO> list = new ArrayList<UserDTO>();
		for (User c : userRepository.findAll()) {
			UserDTO newUser = new UserDTO(c);
			list.add(newUser);
		}
		
		return list;
	}

	@Override
	public User updateUser(Integer id,User c) {
		
		if(c.getUsername()!=null) {
			for(User u : userRepository.findAll())
				if(c.getUsername().equals(u.getUsername()))
					return null;
		}
		return userRepository.save(c);
		
	}


	@Override
	public void deleteUser(Integer id) {

		User c = userRepository.getOne(id);
		if(c != null)
			userRepository.deleteById(id);
	}



}
