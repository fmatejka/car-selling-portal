package com.carsell.services.manufacturer.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carsell.models.Car;
import com.carsell.models.Manufacturer;
import com.carsell.repositories.ManufacturerRepository;
import com.carsell.services.manufacturer.dto.ManufacturerDTO;
import com.carsell.services.car.dto.CarDTO;
import com.carsell.services.manufacturer.ManufacturerService;

@Service
public class ManufacturerServiceImpl implements ManufacturerService{

	@Autowired
	private ManufacturerRepository manufacurerRepository;

	
	@Override
	public ManufacturerDTO getManufacturerById(int id) {
		Manufacturer m = manufacurerRepository.getOne(id);
		if(m==null)
			return null;
		else 
			return new ManufacturerDTO(m);
	}

	@Override
	public List<ManufacturerDTO> getManufacturers() {

		List <ManufacturerDTO> list = new ArrayList<ManufacturerDTO>();
		for (Manufacturer m : manufacurerRepository.findAll()) {
			ManufacturerDTO newManufacturer = new ManufacturerDTO(m);
			list.add(newManufacturer);
		}
		
		return list;		
	}

	@Override
	public Manufacturer addManufacturer(Manufacturer m) {
		return manufacurerRepository.save(m);
	}

	@Override
	public Manufacturer updateManufacturer(Manufacturer m, Integer id) {
		
		return manufacurerRepository.save(m);
	}

	@Override
	public void deleteManufacturer(Integer id) {
		Manufacturer m = manufacurerRepository.getOne(id);
		if(m != null)
			manufacurerRepository.deleteById(id);
	}

}
