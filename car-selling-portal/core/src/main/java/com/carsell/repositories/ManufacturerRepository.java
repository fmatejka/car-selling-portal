package com.carsell.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.carsell.models.Manufacturer;

public interface ManufacturerRepository extends JpaRepository<Manufacturer, Integer>{

	
}
