package com.carsell.demo;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer>{
	

	
	 /* @Query(value = "SELECT u.user_id FROM user_role u WHERE u.role_id = 1", 
			  nativeQuery = true)
	List<Integer> findAllAdmins();  */
	
	
}
