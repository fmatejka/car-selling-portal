package com.carsell.services.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carsell.models.Manufacturer;
import com.carsell.models.Model;
import com.carsell.models.Model;
import com.carsell.repositories.ManufacturerRepository;
import com.carsell.repositories.ModelRepository;
import com.carsell.repositories.ModelRepository;
import com.carsell.services.manufacturer.dto.ManufacturerDTO;
import com.carsell.services.model.ModelService;
import com.carsell.services.model.dto.ModelDTO;
import com.carsell.services.model.dto.ModelDTO;

@Service
public class ModelServiceImpl implements ModelService{

	
	@Autowired
	private ModelRepository modelRepository;
	
	@Autowired
	private ManufacturerRepository manufacturerRepository;
	
	@Override
	public Model addModel(Integer mid, Model m) {
		
		Manufacturer manu = manufacturerRepository.getOne(mid);
		m.setManufacturer(manu);
		return modelRepository.save(m);
		
	}
	

	@Override
	public ModelDTO getModelById(int id) {
		
		Model c = modelRepository.getOne(id);
		if(c==null)
			return null;
		else 
			return new ModelDTO(c);
	}

	@Override
	public List<ModelDTO> getModels(Integer mid) {
		
		Manufacturer m = manufacturerRepository.getOne(mid);
		List <ModelDTO> list = new ArrayList<ModelDTO>();
		for (Model c : m.getModels()) {
			ModelDTO newModel = new ModelDTO(c);
			list.add(newModel);
		}
		
		return list;
	}

	@Override
	public Model updateModel(Integer mid, Integer id,Model c) {
		
		Manufacturer m = manufacturerRepository.getOne(mid);
		c.setManufacturer(m);
		return modelRepository.save(c);
		
	}


	@Override
	public void deleteModel(Integer mid, Integer id) {

		Model c = modelRepository.getOne(id);
		if(c != null)
			modelRepository.deleteById(id);
	}





}
