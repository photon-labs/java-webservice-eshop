package com.photon.phresco.eshop.commons.exception;

public class ErrorCode implements ErrorConstants {

	private String errNo;
    private String errCode;

    public ErrorCode(String errNo, String errCode) {
		this.errNo = errNo;
		this.errCode = errCode;
    }

    public String getErrNo() {
    	return errNo;
    }

    public String getErrCode() {
    	return errCode;
    }
    
    public static ErrorCode E_FatalError = new ErrorCode("E1000", "E_FatalError");

}
