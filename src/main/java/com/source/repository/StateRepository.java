package com.source.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.source.model.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {	 
	 List<State>  findAllStateByCountryId(Long countryId);
}
