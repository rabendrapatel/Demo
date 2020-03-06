package com.source.repository;
import com.source.model.Users;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<Users, Integer> {
    Users findByUserName(String userName);
	Users findByMobile(String mobile);
	
//	@Query(value = "Select user.id from user", nativeQuery = true)

    @Query("SELECT u FROM Users u") 
    List<Users> findAllUserDetails();
}