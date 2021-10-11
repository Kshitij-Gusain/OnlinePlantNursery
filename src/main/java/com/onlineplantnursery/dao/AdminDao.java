package com.onlineplantnursery.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlineplantnursery.entity.AdminBean;

@Repository
public interface AdminDao extends JpaRepository<AdminBean, Integer> {

}
