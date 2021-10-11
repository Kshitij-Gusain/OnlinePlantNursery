package com.onlineplantnursery.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineplantnursery.dao.PlanterDao;
import com.onlineplantnursery.entity.PlanterBean;
import com.onlineplantnursery.repository.IPlanterRepository;

@Service
public class IPlanterServiceImpl implements IPlanterRepository {
	
	@Autowired
	PlanterDao dao3;
	
	public PlanterBean addPlanter(PlanterBean planter) {
			PlanterBean result = dao3.save(planter);
			return result;
	}
	
	public PlanterBean updatePlanter(PlanterBean planter) {
		PlanterBean result = dao3.save(planter);
		return result;
	}

	public PlanterBean deletePlanter(PlanterBean planter) {
		PlanterBean result = dao3.findById(planter.getPlanterId()).get();
		dao3.deleteById(planter.getPlanterId());
		return result;
	}
	
	public PlanterBean viewPlanter(int planterId) { 
		Optional<PlanterBean> viewPr = dao3.findById(planterId);
		return viewPr.get();
	}

	public PlanterBean viewPlanter(String planterShape) {
		return dao3.viewPlanter(planterShape);
	}

	public List<PlanterBean> viewAllPlanters() {
		return dao3.findAll();
	}

	public List<PlanterBean> viewAllPlanters(int minCost, int maxCost) {
		return dao3.viewAllPlanters(minCost, maxCost);
	}
}
