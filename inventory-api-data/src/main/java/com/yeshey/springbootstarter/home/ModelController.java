package com.yeshey.springbootstarter.home;

//Imported Classes
import java.util.List;
import java.util.Optional;

//Imported annotations
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModelController {
	
	@Autowired
	private ModelService modelService;
	
	/* Request all vehicle models */
	@RequestMapping("/models")
	public List<Model> getAllModel() {
		return modelService.getAllModels();
	}
	/* Request all vehicle models based on vehicle category */
	@RequestMapping("/vehicle_category/{vehicleId}/models")
	public List<Model> getAllModelsOfCategory(@PathVariable String vehicleId) {
		return modelService.getAllModelsOfCategory(vehicleId);
	}
	
	/* Request all car models based on car company */
	@RequestMapping("/companies/{companyId}/models")
	public List<Model> getAllModels(@PathVariable String companyId) {
		return modelService.getAllModelsOfCompany(companyId);
	}
	
	/* Request an individual car model*/
	@RequestMapping("/models/{id}")
	public Optional<Model> getModel(@PathVariable String id) {
		return modelService.getModel(id);
	}
	
	/* Delete an individual vehicle model*/
	@RequestMapping(method=RequestMethod.DELETE,value = "models/{id}")
	public void deleteModel(@PathVariable String id) {
		modelService.deleteModel(id);
	}
}
