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