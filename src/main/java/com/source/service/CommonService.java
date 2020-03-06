package com.source.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.source.helper.CommonHelper;
import com.source.model.AddressType;
import com.source.model.Cities;
import com.source.model.Country;
import com.source.model.State;
import com.source.model.UsersRoleType;
import com.source.model.UsersStatusType;


@Service
public class CommonService {

	@Autowired
	private CommonHelper commonHelper;
	
	public List<Country> findAllCountries(){
		return commonHelper.findAllCountries();
	}
	
	public List<State> getAllStateByCountryId(Long countryId){
		return commonHelper.getAllStateByCountryId(countryId);
	}
	
	public List<Cities> getAllCityByStateId(Long stateId){
		return commonHelper.getAllCityByStateId(stateId);
	}
	
	public List<AddressType> getAllAddressType(){
		return commonHelper.getAllAddressType();
	}
	
	public List<UsersRoleType> getAllUserRole(){
		return commonHelper.getAllUserRole();
	}
	
	public List<UsersStatusType> getAllUserStatusType(){
		return commonHelper.getAllUserStatusType();
	}
}
