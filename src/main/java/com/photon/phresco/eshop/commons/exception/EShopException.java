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


/**
 * Throws once the exception occurs.
 * 
 */
public class EShopException extends Exception {

	private static final long serialVersionUID = -716216996489734193L;
	protected Throwable cause;
    private ErrorCode errorCode;

	/**
	 * Constructs EShopException
	 * 
	 */
	public EShopException() {
		this.cause = null;
	}

	/**
	 * Constructs EShopException if the reason of the exception is thrown
	 *
	 * @param reason
	 * 			  reason of the exception
	 */
	public EShopException(String reason) {
		super(reason);
		this.cause = null;
	}

	/**
	 * Constructs EShopException with error code and its cause is thrown
	 *
	 * @param errorCode
	 * 			  errorCode of the exception
	 * 
	 * @param cause
	 * 			  cause of the exception
	 */
    public EShopException(ErrorCode errorCode, String message) {
    	super(message);
		this.errorCode = errorCode;
    }

	/**
	 * Constructs EShopException if the reason of the exception and its cause is thrown
	 *
	 * @param reason
	 * 			  reason of the exception
	 * 
	 * @param cause
	 * 			  cause of the exception
	 */
	public EShopException(String reason, Throwable cause) {
		super(reason);
		initCause(cause);
	}

	/**
	 * Constructs EShopException if the cause is thrown
	 *
	 * @param cause
	 * 			  cause of the exception
	 */
	public EShopException(Throwable cause) {
		super(cause.toString());
		initCause(cause);
	}

	/**
	 * Gets the message of the exception
	 *
	 */
	public String getMessage() {
		String str = super.getMessage();
		
		if ((str == null) && (this.cause != null)) {
			return this.cause.getMessage();
		}
		return str;
	}

	/**
	 * Gets the errorCode of the exception
	 *
	 */
	public ErrorCode getErrorCode() {
		return errorCode;
	}

	/**
	 * Gets the cause of the exception
	 *
	 */
	public Throwable getCause() {
		return this.cause;
	}

	/**
	 * Initializes the cause of this throwable to the specified value
	 *
	 * @param cause
	 * 			  cause of the exception used by getCause()
	 */
	public synchronized Throwable initCause(Throwable cause) {
		if (this.cause != null) {
			throw new IllegalStateException("Can't override cause");
		}
		
		if (cause == this) {
			throw new IllegalArgumentException("Self-causation not permitted");
		}

		this.cause = cause;
		return this;
	}

}