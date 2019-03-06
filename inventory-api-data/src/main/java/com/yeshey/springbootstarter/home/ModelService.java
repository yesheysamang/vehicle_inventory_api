package com.yeshey.springbootstarter.home;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelService {
	
	@Autowired
	private ModelRepository modelRepository;
	// Implements retrieval of all models in the DB
	public List<Model> getAllModels(){
		List<Model> models = new ArrayList<>();
		modelRepository.findAll().forEach(models::add);
		return models;
	}
	// Implements retrieval of all models based off category in the DB
	public List<Model> getAllModelsOfCategory(String vehicleId){
		List<Model> models = new ArrayList<>();
		modelRepository.findByVehicleId(vehicleId).forEach(models::add);
		return models;
	}
	// Implements retrieval of all models based off company in the DB
	public List<Model> getAllModelsOfCompany(String companyId){
		List<Model> models = new ArrayList<>();
		modelRepository.findByCompanyId(companyId).forEach(models::add);
		return models;
	}
	// Implements retrieval of a single vehicle model in the DB
	public Optional<Model> getModel(String id) {
		return modelRepository.findById(id);
	}
	// Implements deletion of a single vehicle model in the DB
	public void deleteModel(String id) {
		modelRepository.deleteById(id);
	}
}
