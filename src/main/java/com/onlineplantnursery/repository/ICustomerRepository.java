package com.onlineplantnursery.repository;

import java.util.List;

import com.onlineplantnursery.entity.CustomerBean;

public interface ICustomerRepository {
	public CustomerBean addCustomer(CustomerBean customer);
	public CustomerBean updateCustomer(CustomerBean tenant);
	public CustomerBean viewCustomer(int customerId);
	public CustomerBean deleteCustomer(CustomerBean tenant);
	public List<CustomerBean> viewAllCustomers();
	public CustomerBean validateCustomer(String userName,String password);
}
