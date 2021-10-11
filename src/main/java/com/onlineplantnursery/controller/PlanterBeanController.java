package com.onlineplantnursery.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlineplantnursery.entity.PlanterBean;
import com.onlineplantnursery.service.IPlanterServiceImpl;

@RestController
@RequestMapping("/planterinfo")
public class PlanterBeanController {
	@Autowired
	IPlanterServiceImpl iplanter;

	@PostMapping("/addplanter")
	public PlanterBean addPlanter(@RequestBody PlanterBean planter) {
		return iplanter.addPlanter(planter);
	}
		
	@PutMapping(path = "/updateplanter")
	public PlanterBean updatePlanter(@RequestBody PlanterBean planter) {
		PlanterBean  planters=iplanter.updatePlanter(planter);
		return planters;
	}
		
	@DeleteMapping("/deleteplanter") 
	public PlanterBean deletePlanter(@RequestBody PlanterBean planter) {
		PlanterBean delete=iplanter.deletePlanter(planter);
		return delete;
	}

	@GetMapping("/viewplanterbyid/{planterId}")
	public Optional<PlanterBean> viewPlanter(@PathVariable int planterId) { 
		return Optional.of(iplanter.viewPlanter(planterId)); 
	}
		
	@GetMapping("/viewplanterbyshape/{planterShape}")
	public PlanterBean viewPlanter(@PathVariable("planterShape") String planterShape) {
			return iplanter.viewPlanter(planterShape);
	}
		
	@GetMapping("/viewplanter")
	public List<PlanterBean> viewAllPlanters() {
			return iplanter.viewAllPlanters();
	}
		
	@GetMapping("/viewplanter/{minCost}/{maxCost}")
	public List<PlanterBean> viewAllPlanters(@PathVariable("minCost") int minCost, @PathVariable("maxCost") int maxCost) {
		return iplanter.viewAllPlanters(minCost, maxCost);
	}
}
