package com.source.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.source.model.Cities;

@Repository
public interface CitiesRepository extends JpaRepository<Cities, Long> {
	 List<Cities> findAllCityByStateId(Long stateId);
}
