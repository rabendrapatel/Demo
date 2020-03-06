package com.source.response;

import java.util.List;

public class GenricResponse <T>{
	public Response<T> createSuccessResponse( T responseObject ,String respMessage,Integer respCode,String status){
        Response<T> response = new Response();
        response.setPayload(responseObject);
        response.setRespMessage(respMessage);
        response.setRespCode(respCode);
        response.setStatus(status);
        return  response;
    }
	
	
	public Response<T> createListResponse( List<T> responseObject ,String respMessage,Integer respCode,String status){
        Response<T> response = new Response();
        response.setListPayload(responseObject);
        response.setRespMessage(respMessage);
        response.setRespCode(respCode);
        response.setStatus(status);
        return  response;
    }
	

    public  Response<T> createErrorResponse(String respMessage,Integer errorCode,String status) {
        Response response = new Response();
        response.setRespMessage(respMessage);
        response.setRespCode(errorCode);
        response.setStatus(status);
        return response;
    }

}
