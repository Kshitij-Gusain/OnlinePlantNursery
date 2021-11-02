package com.onlineplantnursery.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="planter_table")
public class PlanterBean {
	
	@Id
    @Column(name="planterid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer planterId;
	private float planterheight;
	private int planterCapacity;
	private int drinageHoles;
	private int planterColor;
	private String planterShape;
	private int planterStock;
	private int planterCost;
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="plantid")
	PlantBean plants;
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="seedid")
	SeedBean seeds;
	
	public PlanterBean() {

	}
	public PlanterBean(Integer planterId, float planterheight, int planterCapacity, int drinageHoles, int planterColor,
			String planterShape, int planterStock, int planterCost, PlantBean plants, SeedBean seeds) {
		this.planterId = planterId;
		this.planterheight = planterheight;
		this.planterCapacity = planterCapacity;
		this.drinageHoles = drinageHoles;
		this.planterColor = planterColor;
		this.planterShape = planterShape;
		this.planterStock = planterStock;
		this.planterCost = planterCost;
		this.plants = plants;
		this.seeds = seeds;
	}
	
	public  Integer getPlanterId() {
		return planterId;
	}
	
	public void setPlanterId(Integer planterId) {
		this.planterId = planterId;
	}
	
	public float getPlanterheight() {
		return planterheight;
	}
	
	public void setPlanterheight(float planterheight) {
		this.planterheight = planterheight;
	}
	
	public int getPlanterCapacity() {
		return planterCapacity;
	}
	
	public void setPlanterCapacity(int planterCapacity) {
		this.planterCapacity = planterCapacity;
	}
	
	public int getDrinageHoles() {
		return drinageHoles;
	}
	
	public void setDrinageHoles(int drinageHoles) {
		this.drinageHoles = drinageHoles;
	}
	
	public int getPlanterColor() {
		return planterColor;
	}
	
	public void setPlanterColor(int planterColor) {
		this.planterColor = planterColor;
	}
	
	public String getPlanterShape() {
		return planterShape;
	}
	
	public void setPlanterShape(String planterShape) {
		this.planterShape = planterShape;
	}
	
	public int getPlanterStock() {
		return planterStock;
	}
	
	public void setPlanterStock(int planterStock) {
		this.planterStock = planterStock;
	}
	
	public int getPlanterCost() {
		return planterCost;
	}
	
	public void setPlanterCost(int planterCost) {
		this.planterCost = planterCost;
	}
	
	public PlantBean getPlants() {
		return plants;
	}
	
	public void setPlants(PlantBean plants) {
		this.plants = plants;
	}
	
	public SeedBean getSeeds() {
		return seeds;
	}
	
	public void setSeeds(SeedBean seeds) {
		this.seeds = seeds;
	}
	
	@Override
	public String toString() {
		return "PlanterBean [planterId=" + planterId + ", planterheight=" + planterheight + ", planterCapacity="
				+ planterCapacity + ", drinageHoles=" + drinageHoles + ", planterColor=" + planterColor
				+ ", planterShape=" + planterShape + ", planterStock=" + planterStock + ", planterCost=" + planterCost
				+ ", plants=" + plants + ", seeds=" + seeds + "]";
	}
	
	
	
}
