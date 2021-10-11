package com.onlineplantnursery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlineplantnursery.entity.OrderBean;
import com.onlineplantnursery.service.IOrderServiceImpl;

@RestController
@RequestMapping("/orderinfo")
public class OrderBeanController {
	
	@Autowired
	IOrderServiceImpl service;
		
	@PostMapping("/addorder")
	public OrderBean addOrder(@RequestBody OrderBean order) {
		return service.addOrder(order);
	}
	
	@PutMapping("/updateorder")
	public OrderBean updateOrder(@RequestBody OrderBean order) {
		OrderBean  cust=service.updateOrder(order);
		return cust;
	}

	@DeleteMapping("/deleteorder/{orderId}")
	public String deleteOrder(@PathVariable int orderId){
			 service.deleteOrder(orderId);
			 return " Order deleted sucessfully";
	}
		
	@GetMapping("/vieworder/{orderId}")
	public OrderBean viewOrderById(@PathVariable("orderId") Integer id) {
		OrderBean order= service.viewOrder(id);
		return order;
	}
		
	@GetMapping("/vieworder")
	public Iterable<OrderBean> viewAllOrder(){
		Iterable<OrderBean> orderList= service.viewAllOrders();
		return orderList;
	}
}
