package com.onlineplantnursery.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="admin_table")
public class AdminBean {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer adminId;
    private String adiminUsername;
	private String adminPassword;
	
	public AdminBean() {
		
	}
	
	public AdminBean(int adminId, String adiminUsername, String adminPassword) {
		this.adminId = adminId;
		this.adiminUsername = adiminUsername;
		this.adminPassword = adminPassword;
	}
	
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdiminUsername() {
		return adiminUsername;
	}
	public void setAdiminUsername(String adiminUsername) {
		this.adiminUsername = adiminUsername;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	
	@Override
	public String toString() {
		return "AdminBean [adminId=" + adminId + ", adiminUsername=" + adiminUsername + ", adminPassword="
				+ adminPassword + "]";
	}
	
	
	
	
}
