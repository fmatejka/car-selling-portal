package com.carsell.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/manufacturer")
public class ManufacturerController {

	@Autowired
	private ManufacturerDao dao;
	
	
	@PostMapping("/addManufacturers")
	public String addManufacturer(List<Manufacturer> manufacturers) {
		
		dao.saveAll(manufacturers);
		return "Manufacturer booked:" ;
	}
	
	@GetMapping("/getManufacturers")
	public List<Manufacturer> getManufacturers() {
		
		return (List<Manufacturer>) dao.findAll();
	}
}
