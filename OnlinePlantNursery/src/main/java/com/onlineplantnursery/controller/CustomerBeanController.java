package com.onlineplantnursery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlineplantnursery.entity.CustomerBean;
import com.onlineplantnursery.service.ICustomerServiceImpl;

@RestController
@RequestMapping("/customerinfo")
public class CustomerBeanController {
	
	@Autowired
	private ICustomerServiceImpl customerService;
		
	@PostMapping("/addcustomer" )
	public CustomerBean addCustomer(@RequestBody CustomerBean customer) {
		return customerService.addCustomer(customer);	
	}
		 
	@PutMapping("/updatecustomer")
	public  CustomerBean updateCustomer(@RequestBody CustomerBean tenant) {
		CustomerBean  cust=customerService.updateCustomer(tenant);
		return cust;		
	}

	@GetMapping("/viewcustomer/{customerId}" )
	public CustomerBean viewCustomer(@PathVariable int customerId) {
		return (customerService.viewCustomer(customerId));	
	}
			
	@DeleteMapping("/deletecustomer" )
	public CustomerBean deleteCustomer(@RequestBody CustomerBean tenant1) {
		CustomerBean cust=customerService.deleteCustomer(tenant1);
		return cust;
				
	}

	@GetMapping("/viewcustomer")
	public List<CustomerBean> viewAllCustomers( ){
				return customerService.viewAllCustomers();
	}
	
	@GetMapping("/validate/{userName}/{password}")
	public CustomerBean validateCustomer(@PathVariable String userName, @PathVariable String password) {
			return (customerService.validateCustomer(userName, password));
	}
}
