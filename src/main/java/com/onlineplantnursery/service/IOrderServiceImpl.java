package com.onlineplantnursery.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineplantnursery.dao.OrderDao;
import com.onlineplantnursery.entity.OrderBean;
import com.onlineplantnursery.repository.IOrderRepository;

@Service
public class IOrderServiceImpl implements IOrderRepository {
	
	@Autowired
	OrderDao dao2;
     
	public OrderBean addOrder(OrderBean order) {
		OrderBean result = dao2.save(order);
		return result;	
	}
	
	public OrderBean updateOrder(OrderBean order) {
		OrderBean result = dao2.save(order);
		return result;
	}
   
	public OrderBean deleteOrder(int orderId) {
		OrderBean result = dao2.findById(orderId).get();
		dao2.deleteById(orderId);
		return result;
	}
	
	public OrderBean viewOrder(int orderId){
		Optional<OrderBean> viewO = dao2.findById(orderId);
		return viewO.get();
	}
	
	public List<OrderBean> viewAllOrders() {
		return dao2.findAll();
	}
}
