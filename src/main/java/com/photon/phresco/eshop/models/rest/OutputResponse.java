package com.photon.phresco.eshop.models.rest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OutputResponse {

	private String type;
	private String message;
	private String userId;

	public OutputResponse() {

	}

	public OutputResponse(String type, String message) {
		this.type = type;
		this.message = message;
	}

	public OutputResponse(String type, String message, String userId) {
		this.type = type;
		this.message = message;
		this.userId = userId;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
