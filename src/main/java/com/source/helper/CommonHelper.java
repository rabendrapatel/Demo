package com.source.helper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.source.model.AddressType;
import com.source.model.Cities;
import com.source.model.Country;
import com.source.model.State;
import com.source.model.UsersRoleType;
import com.source.model.UsersStatusType;
import com.source.repository.AddressTypeRepository;
import com.source.repository.CitiesRepository;
import com.source.repository.CountryRepository;
import com.source.repository.StateRepository;
import com.source.repository.UserRoleRepository;
import com.source.repository.UserStatusRepository;

@Component
public class CommonHelper {
	
	@Autowired
	private CountryRepository countryRepository;
	
	@Autowired
	private StateRepository stateRepository;
	
	@Autowired
	private CitiesRepository citiesRepository;
	
	@Autowired
	private AddressTypeRepository addressTypeRepository;
	
	@Autowired
	private UserRoleRepository userRoleRepository;
	
	@Autowired
	private UserStatusRepository userStatusRepository;

	public List<Country>findAllCountries() {
		return countryRepository.findAll();
	}
	
	public List<State>getAllStateByCountryId(Long countryId) {
		return stateRepository.findAllStateByCountryId(countryId);
	}
	
	public List<Cities>getAllCityByStateId(Long stateId) {
		return citiesRepository.findAllCityByStateId(stateId);
	}
	
	public List<AddressType>getAllAddressType() {
		return addressTypeRepository.findAll();
	}
	
	public List<UsersRoleType>getAllUserRole() {
		return userRoleRepository.findAll();
	}
	
	public List<UsersStatusType>getAllUserStatusType() {
		return userStatusRepository.findAll();
	}
}
