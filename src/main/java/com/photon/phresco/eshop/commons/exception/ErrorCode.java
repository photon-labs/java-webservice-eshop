/**
 * PHR_JavaWebService
 *
 * Copyright (C) 1999-2014 Photon Infotech Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
