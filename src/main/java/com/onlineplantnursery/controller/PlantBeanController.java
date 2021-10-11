package com.onlineplantnursery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlineplantnursery.entity.PlantBean;
import com.onlineplantnursery.service.IPlantServiceImpl;

@RestController
@RequestMapping("/plantinfo")
public class PlantBeanController {

	@Autowired
	IPlantServiceImpl ipl;
	
	@PostMapping("/addplant")
	public PlantBean addPlant(@RequestBody PlantBean plant) {
		return ipl.addPlant(plant);	
	}
	
	@PutMapping("/updateplant")
	public PlantBean updatePlant(@RequestBody PlantBean plant) {
		PlantBean  cust=ipl.updatePlant(plant);
		return cust;
	}

	@DeleteMapping("/deleteplant")
	public PlantBean deletePlant(@RequestBody PlantBean plant) {
		PlantBean delete=ipl.deletePlant(plant);
	    return delete;
	}

	@GetMapping("/viewplantbyid/{plantId}")
	public PlantBean viewPlant(@PathVariable("plantId") int plantId) {
		return ipl.viewPlant(plantId);
	}
	
	@GetMapping("/viewplantbyname/{commonName}")
	public PlantBean viewPlant(@PathVariable("commonName") String commonName) {
		return ipl.viewPlant(commonName);
	}
	
	@GetMapping("/viewplant")
	public List<PlantBean> viewAllPlants() {
		return ipl.viewAllPlants();
	}
	
	@GetMapping("/viewplantbytype/{typeOfPlant}")
	public List<PlantBean> viewAllPlants(@PathVariable("typeOfPlant") String typeOfPlant) {
		return ipl.viewAllPlants(typeOfPlant);
	}
}
