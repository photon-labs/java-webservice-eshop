package com.photon.phresco.eshop.models.rest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProductDetails {

	private String tvType;
	private String screenSize;
	private String screenRatio;
	private String tvDefinition;

	public ProductDetails() {

	}

	public ProductDetails(String tvType, String screenSize, String screenRatio, String tvDefinition) {
		this.tvType = tvType;
		this.screenSize = screenSize;
		this.screenRatio = screenRatio;
		this.tvDefinition = tvDefinition;
	}

	public void setTvType(String tvType) {
		this.tvType = tvType;
	}

	public String getTvType() {
		return tvType;
	}

	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}

	public String getScreenSize() {
		return screenSize;
	}

	public void setScreenRatio(String screenRatio) {
		this.screenRatio = screenRatio;
	}

	public String getScreenRatio() {
		return screenRatio;
	}

	public void setTvDefinition(String tvDefinition) {
		this.tvDefinition = tvDefinition;
	}

	public String getTvDefinition() {
		return tvDefinition;
	}
}
