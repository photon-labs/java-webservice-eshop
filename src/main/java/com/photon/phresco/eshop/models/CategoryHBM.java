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

import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
public class CategoryHBM implements Serializable {

	private static final long serialVersionUID = -1986916398578839001L;

	private int categoryId;
	private String categoryName;
	private String categoryImage;
	private String categoryDetailsImage;
	private int  categoryParentId;
	private String categoryDescription;
	private int totalProducts;

	public CategoryHBM() {

	}

	public CategoryHBM(int categoryId, String categoryName, String categoryImage,
			String categoryDetailsImage, int categoryParentId,
			String categoryDescription) {
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categoryImage = categoryImage;
		this.categoryDetailsImage = categoryDetailsImage;
		this.categoryParentId = categoryParentId;
		this.categoryDescription = categoryDescription;
	}

	public CategoryHBM(int categoryId, String categoryName, String categoryImage,
			String categoryDetailsImage, int categoryParentId,
			String categoryDescription, int totalProducts) {
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categoryImage = categoryImage;
		this.categoryDetailsImage = categoryDetailsImage;
		this.categoryParentId = categoryParentId;
		this.categoryDescription = categoryDescription;
		this.totalProducts = totalProducts;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryImage() {
		return categoryImage;
	}

	public void setCategoryImage(String categoryImage) {
		this.categoryImage = categoryImage;
	}

	public String getCategoryDetailsImage() {
		return categoryDetailsImage;
	}

	public void setCategoryDetailsImage(String categoryDetailsImage) {
		this.categoryDetailsImage = categoryDetailsImage;
	}

	public int getCategoryParentId() {
		return categoryParentId;
	}

	public void setCategoryParentId(int categoryParentId) {
		this.categoryParentId = categoryParentId;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	public int getTotalProducts() {
		return totalProducts;
	}

	public void setTotalProducts(int totalProducts) {
		this.totalProducts = totalProducts;
	}
}
