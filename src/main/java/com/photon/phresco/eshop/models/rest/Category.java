package com.photon.phresco.eshop.models.rest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Category {

	private int id;
	private String name;
	private String image;
	private String detailsImage;
	private int productCount;

	public Category() {

	}

	public Category(int id, String name, String image, String detailsImage,
			int productCount) {
		this.id = id;
		this.name = name;
		this.image = image;
		this.detailsImage = detailsImage;
		this.productCount = productCount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDetailsImage() {
		return detailsImage;
	}

	public void setDetailsImage(String detailsImage) {
		this.detailsImage = detailsImage;
	}

	public int getProductCount() {
		return productCount;
	}

	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}

}
