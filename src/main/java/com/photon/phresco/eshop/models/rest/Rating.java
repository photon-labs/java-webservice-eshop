package com.photon.phresco.eshop.models.rest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Rating {

	private int key;
	private int value;

	public Rating() {

	}

	public Rating(int key, int value) {
		this.key = key;
		this.value = value;
	}

	/**
	 * @return the key
	 */
	public int getKey() {
		return key;
	}

	/**
	 * @param key
	 *            the key to set
	 */
	public void setKey(int key) {
		this.key = key;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}

}
