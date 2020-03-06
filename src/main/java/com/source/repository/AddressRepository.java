package com.source.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.source.model.Address;
import com.source.model.AddressType;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
	 
}
