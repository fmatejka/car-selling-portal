package com.carsell.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.carsell.models.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	

	
	
}
