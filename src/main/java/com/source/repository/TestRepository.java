package com.source.repository;
import com.source.model.NumberDetails;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TestRepository extends JpaRepository<NumberDetails, Integer> {
   	NumberDetails findCountById(long i);
}