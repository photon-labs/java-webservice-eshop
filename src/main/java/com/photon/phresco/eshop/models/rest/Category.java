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
