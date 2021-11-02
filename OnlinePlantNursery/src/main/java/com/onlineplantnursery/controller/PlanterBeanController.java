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
	IPlanterServiceImpl planterService;

	@PostMapping("/addplanter")
	public PlanterBean addPlanter(@RequestBody PlanterBean planter) {
		return planterService.addPlanter(planter);
	}
		
	@PutMapping(path = "/updateplanter")
	public PlanterBean updatePlanter(@RequestBody PlanterBean planter) {
		PlanterBean  planters=planterService.updatePlanter(planter);
		return planters;
	}
		
	@DeleteMapping("/deleteplanter") 
	public PlanterBean deletePlanter(@RequestBody PlanterBean planter) {
		PlanterBean delete=planterService.deletePlanter(planter);
		return delete;
	}

	@GetMapping("/viewplanterbyid/{planterId}")
	public Optional<PlanterBean> viewPlanter(@PathVariable int planterId) { 
		return Optional.of(planterService.viewPlanter(planterId)); 
	}
		
	@GetMapping("/viewplanterbyshape/{planterShape}")
	public PlanterBean viewPlanter(@PathVariable("planterShape") String planterShape) {
			return planterService.viewPlanter(planterShape);
	}
		
	@GetMapping("/viewplanter")
	public List<PlanterBean> viewAllPlanters() {
			return planterService.viewAllPlanters();
	}
		
	@GetMapping("/viewplanter/{minCost}/{maxCost}")
	public List<PlanterBean> viewAllPlanters(@PathVariable("minCost") int minCost, @PathVariable("maxCost") int maxCost) {
		return planterService.viewAllPlanters(minCost, maxCost);
	}
}
