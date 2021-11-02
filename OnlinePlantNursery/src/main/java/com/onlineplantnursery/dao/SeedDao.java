package com.onlineplantnursery.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.onlineplantnursery.entity.SeedBean;

@Repository("SeedRepository")
public interface SeedDao  extends JpaRepository<SeedBean, Integer> {

	@Query("SELECT ud FROM SeedBean ud WHERE ud.typeOfSeeds=?1")
	public List<SeedBean> viewAllSeeds(String typeOfSeeds);

	@Query("SELECT uname FROM SeedBean uname WHERE uname.commonName=?1")
	public SeedBean viewSeed(String commonName);

	
}
