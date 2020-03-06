package com.source.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Response<T> implements Serializable {

    private T payload;
    private List<T> listPayload;
    
    private int respCode;
    private String respMessage;
    private String status;
    private String comments;
    private Throwable throwable;
    
    
	public T getPayload() {
		return payload;
	}
	public void setPayload(T payload) {
		this.payload = payload;
	}
	public List<T> getListPayload() {
		return listPayload;
	}
	public void setListPayload(List<T> listPayload) {
		this.listPayload = listPayload;
	}
	public int getRespCode() {
		return respCode;
	}
	public void setRespCode(int respCode) {
		this.respCode = respCode;
	}
	public String getRespMessage() {
		return respMessage;
	}
	public void setRespMessage(String respMessage) {
		this.respMessage = respMessage;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Throwable getThrowable() {
		return throwable;
	}
	public void setThrowable(Throwable throwable) {
		this.throwable = throwable;
	}
	
	
}
