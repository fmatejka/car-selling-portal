package com.carsell.services.model;

import java.util.List;
import java.util.Set;

import com.carsell.models.Manufacturer;
import com.carsell.models.Model;
import com.carsell.services.model.dto.ModelDTO;

public interface ModelService {
	
	public ModelDTO getModelById(int id);
	public List<ModelDTO> getModels(Integer mid);
	public Model addModel(Integer mid,Model c); 
	public Model updateModel(Integer mid,Integer id,Model c);
	public void deleteModel(Integer mid,Integer id);
	

}
