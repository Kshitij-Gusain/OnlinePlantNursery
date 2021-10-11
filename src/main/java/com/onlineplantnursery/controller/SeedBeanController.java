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

import com.onlineplantnursery.entity.SeedBean;
import com.onlineplantnursery.service.ISeedServiceImpl;

@RestController
@RequestMapping("/seedinfo")
public class SeedBeanController {
	
	@Autowired
	private ISeedServiceImpl seedService;

	@PostMapping("/addseed")
	public SeedBean addSeed( @RequestBody SeedBean seed) {
		return seedService.addSeed(seed);
	}

	@PutMapping(path = "/updateseed")
	public SeedBean updateSeed(@RequestBody SeedBean seed) {
		SeedBean  cust=seedService.updateSeed(seed);
		return cust;
	}
		
	@DeleteMapping("/deleteseed")
	public SeedBean deleteSeed(@RequestBody SeedBean seed) {
		SeedBean delete=seedService.deleteSeed(seed);
		return delete;
	}

	@GetMapping(path = "/viewseedbyid/{seedId}")
	public SeedBean viewSeed(@PathVariable("seedId") int seedId) {
		return seedService.viewSeed(seedId);
	}
		
	@GetMapping(path = "/viewseed/{commonName}")
	public SeedBean viewSeed(@PathVariable("commonName") String commonName) {
		return seedService.viewSeed(commonName);
	}
	
	@GetMapping("/viewseed")
	public List<SeedBean> viewAllSeeds() {
		return seedService.viewAllSeeds();
	}
		
	@GetMapping(path = "/viewseedbytype/{typeOfSeeds}")
	public List<SeedBean> viewAllSeeds(@PathVariable("typeOfSeeds") String typeOfSeeds) {
		return seedService.viewAllSeeds(typeOfSeeds);
	}
}
