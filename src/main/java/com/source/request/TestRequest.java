package com.source.request;

import java.io.Serializable;

public class TestRequest implements Serializable {
	
	private static final long serialVersionUID = 5926468583005150702L;

	private String id;
	private int  totalCount;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	
	
}