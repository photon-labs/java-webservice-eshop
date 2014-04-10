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
