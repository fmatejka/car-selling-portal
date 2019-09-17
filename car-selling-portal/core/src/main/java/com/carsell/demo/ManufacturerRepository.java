package com.carsell.demo;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ManufacturerRepository extends CrudRepository<Manufacturer, Integer>{

	String Q_GET_ALL_MODELS = "select m from Model m left join m.manufacturer";

	@Query(Q_GET_ALL_MODELS)
	Collection<Model> getAllModels();
}
