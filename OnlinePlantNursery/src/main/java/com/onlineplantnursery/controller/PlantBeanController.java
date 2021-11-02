package com.onlineplantnursery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/plantinfo")
public class PlantBeanController {

	@Autowired
	IPlantServiceImpl plantService;
	
	@PostMapping("/addplant")
	public PlantBean addPlant(@RequestBody PlantBean plant) {
		return plantService.addPlant(plant);	
	}
	
	@PutMapping("/updateplant")
	public PlantBean updatePlant(@RequestBody PlantBean plant) {
		PlantBean  cust=plantService.updatePlant(plant);
		return cust;
	}

	@DeleteMapping("/deleteplant")
	public PlantBean deletePlant(@RequestBody PlantBean plant) {
		PlantBean delete=plantService.deletePlant(plant);
	    return delete;
	}
	
	@DeleteMapping("/deleteplantbyid/{plantId}")
	public String deletePlantById(@PathVariable int plantId){
			 plantService.deletePlantById(plantId);
			 return "Plant deleted sucessfully";
	}

	@GetMapping("/viewplantbyid/{plantId}")
	public PlantBean viewPlant(@PathVariable("plantId") int plantId) {
		return plantService.viewPlant(plantId);
	}
	
	@GetMapping("/viewplantbyname/{commonName}")
	public PlantBean viewPlant(@PathVariable("commonName") String commonName) {
		return plantService.viewPlant(commonName);
	}
	
	@GetMapping("/viewplant")
	public List<PlantBean> viewAllPlants() {
		return plantService.viewAllPlants();
	}
	
	@GetMapping("/viewplantbytype/{typeOfPlant}")
	public List<PlantBean> viewAllPlants(@PathVariable("typeOfPlant") String typeOfPlant) {
		return plantService.viewAllPlants(typeOfPlant);
	}
}
