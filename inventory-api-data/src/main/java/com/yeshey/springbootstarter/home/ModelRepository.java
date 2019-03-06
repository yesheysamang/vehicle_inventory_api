package com.yeshey.springbootstarter.home;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ModelRepository extends CrudRepository<Model,String> {
	
	public List<Model> findByCompanyId(String companyId);
	public List<Model> findByVehicleId(String vehicleId);	
}
