package com.openport.opentm.order.microservice.response;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ServiceResponse {
	private final static Logger logger = Logger.getLogger(ServiceResponse.class);

	public ServiceResponse() {
	}

	private static final long serialVersionUID = 1L;
	private int code;
	private String message;
	private Object data;

	private void logResponse() {
		try {
			GsonBuilder b = new GsonBuilder();
			Gson gson = b.setPrettyPrinting().create();
			logger.info(String.format("Code: %1$s , Message: %2$s , Data: %3$s ", code, message, gson.toJson(data)));
		} catch (Exception ex) {
			logError(ex);
		}
	}

	private void logError(Exception ex) {
		logger.error(ex.toString(), ex);
	}

	public static void logRequest(Object data) {
		logger.info("request=" + (data != null ? new Gson().toJson(data) : null));
	}

	// Function is used to set the exception need to refactor it.
//	public ServiceResponse(int code, String message, Object object) {
//		super();
//		this.code = code;
//		if (object instanceof Exception) {
//			logError((Exception) object);
//			this.message = message;
//			this.data = ((Exception) object).getMessage();
//		} else {
//			this.message = message;
//			this.data = object;
//		}
//		logResponse();
//	}
//
//	public ServiceResponse(int code, Object data) {
//		this.code = code;
//		if (code == 400) {
//			if (data instanceof Exception) {
//				logError((Exception) data);
//				this.message = ((Exception) data).getMessage();
//			} else {
//				this.message = String.valueOf(data);
//			}
//			this.data = null;
//		} else if (this.code == 200) {
//			if (isEmpty(data)) {
//				this.code = 500;
//				this.message = "DATA NOT FOUND";
//			} else {
//				this.message = "SUCCESS";
//				this.data = data;
//			}
//		}
//		logResponse();
//	}

	public ServiceResponse(int code) {
		this.code = code;
		this.message = ResponseCodeMapper.map().get(code);
		this.data = "NA";
		logResponse();
	}
	
	// Function is used to set the exception need to refactor it.
	public ServiceResponse(int code, String message, Object object) {
		super();
		this.code = code;
		this.message = message;
		this.data = object;
		logResponse();
	}

	public ServiceResponse(int code, Object data) {
		this.code = code;
		if (code == ResponseCode.FAILURE) {
			if (data instanceof Exception) {
				logError((Exception) data);
				this.message = ((Exception) data).getMessage();
			} else {
				this.message = String.valueOf(data);
			}
			this.data = null;
		} else {
			this.message = ResponseCodeMapper.map().get(code);
			this.data = data;
		}

		if (this.code == ResponseCode.SUCCESS && isEmpty(this.data)) {
			this.code = ResponseCode.DATA_NOT_FOUND;
			this.message = ResponseDesc.DATA_NOT_FOUND;
		}
		logResponse();
	}

	private boolean isEmpty(Object object) {
		boolean nullFlag;

		if (object instanceof ArrayList<?>) {
			List<?> dataList = (List<?>) object;
			nullFlag = dataList.isEmpty();

		} else
			nullFlag = (object == null) ? true : false;

		return nullFlag;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	public Object getData() {
		return data;
	}
}
