package com.onlineplantnursery.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineplantnursery.dao.SeedDao;
import com.onlineplantnursery.entity.SeedBean;
import com.onlineplantnursery.repository.ISeedRepository;

@Service
public class ISeedServiceImpl implements ISeedRepository {
	
	@Autowired
	SeedDao dao5;
	
	public SeedBean addSeed(SeedBean seed) {
		SeedBean result = dao5.save(seed);
		return result;
	}
	
	public SeedBean updateSeed(SeedBean seed) {
		SeedBean result = dao5.save(seed);
		return result;	   
	}
	
	public SeedBean deleteSeed(SeedBean seed) {
		SeedBean result = dao5.findById(seed.getSeedId()).get();
		dao5.deleteById(seed.getSeedId());
		return result;
	}
	
	public SeedBean viewSeed(int seedId) {	
		Optional<SeedBean> viewS = this.dao5.findById(seedId);
		return viewS.get();
	}
	
	public SeedBean viewSeed(String commonName) {
		return dao5.viewSeed(commonName);
	}
	
    public List<SeedBean> viewAllSeeds() {
		return dao5.findAll();
	}

	public List<SeedBean> viewAllSeeds(String typeOfSeeds) {
		return dao5.viewAllSeeds(typeOfSeeds);
	}	
}
