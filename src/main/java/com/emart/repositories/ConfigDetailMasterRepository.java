package com.emart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emart.entities.ConfigDetailMaster;

import jakarta.transaction.Transactional;
@Repository
@Transactional
public interface ConfigDetailMasterRepository extends JpaRepository<ConfigDetailMaster, Integer> {

}
