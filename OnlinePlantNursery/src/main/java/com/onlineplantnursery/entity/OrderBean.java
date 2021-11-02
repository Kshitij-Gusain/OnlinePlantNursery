package com.onlineplantnursery.entity;

import java.time.LocalDate;

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
@Table(name="order_table")
public class OrderBean {
	
	@Id
	@Column(name="orderid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer bookingOrderId;
	private LocalDate orderDate;
	private String transactionMode;
	private Integer quantity;
	private double totalCost;
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="planterid")
	PlanterBean planters ;
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="customerid")
	CustomerBean customers ;
	
	public OrderBean() {
		
	}

	public OrderBean(Integer bookingOrderId, LocalDate orderDate, String transactionMode, Integer quantity,
			double totalCost, PlanterBean planters) {
		this.bookingOrderId = bookingOrderId;
		this.orderDate = orderDate;
		this.transactionMode = transactionMode;
		this.quantity = quantity;
		this.totalCost = totalCost;
		this.planters = planters;
	}

	public Integer getBookingOrderId() {
		return bookingOrderId;
	}

	public void setBookingOrderId(Integer bookingOrderId) {
		this.bookingOrderId = bookingOrderId;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public String getTransactionMode() {
		return transactionMode;
	}

	public void setTransactionMode(String transactionMode) {
		this.transactionMode = transactionMode;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public PlanterBean getPlanters() {
		return planters;
	}

	public void setPlanters(PlanterBean planters) {
		this.planters = planters;
	}

	@Override
	public String toString() {
		return "OrderBean [bookingOrderId=" + bookingOrderId + ", orderDate=" + orderDate + ", transactionMode="
				+ transactionMode + ", quantity=" + quantity + ", totalCost=" + totalCost + ", planters=" + planters
				+ "]";
	}
	
}
