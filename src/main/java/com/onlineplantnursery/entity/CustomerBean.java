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
@Table(name="customer_table")
public class CustomerBean {
	
	@Id
	@Column(name="customerid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer customerId;
	private String customerEmail;
	private String customerName;
	private String username;
	private String password;
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="addressId")
	AddressBean address;
	
	public CustomerBean() {

	}

	public CustomerBean(Integer customerId, String customerEmail, String customerName, String username, String password,
			AddressBean address) {
		this.customerId = customerId;
		this.customerEmail = customerEmail;
		this.customerName = customerName;
		this.username = username;
		this.password = password;
		this.address = address;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AddressBean getAddress() {
		return address;
	}

	public void setAddress(AddressBean address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "CustomerBean [customerId=" + customerId + ", customerEmail=" + customerEmail + ", customerName="
				+ customerName + ", username=" + username + ", password=" + password + ", address=" + address + "]";
	}
	
}
