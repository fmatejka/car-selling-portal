package com.carsell.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarSellingPortalMain{

	public static void main(String[] args) {

		SpringApplication.run(CarSellingPortalMain.class,args);
		
		System.out.println("hello...");
		
		User u = new User();
		
		u.setId(1);
		u.setUsername("fmatejka019");
		u.setPassword("mypassword");
		u.setFirst_name("Filip");
		u.setLast_name("Matejevic");
		u.setManufacturer_id(101);
		
		System.out.println(u.toString());
		
	}

}
