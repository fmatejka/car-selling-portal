package com.carsell.services.manufacturer;

import java.util.List;

import com.carsell.models.Manufacturer;
import com.carsell.services.manufacturer.dto.ManufacturerDTO;

public interface ManufacturerService {
	
	public ManufacturerDTO getManufacturerById(int id);
	public List<ManufacturerDTO> getManufacturers();
	public Manufacturer addManufacturer(Manufacturer c); 
	public Manufacturer updateManufacturer(Manufacturer m,Integer id);
	public void deleteManufacturer(Integer id);

}
