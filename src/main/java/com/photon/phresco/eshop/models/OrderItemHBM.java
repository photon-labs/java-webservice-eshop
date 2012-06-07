package com.photon.phresco.eshop.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OrderItemHBM {
	private int orderId;
	private int productId;
	private int orderQty;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getOrderQty() {
		return orderQty;
	}

	public void setOrderQty(int orderQty) {
		this.orderQty = orderQty;
	}
}
