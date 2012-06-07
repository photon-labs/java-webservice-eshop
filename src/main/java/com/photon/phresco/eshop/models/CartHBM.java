package com.photon.phresco.eshop.models;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CartHBM {

	private int cartId;
	private int productId;
	private char cartSessionid;
	private int cartQty;
	private Date cartDate;

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public char getCartSessionid() {
		return cartSessionid;
	}

	public void setCartSessionid(char cartSessionid) {
		this.cartSessionid = cartSessionid;
	}

	public int getCartQty() {
		return cartQty;
	}

	public void setCartQty(int cartQty) {
		this.cartQty = cartQty;
	}

	public Date getCartDate() {
		return cartDate;
	}

	public void setCartDate(Date cartDate) {
		this.cartDate = cartDate;
	}
}
