package com.source.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.source.enums.Constant;
import com.source.enums.RespStatus;
import com.source.exceptions.BizException;
import com.source.model.Users;
import com.source.request.UsersRequest;
import com.source.response.GenricResponse;
import com.source.response.Response;
import com.source.service.UsersService;

@RestController
@RequestMapping("/users")
public class UsersController {
		
	@Autowired
	private UsersService usersService;
	
	@RequestMapping(path = "/register", method = RequestMethod.POST)
	public Response<UsersRequest> getAllCountries(@RequestBody UsersRequest usersRequest) {
		GenricResponse<UsersRequest> response = new GenricResponse<UsersRequest>();
		try {
			UsersRequest responce = usersService.registereUser(usersRequest);
			return response.createSuccessResponse(responce, "Registration completed sucessfully", 200,
					RespStatus.Success.name());
		} catch (BizException e) {
			return response.createErrorResponse(e.getMessage(), e.getErrorCode(), RespStatus.Failure.name());
		}catch (Exception e) {
			e.printStackTrace();
			return response.createErrorResponse(e.getMessage(), 500, RespStatus.Failure.name());
		}
	}
	
	
	@RequestMapping(path = "getAllUserList", method = RequestMethod.GET)
    public Response<Users> getAllUserList() {
		GenricResponse<Users> response = new GenricResponse<Users>();
		try {
			List<Users> resultList =  usersService.getAllUserList();
			return response.createListResponse(resultList, Constant.ListFetchSuccess, 200, RespStatus.Success.name());
		} catch (Exception e) {
			return response.createErrorResponse(e.getMessage(), 500, RespStatus.Failure.name());
		}
    }

}
