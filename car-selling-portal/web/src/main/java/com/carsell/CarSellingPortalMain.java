package com.carsell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.carsell.models.User;

@SpringBootApplication
public class CarSellingPortalMain{

	public static void main(String[] args) {

		SpringApplication.run(CarSellingPortalMain.class,args);
		
		System.out.println("hello...");
		
		User u = new User();
		
		u.setId(1);
		u.setUsername("fmatejka019");
		u.setPassword("mypassword");
		u.setFirstName("Filip");
		u.setLastName("Matejevic");
		
		
		System.out.println(u.toString());
		
	}

}
