package com.photon.phresco.eshop.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ConfigurationHBM {

	private String eshopConfigName;
	private String eshopConfigAddress;
	private int eshopConfigPhone;
	private String eshopConfigEmail;
	private double eshopConfigShippingCost;
	private int eshopConfigCurrency;

	public String getEshopConfigName() {
		return eshopConfigName;
	}

	public void setEshopConfigName(String eshopConfigName) {
		this.eshopConfigName = eshopConfigName;
	}

	public String getEshopConfigAddress() {
		return eshopConfigAddress;
	}

	public void setEshopConfigAddress(String eshopConfigAddress) {
		this.eshopConfigAddress = eshopConfigAddress;
	}

	public int getEshopConfigPhone() {
		return eshopConfigPhone;
	}

	public void setEshopConfigPhone(int eshopConfigPhone) {
		this.eshopConfigPhone = eshopConfigPhone;
	}

	public String getEshopConfigEmail() {
		return eshopConfigEmail;
	}

	public void setEshopConfigEmail(String eshopConfigEmail) {
		this.eshopConfigEmail = eshopConfigEmail;
	}

	public double getEshopConfigShippingCost() {
		return eshopConfigShippingCost;
	}

	public void setEshopConfigShippingCost(double eshopConfigShippingCost) {
		this.eshopConfigShippingCost = eshopConfigShippingCost;
	}

	public int getEshopConfigCurrency() {
		return eshopConfigCurrency;
	}

	public void setEshopConfigCurrency(int eshopConfigCurrency) {
		this.eshopConfigCurrency = eshopConfigCurrency;
	}
}
