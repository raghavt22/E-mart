package com.emart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emart.entities.OrderMaster;

public interface OrderMasterRepository  extends JpaRepository <OrderMaster,Integer>{
	
}
