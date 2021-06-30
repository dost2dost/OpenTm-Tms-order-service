package com.openport.opentm.order.microservice.response;

import java.util.HashMap;
import java.util.Map;

public class ResponseCodeMapper {
	private static final Map<Integer, String> mapper;
    static {
        mapper = new HashMap<Integer, String>();
        mapper.put(ResponseCode.SUCCESS, ResponseDesc.SUCCESS);
        mapper.put(ResponseCode.FAILURE, ResponseDesc.FAILURE);
        mapper.put(ResponseCode.DATA_NOT_FOUND, ResponseDesc.DATA_NOT_FOUND);
        mapper.put(ResponseCode.KEY_NOT_FOUND, ResponseDesc.KEY_NOT_FOUND);
        mapper.put(ResponseCode.STATUS_ALREADY_REGISTERED, ResponseDesc.STATUS_ALREADY_REGISTERED);
        mapper.put(ResponseCode.NOT_ACTIVE, ResponseDesc.NOT_ACTIVE);
        mapper.put(ResponseCode.ERR_CODE_USER_ALREADY_EXISTS, ResponseDesc.ERR_DESC_USER_ALREADY_EXISTS);
        mapper.put(ResponseCode.ERR_CODE_EMAIL_ALREADY_EXISTS, ResponseDesc.ERR_DESC_EMAIL_ALREADY_EXISTS);
        mapper.put(ResponseCode.ERR_CODE_USER_NOT_EXIST, ResponseDesc.ERR_DESC_USER_NOT_EXIST);
        mapper.put(ResponseCode.ERR_CODE_USER_IS_INACTIVE, ResponseDesc.ERR_DESC_USER_IS_INACTIVE);
        mapper.put(ResponseCode.ERR_CODE_INVALID_PASS, ResponseDesc.ERR_DESC_INVALID_PASS);
        mapper.put(ResponseCode.ERR_CODE_REQUIRED_FIELDS_EMPTY, ResponseDesc.ERR_DESC_REQUIRED_FIELDS_EMPTY);
    }
    
    public static Map<Integer, String> map() {
        return mapper;
    }

}
