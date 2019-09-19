package com.carsell.repositories;

import org.springframework.data.repository.CrudRepository;

import com.carsell.models.Manufacturer;

public interface ManufacturerRepository extends CrudRepository<Manufacturer, Integer>{

	
}
