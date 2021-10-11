package com.onlineplantnursery.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.onlineplantnursery.entity.CustomerBean;


@Repository
public interface CustomerDao extends JpaRepository<CustomerBean, Integer> {
	
	@Query("SELECT ud FROM CustomerBean ud WHERE ud.username=?1 AND ud.password=?2 ")
	Optional<CustomerBean> validateCustomer(String userName, String password);

}