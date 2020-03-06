package com.source.helper;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.source.model.Address;
import com.source.model.AddressType;
import com.source.model.Cities;
import com.source.model.Country;
import com.source.model.State;
import com.source.model.Users;
import com.source.model.UsersRoleType;
import com.source.model.UsersStatusType;
import com.source.repository.AddressRepository;
import com.source.repository.UserRepository;
import com.source.request.UsersRequest;

@Component
public class UsersHelper {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private PasswordEncoder bcryptEncoder;

	public Users findUserByMobile(String mobile) {
		Users users = userRepository.findByMobile(mobile);
		return users;
	}

	public Users getNewUserDetailsByRequestObj(UsersRequest usersRequest) {
		Users newUser = new Users();
		BeanUtils.copyProperties(usersRequest, newUser);
		newUser.setPassword(bcryptEncoder.encode(usersRequest.getPassword()));
		newUser.setUsersRoleType(new UsersRoleType(usersRequest.getUserRole()));
		newUser.setUsersStatusType(new UsersStatusType(usersRequest.getUserStatus()));
		return newUser;
	}

	public Users saveUserDetails(Users userdetails) {
		return userRepository.save(userdetails);
	}

	public Address getUserAddressByRequestObj(Users userdetails, UsersRequest usersRequest) {
		Address newAddress = new Address();
		BeanUtils.copyProperties(usersRequest, newAddress);
		newAddress.setUserId(userdetails.getId());
		newAddress.setAddressType(new AddressType(usersRequest.getAddressType()));
		newAddress.setCountry(new Country(usersRequest.getCountry()));
		newAddress.setState(new State(usersRequest.getState()));
		newAddress.setCity(new Cities(usersRequest.getCity()));
		return newAddress;
	}

	public Address saveUserAddressDetails(Address userAddress) {
		return addressRepository.save(userAddress);
	}

	public List<Users> getAllUserList() {
		return userRepository.findAllUserDetails();
	}
}
