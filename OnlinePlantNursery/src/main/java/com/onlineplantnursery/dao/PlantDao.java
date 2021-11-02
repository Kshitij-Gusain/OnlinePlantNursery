package com.onlineplantnursery.dao;

import java.util.List;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.onlineplantnursery.entity.PlantBean;

@Repository
public interface PlantDao extends JpaRepository <PlantBean,Integer> {

	@Query("SELECT ud FROM PlantBean ud WHERE ud.commonName=?1")
	PlantBean viewPlant(String commonName);

	@Query("SELECT ud FROM PlantBean ud WHERE ud.typeOfPlant=?1")
	List<PlantBean> viewAllPlants(String typeOfPlant);

}
