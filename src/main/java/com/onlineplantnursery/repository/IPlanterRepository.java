package com.onlineplantnursery.repository;

import java.util.List;

import com.onlineplantnursery.entity.PlanterBean;

public interface IPlanterRepository {
	PlanterBean addPlanter(PlanterBean planter);
	PlanterBean updatePlanter(PlanterBean planter);
	PlanterBean deletePlanter(PlanterBean Planter);
	PlanterBean viewPlanter(int planterId);
	PlanterBean viewPlanter(String planterShape);
	List<PlanterBean> viewAllPlanters();
	List<PlanterBean> viewAllPlanters(int minCost, int maxCost);
}
