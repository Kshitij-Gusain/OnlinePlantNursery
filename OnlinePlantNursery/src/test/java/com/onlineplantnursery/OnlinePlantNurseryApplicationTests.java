package com.onlineplantnursery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.onlineplantnursery.entity.PlantBean;
import com.onlineplantnursery.entity.SeedBean;
import com.onlineplantnursery.service.IPlantServiceImpl;
import com.onlineplantnursery.service.ISeedServiceImpl;

@SpringBootTest
class OnlinePlantNurseryApplicationTests {

	@Autowired
	private IPlantServiceImpl plantService;
	
	@Autowired
	private ISeedServiceImpl seedService;
	
	@Test
	void addPlantTest() {
		PlantBean plant = new PlantBean(1,5,"wide","rose","spring","both","level2","35c","type2","red",30,25.0);
		PlantBean savePlant = plantService.addPlant(plant);
		Assertions.assertEquals(plant.getCommonName(), savePlant.getCommonName());
	}	
	
	@Test
	void addSeedTest() {
		SeedBean seed = new SeedBean(1,"seed1","all year","daily","level4","34c","type2","red",25,30.0,22);
		SeedBean saveSeed = seedService.addSeed(seed);
		Assertions.assertEquals(seed.getCommonName(), saveSeed.getCommonName());
	}
	
	@Test
	void updateSeedTest() {
		SeedBean seed = seedService.viewSeed(1);
		seed.setWatering("weekly");
		SeedBean saveSeed = seedService.updateSeed(seed);
		Assertions.assertEquals(seed.getWatering(), saveSeed.getWatering());
	}

}
