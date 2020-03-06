package com.source.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.source.enums.Constant;
import com.source.enums.RespStatus;
import com.source.model.AddressType;
import com.source.model.Cities;
import com.source.model.Country;
import com.source.model.State;
import com.source.model.UsersRoleType;
import com.source.model.UsersStatusType;
import com.source.response.GenricResponse;
import com.source.response.Response;
import com.source.service.CommonService;

@RestController
@RequestMapping("/common")
public class CommonController {
		
	@Autowired
	private CommonService commonService;
	
	@RequestMapping(path = "getAllCountries", method = RequestMethod.GET)
    public Response<Country> getAllCountries() {
		GenricResponse<Country> response = new GenricResponse<Country>();
		try {
			List<Country> countryList =  commonService.findAllCountries();
			return response.createListResponse(countryList, Constant.ListFetchSuccess, 200, RespStatus.Success.name());
		} catch (Exception e) {
			return response.createErrorResponse(e.getMessage(), 500, RespStatus.Failure.name());
		}
    }
	
	
	@RequestMapping(path = "getAllStateByCountryId", method = RequestMethod.GET)
    public Response<State> getAllStateByCountryId(@RequestParam(value = "id") Long countryId) {
		 GenricResponse<State> response = new GenricResponse<State>();
		 try {
			List<State> stateList =  commonService.getAllStateByCountryId(countryId);
			return response.createListResponse(stateList, Constant.ListFetchSuccess, 200, RespStatus.Success.name());
		 } catch (Exception e) {
			return response.createErrorResponse(e.getMessage(), 500, RespStatus.Failure.name());
		 }
    }

	
	@RequestMapping(path = "getAllCityByStateId", method = RequestMethod.GET)
    public Response<Cities> getAllCityByStateId(@RequestParam(value = "id") Long stateId) { 
		 GenricResponse<Cities> response = new GenricResponse<Cities>();
		 try {
			List<Cities> cityList =  commonService.getAllCityByStateId(stateId);
			return response.createListResponse(cityList, Constant.ListFetchSuccess, 200, RespStatus.Success.name());
		 } catch (Exception e) {
			return response.createErrorResponse(e.getMessage(), 500, RespStatus.Failure.name());
		 }
    }
	
	
	@RequestMapping(path = "getAllAddressType", method = RequestMethod.GET)
    public Response<AddressType> getAllAddressType() {
		GenricResponse<AddressType> response = new GenricResponse<AddressType>();
		try {
			List<AddressType> reusltList =  commonService.getAllAddressType();
			return response.createListResponse(reusltList, Constant.ListFetchSuccess, 200, RespStatus.Success.name());
		} catch (Exception e) {
			return response.createErrorResponse(e.getMessage(), 500, RespStatus.Failure.name());
		}
    }
	
	@RequestMapping(path = "getAllUserRole", method = RequestMethod.GET)
    public Response<UsersRoleType> getAllUserRole() {
		GenricResponse<UsersRoleType> response = new GenricResponse<UsersRoleType>();
		try {
			List<UsersRoleType> reusltList =  commonService.getAllUserRole();
			return response.createListResponse(reusltList, Constant.ListFetchSuccess, 200, RespStatus.Success.name());
		} catch (Exception e) {
			return response.createErrorResponse(e.getMessage(), 500, RespStatus.Failure.name());
		}
    }
	
	
	@RequestMapping(path = "getAllUserStatusType", method = RequestMethod.GET)
    public Response<UsersStatusType> getAllUserStatusType() {
		GenricResponse<UsersStatusType> response = new GenricResponse<UsersStatusType>();
		try {
			List<UsersStatusType> reusltList =  commonService.getAllUserStatusType();
			return response.createListResponse(reusltList, Constant.ListFetchSuccess, 200, RespStatus.Success.name());
		} catch (Exception e) {
			return response.createErrorResponse(e.getMessage(), 500, RespStatus.Failure.name());
		}
    }
	
	
}
