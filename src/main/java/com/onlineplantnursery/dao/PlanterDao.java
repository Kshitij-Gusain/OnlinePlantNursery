package com.onlineplantnursery.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.onlineplantnursery.entity.PlanterBean;

@Repository
public interface PlanterDao extends JpaRepository<PlanterBean,Integer> {
	
	@Query("SELECT ud FROM PlanterBean ud  WHERE ud.planterShape=?1")
	PlanterBean viewPlanter(String planterShape);
	
	@Query("SELECT up FROM PlanterBean up WHERE up.planterCost>=?1 AND up.planterCost<=?2 ")
	List<PlanterBean> viewAllPlanters(int minCost, int maxCost);

}