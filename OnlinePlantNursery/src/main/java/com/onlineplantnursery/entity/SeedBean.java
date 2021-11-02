package com.onlineplantnursery.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seed_table")
public class SeedBean {
	
	    @Id
	    @Column(name="seedid")
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Integer seedId;
		private String commonName;
		private String bloomTime;
		private String watering;
		private String difficultyLevel;
		private String temparature;
		private String typeOfSeeds;
		private String seedsDescription;
		private Integer seedsStock;
		private double seedsCost;
		private Integer seedsPerPacket;
		
		public SeedBean() {
			
		}
		
		public SeedBean(Integer seedId, String commonName, String bloomTime, String watering, String difficultyLevel,
				String temparature, String typeOfSeeds, String seedsDescription, Integer seedsStock, double seedsCost,
				Integer seedsPerPacket) {
			this.seedId = seedId;
			this.commonName = commonName;
			this.bloomTime = bloomTime;
			this.watering = watering;
			this.difficultyLevel = difficultyLevel;
			this.temparature = temparature;
			this.typeOfSeeds = typeOfSeeds;
			this.seedsDescription = seedsDescription;
			this.seedsStock = seedsStock;
			this.seedsCost = seedsCost;
			this.seedsPerPacket = seedsPerPacket;
		}
		
		public Integer getSeedId() {
			return seedId;
		}
		
		public void setSeedId(Integer seedId) {
			this.seedId = seedId;
		}
		
		public String getCommonName() {
			return commonName;
		}
		
		public void setCommonName(String commonName) {
			this.commonName = commonName;
		}
		
		public String getBloomTime() {
			return bloomTime;
		}
		
		public void setBloomTime(String bloomTime) {
			this.bloomTime = bloomTime;
		}
		
		public String getWatering() {
			return watering;
		}
		
		public void setWatering(String watering) {
			this.watering = watering;
		}
		
		public String getDifficultyLevel() {
			return difficultyLevel;
		}
		
		public void setDifficultyLevel(String difficultyLevel) {
			this.difficultyLevel = difficultyLevel;
		}
		
		public String getTemparature() {
			return temparature;
		}
		
		public void setTemparature(String temparature) {
			this.temparature = temparature;
		}
		
		public String getTypeOfSeeds() {
			return typeOfSeeds;
		}
		
		public void setTypeOfSeeds(String typeOfSeeds) {
			this.typeOfSeeds = typeOfSeeds;
		}
		
		public String getSeedsDescription() {
			return seedsDescription;
		}
		
		public void setSeedsDescription(String seedsDescription) {
			this.seedsDescription = seedsDescription;
		}
		
		public Integer getSeedsStock() {
			return seedsStock;
		}
		
		public void setSeedsStock(Integer seedsStock) {
			this.seedsStock = seedsStock;
		}
		
		public double getSeedsCost() {
			return seedsCost;
		}
		
		public void setSeedsCost(double seedsCost) {
			this.seedsCost = seedsCost;
		}
		
		public Integer getSeedsPerPacket() {
			return seedsPerPacket;
		}
		
		public void setSeedsPerPacket(Integer seedsPerPacket) {
			this.seedsPerPacket = seedsPerPacket;
		}
		
		@Override
		public String toString() {
			return "Seed [seedId=" + seedId + ", commonName=" + commonName + ", bloomTime=" + bloomTime + ", watering="
					+ watering + ", difficultyLevel=" + difficultyLevel + ", temparature=" + temparature
					+ ", typeOfSeeds=" + typeOfSeeds + ", seedsDescription=" + seedsDescription + ", seedsStock="
					+ seedsStock + ", seedsCost=" + seedsCost + ", seedsPerPacket=" + seedsPerPacket + "]";
		}
		
	}

