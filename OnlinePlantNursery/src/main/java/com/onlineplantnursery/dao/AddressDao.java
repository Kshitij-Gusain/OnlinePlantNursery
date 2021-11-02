package com.onlineplantnursery.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlineplantnursery.entity.AddressBean;

@Repository
public interface AddressDao extends JpaRepository<AddressBean, Integer> {

}
