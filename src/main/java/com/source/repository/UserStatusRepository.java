package com.source.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.source.model.UsersStatusType;

@Repository
public interface UserStatusRepository extends JpaRepository<UsersStatusType, Long> {
	 
}
