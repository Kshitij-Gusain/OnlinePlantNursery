package com.onlineplantnursery.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlineplantnursery.entity.OrderBean;

@Repository
public interface OrderDao extends JpaRepository<OrderBean, Integer> {

}
