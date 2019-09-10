package com.carsell.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CarSellingPortalMain{

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(CarSellingPortalMain.class,args);
		
		Manufacturer m = context.getBean(Manufacturer.class);
		
		m.toString();
		
	}

}
