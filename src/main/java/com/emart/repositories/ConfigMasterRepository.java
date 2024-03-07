package com.emart.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emart.entities.ConfigMaster;

import jakarta.transaction.Transactional;
@Repository
@Transactional
public interface ConfigMasterRepository extends JpaRepository<ConfigMaster, Integer> 
{
	
}
