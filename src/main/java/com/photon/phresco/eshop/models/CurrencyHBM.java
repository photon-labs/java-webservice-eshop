package com.photon.phresco.eshop.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CurrencyHBM {

	private int currencyId;
	private String currencyCode;
	private String symbol;

	public int getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(int currencyId) {
		this.currencyId = currencyId;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
}
