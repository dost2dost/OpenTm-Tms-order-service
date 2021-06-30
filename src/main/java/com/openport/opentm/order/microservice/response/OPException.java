package com.openport.opentm.order.microservice.response;

public class OPException extends Exception {

	private static final long serialVersionUID = 1L;
	protected int errorCode;
	protected String errorMsg;

	public synchronized int getErrorCode() {
		return errorCode;
	}

	public synchronized String getErrorMsg() {
		return errorMsg;
	}

	public OPException(final int errorCode, final String errorMsg) {
		super(errorMsg);
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

	public OPException(final int errorCode, final String errorMsg, final Throwable cause) {
		super(errorMsg, cause);
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}
	
	@Override
	public String toString() {
		return super.toString() + " (" + this.errorCode + ")";
	}


}