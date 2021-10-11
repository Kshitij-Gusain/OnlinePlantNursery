package com.onlineplantnursery.repository;

import java.util.List;

import com.onlineplantnursery.entity.SeedBean;

public interface ISeedRepository {
	SeedBean addSeed(SeedBean seed);
	SeedBean updateSeed(SeedBean seed);
	SeedBean deleteSeed(SeedBean seed);
	SeedBean viewSeed(int seedId);
	SeedBean viewSeed(String commonName);
	List<SeedBean> viewAllSeeds();
	List<SeedBean> viewAllSeeds(String typeOfSeed);
}
