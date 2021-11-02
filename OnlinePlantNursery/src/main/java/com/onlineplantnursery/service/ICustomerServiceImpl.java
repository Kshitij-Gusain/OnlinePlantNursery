package com.onlineplantnursery.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineplantnursery.dao.CustomerDao;
import com.onlineplantnursery.entity.CustomerBean;
import com.onlineplantnursery.repository.ICustomerRepository;

@Service
public class ICustomerServiceImpl implements ICustomerRepository {
	
	@Autowired
	CustomerDao dao1;
	
	public CustomerBean addCustomer(CustomerBean customer) {
		CustomerBean result = dao1.save(customer);
		return result;
	}
	
	public CustomerBean updateCustomer(CustomerBean tenant) {
		CustomerBean result = dao1.save(tenant);
		return result;
	}
	
	public CustomerBean viewCustomer(int customerId) {
		Optional<CustomerBean> viewC = dao1.findById(customerId);
		return viewC.get();
	}
   
	public CustomerBean deleteCustomer(CustomerBean tenant) {
		CustomerBean result = dao1.findById(tenant.getCustomerId()).get();
		dao1.deleteById(tenant.getCustomerId());
		return result;
	}
   
	public List<CustomerBean> viewAllCustomers() {
		return dao1.findAll();
	}
	
	public CustomerBean validateCustomer(String userName, String password)  {
		Optional<CustomerBean> valCust = dao1.validateCustomer(userName,password);
		return valCust.get();
	}	
}
