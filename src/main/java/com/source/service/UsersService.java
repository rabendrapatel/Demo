package com.source.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.source.enums.Constant;
import com.source.enums.RespStatus;
import com.source.exceptions.BizException;
import com.source.helper.UsersHelper;
import com.source.model.Address;
import com.source.model.Country;
import com.source.model.Users;
import com.source.request.UsersRequest;
import com.source.response.GenricResponse;
import com.source.response.Response;

@Service
public class UsersService {
	
	@Autowired
	private UsersHelper usersHelper;
	
	public UsersRequest registereUser(UsersRequest usersRequest) throws BizException {

		Users existUser = usersHelper.findUserByMobile(usersRequest.getMobile());
		
		if(existUser !=null) {
			throw new BizException("Mobile number already registered", 400); 
		}else {
			Users userdetails = usersHelper.getNewUserDetailsByRequestObj(usersRequest);
			userdetails = usersHelper.saveUserDetails(userdetails);
			
			Address userAddress = usersHelper.getUserAddressByRequestObj(userdetails,usersRequest);
			userAddress = usersHelper.saveUserAddressDetails(userAddress);
		}
		return usersRequest;
	}

	public List<Users> getAllUserList() {
		return usersHelper.getAllUserList();
	}
	
	

}
