package com.onlineplantnursery.repository;

import java.util.List;

import com.onlineplantnursery.entity.PlantBean;

public interface IPlantRepository {
	PlantBean addPlant(PlantBean plant);
	PlantBean updatePlant(PlantBean plant);
	public PlantBean deletePlant(PlantBean plant);
	PlantBean viewPlant(int plantId);
	PlantBean viewPlant(String commonName);
	List<PlantBean> viewAllPlants();
	List<PlantBean> viewAllPlants(String typeOfPlant);
}
