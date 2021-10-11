package com.onlineplantnursery.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineplantnursery.dao.PlantDao;
import com.onlineplantnursery.entity.PlantBean;
import com.onlineplantnursery.repository.IPlantRepository;

@Service
public class IPlantServiceImpl implements IPlantRepository {
	
	@Autowired
	PlantDao daoo4;
	
	public PlantBean addPlant(PlantBean plant) {
		PlantBean result = daoo4.save(plant);
		return result;
	}
	
	public PlantBean updatePlant(PlantBean plant) {
		PlantBean result = daoo4.save(plant);
		return result;	   
	}

	public PlantBean deletePlant(PlantBean plant) {
		PlantBean result = daoo4.findById(plant.getPlantId()).get();
		daoo4.deleteById(plant.getPlantId());
		return result;
	}
        
	public PlantBean viewPlant(int plantId) {
		Optional<PlantBean> viewP = daoo4.findById(plantId);
		return viewP.get();
	}
   
	public PlantBean viewPlant(String commonName) {
		return daoo4.viewPlant(commonName);
	}
	
	public List<PlantBean> viewAllPlants() {
		return daoo4.findAll();
	}
	
	public List<PlantBean> viewAllPlants(String typeOfPlant) {
		return daoo4.viewAllPlants(typeOfPlant);
	}
}
