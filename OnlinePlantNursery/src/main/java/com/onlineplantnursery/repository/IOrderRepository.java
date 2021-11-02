package com.onlineplantnursery.repository;

import java.util.List;

import com.onlineplantnursery.entity.OrderBean;

public interface IOrderRepository {
	public OrderBean addOrder(OrderBean order);
	public OrderBean updateOrder(OrderBean order); 
	public OrderBean deleteOrder(int orderid);	  
	public OrderBean viewOrder(int orderid);	
	public List<OrderBean> viewAllOrders();
}
