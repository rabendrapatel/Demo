package com.source.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.source.enums.RespStatus;
import com.source.exceptions.BizException;
import com.source.request.TestRequest;
import com.source.response.GenricResponse;
import com.source.response.Response;
import com.source.service.TestService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class TestController {
		
	@Autowired
	private TestService testService;
	
	public int  count=0;
	@RequestMapping(path = "/increasenumber", method = RequestMethod.GET)
	public Response<TestRequest> increasenumber() {
		GenricResponse<TestRequest> response = new GenricResponse<TestRequest>();
		try {
			TestRequest responce = testService.increasenumber();
			return response.createSuccessResponse(responce, "Successfully", 200, RespStatus.Success.name());
		} catch (BizException e) {
			return response.createErrorResponse(e.getMessage(), e.getErrorCode(), RespStatus.Failure.name());
		}catch (Exception e) {
			e.printStackTrace();
			return response.createErrorResponse(e.getMessage(), 500, RespStatus.Failure.name());
		}
	}
}
