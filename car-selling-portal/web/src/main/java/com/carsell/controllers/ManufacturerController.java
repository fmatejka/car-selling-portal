package com.carsell.controllers;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carsell.models.Manufacturer;
import com.carsell.models.Model;
import com.carsell.services.manufacturer.dto.ManufacturerDTO;
import com.carsell.services.model.ModelService;
import com.carsell.services.model.dto.ModelDTO;
import com.carsell.services.manufacturer.ManufacturerService;

@RestController
@RequestMapping("/manufacturer")
public class ManufacturerController {
	
	@Autowired
	private ManufacturerService manufacturerService;
	
	
	@Autowired
	private ModelService modelService;
	
	@GetMapping("/selectedManufacturer/{id}")
	public ResponseEntity<ManufacturerDTO> getManufacturer(@PathVariable Integer id) {
		ManufacturerDTO  manufacturer = manufacturerService.getManufacturerById(id);
		return ResponseEntity.ok(manufacturer);
	}
	
	@GetMapping("/manufacturers")
	public ResponseEntity<List<ManufacturerDTO>> getManufacturers(){
	
		List<ManufacturerDTO> manufacturers = manufacturerService.getManufacturers();
		return ResponseEntity.ok(manufacturers);
	}
	
	
	@PostMapping("/add")
	public ResponseEntity<ManufacturerDTO> addManufacturer(@RequestBody Manufacturer m){
		
		manufacturerService.addManufacturer(m);
		ManufacturerDTO newManufacturer = new ManufacturerDTO(m);
		return ResponseEntity.ok(newManufacturer);
		
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<ManufacturerDTO> updateManufacturer(@RequestBody Manufacturer m,@PathVariable Integer id){
		
		m.setId(id);
		manufacturerService.updateManufacturer(m, id);
		ManufacturerDTO newManufacturer = new ManufacturerDTO(m);
		return ResponseEntity.ok(newManufacturer);
		
		
	
	}
	
	@GetMapping("/selectedManufacturer/{mid}/models")
	public ResponseEntity<List<ModelDTO>> showModels(@PathVariable Integer mid){
		
		
		List<ModelDTO> list = modelService.getModels(mid);
		return ResponseEntity.ok(list);
	}
	
	@PostMapping("/selectedManufacturer/{mid}/addModel")
	public ResponseEntity<ModelDTO> addModel(@RequestBody Model c,@PathVariable Integer mid){
		
		modelService.addModel(mid, c);
		ModelDTO model = new ModelDTO(c);
		return ResponseEntity.ok(model);
	
	}
	
	@GetMapping("/selectedManufacturer/{mid}/deleteModel/{id}")
	public ResponseEntity<Void> deleteModel(@PathVariable Integer mid,@PathVariable Integer id){
		
		modelService.deleteModel(mid, id);
		return ResponseEntity.ok().build();
	}
	
	
	
	

}
