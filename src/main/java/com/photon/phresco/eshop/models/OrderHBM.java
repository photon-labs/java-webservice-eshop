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

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class OrderHBM {
	private int orderId;
	private Date orderDate;
	private Date lastUpdate;
	private Boolean orderStatus;
	private String shippingFirstName;
	private String shippingLastName;
	private String shippingAddress1;
	private String shippingAddress2;
	private String shippingState;
	private String shippingCity;
	private int shippingPostalCode;
	private double shippingCost;
	private String paymentFirstName;
	private String paymentLastName;
	private String paymentAddress1;
	private String paymentAddress2;
	private String paymentCity;
	private String paymentstate;
	private int paymentPostalCode;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Boolean getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Boolean orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getShippingFirstName() {
		return shippingFirstName;
	}

	public void setShippingFirstName(String shippingFirstName) {
		this.shippingFirstName = shippingFirstName;
	}

	public String getShippingLastName() {
		return shippingLastName;
	}

	public void setShippingLastName(String shippingLastName) {
		this.shippingLastName = shippingLastName;
	}

	public String getShippingAddress1() {
		return shippingAddress1;
	}

	public void setShippingAddress1(String shippingAddress1) {
		this.shippingAddress1 = shippingAddress1;
	}

	public String getShippingAddress2() {
		return shippingAddress2;
	}

	public void setShippingAddress2(String shippingAddress2) {
		this.shippingAddress2 = shippingAddress2;
	}

	public String getShippingState() {
		return shippingState;
	}

	public void setShippingState(String shippingState) {
		this.shippingState = shippingState;
	}

	public String getShippingCity() {
		return shippingCity;
	}

	public void setShippingCity(String shippingCity) {
		this.shippingCity = shippingCity;
	}

	public int getShippingPostalCode() {
		return shippingPostalCode;
	}

	public void setShippingPostalCode(int shippingPostalCode) {
		this.shippingPostalCode = shippingPostalCode;
	}

	public double getShippingCost() {
		return shippingCost;
	}

	public void setShippingCost(double shippingCost) {
		this.shippingCost = shippingCost;
	}

	public String getPaymentFirstName() {
		return paymentFirstName;
	}

	public void setPaymentFirstName(String paymentFirstName) {
		this.paymentFirstName = paymentFirstName;
	}

	public String getPaymentLastName() {
		return paymentLastName;
	}

	public void setPaymentLastName(String paymentLastName) {
		this.paymentLastName = paymentLastName;
	}

	public String getPaymentAddress1() {
		return paymentAddress1;
	}

	public void setPaymentAddress1(String paymentAddress1) {
		this.paymentAddress1 = paymentAddress1;
	}

	public String getPaymentAddress2() {
		return paymentAddress2;
	}

	public void setPaymentAddress2(String paymentAddress2) {
		this.paymentAddress2 = paymentAddress2;
	}

	public String getPaymentCity() {
		return paymentCity;
	}

	public void setPaymentCity(String paymentCity) {
		this.paymentCity = paymentCity;
	}

	public String getPaymentstate() {
		return paymentstate;
	}

	public void setPaymentstate(String paymentstate) {
		this.paymentstate = paymentstate;
	}

	public int getPaymentPostalCode() {
		return paymentPostalCode;
	}

	public void setPaymentPostalCode(int paymentPostalCode) {
		this.paymentPostalCode = paymentPostalCode;
	}

}
