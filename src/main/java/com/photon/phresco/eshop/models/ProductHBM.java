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

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProductHBM implements Serializable {

	private static final long serialVersionUID = -9164537688449764141L;
	private int productId;
	private String productName;
	private String manufacturer;
	private int categoryId;
	private String model;
	private int specialProduct;
	private int newProduct;
	private double listPrice;
	private double sellPrice;
	private String productDescription;
	private String productImage;
	private String ProductDetailImage;
	private Date createdDate;
	private Date lastUpdatedDate;
	private int productQuantity;
	private int rating;

	public ProductHBM() {

	}

	public ProductHBM(int productId, String productName, String manufacturer,
			int categoryId, String model, int specialProduct, int newProduct,
			double listPrice, double sellPrice, String productDescription,
			String productImage, String productDetailImage, Date createdDate,
			Date lastUpdatedDate) {
		this.productId = productId;
		this.productName = productName;
		this.manufacturer = manufacturer;
		this.categoryId = categoryId;
		this.model = model;
		this.specialProduct = specialProduct;
		this.newProduct = newProduct;
		this.listPrice = listPrice;
		this.sellPrice = sellPrice;
		this.productDescription = productDescription;
		this.productImage = productImage;
		ProductDetailImage = productDetailImage;
		this.createdDate = createdDate;
		this.lastUpdatedDate = lastUpdatedDate;
	}

	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	/**
	 * @return the categoryId
	 */
	public int getCategoryId() {
		return categoryId;
	}

	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the newProduct
	 */
	public int isNewProduct() {
		return newProduct;
	}

	/**
	 * @param newProduct the newProduct to set
	 */
	public void setNewProduct(int newProduct) {
		this.newProduct = newProduct;
	}

	/**
	 * @return the specialProduct
	 */
	public int isSpecialProduct() {
		return specialProduct;
	}

	/**
	 * @param specialProduct the specialProduct to set
	 */
	public void setSpecialProduct(int specialProduct) {
		this.specialProduct = specialProduct;
	}

	/**
	 * @return the listPrice
	 */
	public double getListPrice() {
		return listPrice;
	}

	/**
	 * @param listPrice the listPrice to set
	 */
	public void setListPrice(double listPrice) {
		this.listPrice = listPrice;
	}

	/**
	 * @return the sellPrice
	 */
	public double getSellPrice() {
		return sellPrice;
	}

	/**
	 * @param sellPrice the sellPrice to set
	 */
	public void setSellPrice(double sellPrice) {
		this.sellPrice = sellPrice;
	}

	/**
	 * @return the productDescription
	 */
	public String getProductDescription() {
		return productDescription;
	}

	/**
	 * @param productDescription the productDescription to set
	 */
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	/**
	 * @return the productImage
	 */
	public String getProductImage() {
		return productImage;
	}

	/**
	 * @param productImage the productImage to set
	 */
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	/**
	 * @return the productDetailImage
	 */
	public String getProductDetailImage() {
		return ProductDetailImage;
	}

	/**
	 * @param productDetailImage the productDetailImage to set
	 */
	public void setProductDetailImage(String productDetailImage) {
		ProductDetailImage = productDetailImage;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the lastUpdatedDate
	 */
	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	/**
	 * @param lastUpdatedDate the lastUpdatedDate to set
	 */
	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	/**
	 * @return the productQuantity
	 */
	public int getProductQuantity() {
		return productQuantity;
	}

	/**
	 * @param productQuantity the productQuantity to set
	 */
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

}
