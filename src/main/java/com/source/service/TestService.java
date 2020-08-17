package com.source.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.source.exceptions.BizException;
import com.source.helper.TestHelper;
import com.source.model.NumberDetails;
import com.source.request.TestRequest;

@Service
public class TestService {
	
	@Autowired
	private TestHelper testHelper;
	
	public synchronized  TestRequest increasenumber() throws BizException {
		TestRequest usersRequest = new TestRequest();
		NumberDetails existCount = testHelper.findExistCountById(1L);
		
		if(existCount !=null) {
			int count = existCount.getCont();
			count=count+1;
			existCount.setCont(count);
			testHelper.updateCount(existCount);
			usersRequest.setTotalCount(existCount.getCont());
		}else {
			NumberDetails newtCount = new NumberDetails();
			newtCount.setCont(1);
			testHelper.updateCount(newtCount);
			usersRequest.setTotalCount(newtCount.getCont());
		}
		return usersRequest;
	}
}
