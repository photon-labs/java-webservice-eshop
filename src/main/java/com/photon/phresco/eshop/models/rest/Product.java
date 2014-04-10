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
package com.photon.phresco.eshop.models.rest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product {

	private int id;
	private String name;
	private int category;
	private String model;
	private int specialProduct;
	private int newProduct;
	private double listPrice;
	private double sellPrice;
	private String description;
	private String image;
	private String detailImage;
	private int rating;
	private ProductDetails details;

	public Product() {

	}

	public Product(int id, String name, int category, String model,
			int specialProduct, int newProduct, double listPrice, double sellPrice,
			String description, String image, String detailImage, ProductDetails details) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.model = model;
		this.specialProduct = specialProduct;
		this.newProduct = newProduct;
		this.listPrice = listPrice;
		this.sellPrice = sellPrice;
		this.description = description;
		this.image = image;
		this.detailImage = detailImage;
		this.details = details;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the category
	 */
	public int getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(int category) {
		this.category = category;
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
	public int getNewProduct() {
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
	public int getSpecialProduct() {
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * @return the detailImage
	 */
	public String getDetailImage() {
		return detailImage;
	}

	/**
	 * @param detailImage the detailImage to set
	 */
	public void setDetailImage(String detailImage) {
		this.detailImage = detailImage;
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

	public void setDetails(ProductDetails details) {
		this.details = details;
	}

	public ProductDetails getDetails() {
		return details;
	}

}