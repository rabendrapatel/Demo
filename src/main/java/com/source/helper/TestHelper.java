package com.source.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.source.model.NumberDetails;
import com.source.repository.TestRepository;

@Component
public class TestHelper {

	@Autowired
	private TestRepository testRepository;

	public NumberDetails findExistCountById(long i) {
		return testRepository.findCountById(i);
	}

	public void updateCount(NumberDetails existCount) {
		testRepository.save(existCount);
	}
}
