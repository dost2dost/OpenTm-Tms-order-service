package com.openport.opentm.order.microservice.response;

public interface ResponseCode {
	public static final int SUCCESS = 200;
	public static final int FAILURE = 400;
	public static final int UNAUTHORIZED = 401;
	public static final int TOKEN_EXPIRED = 402;
	public static final int DATA_NOT_FOUND = 404;
	public static final int KEY_NOT_FOUND = 405;
	public static final int STATUS_ALREADY_REGISTERED = 406;
	public static final int NOT_ACTIVE = 407;
	public static final int NOT_FOUND = 408;
	
	public static final int ERR_CODE_USER_ALREADY_EXISTS = 409;
	public static final int ERR_CODE_EMAIL_ALREADY_EXISTS = 410;
	public static final int ERR_CODE_USER_NOT_EXIST = 411;
	public static final int ERR_CODE_USER_IS_INACTIVE = 412;
	public static final int ERR_CODE_INVALID_PASS = 413;
	public static final int ERR_CODE_REQUIRED_FIELDS_EMPTY = 414;

}
