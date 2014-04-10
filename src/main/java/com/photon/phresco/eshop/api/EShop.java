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
package com.photon.phresco.eshop.api;

import java.util.List;

import com.photon.phresco.eshop.commons.Constants;
import com.photon.phresco.eshop.commons.exception.EShopException;
import com.photon.phresco.eshop.models.rest.Category;
import com.photon.phresco.eshop.models.rest.OutputResponse;
import com.photon.phresco.eshop.models.rest.Product;
import com.photon.phresco.eshop.models.rest.ProductReview;
import com.photon.phresco.eshop.models.rest.Review;

public interface EShop extends Constants {

	public List<Category> getCategories() throws EShopException;

	public List<Product> getProducts(int categoryId) throws EShopException;
	
	public List<Product> getProducts() throws EShopException;
	
	public Product getProduct(int productId) throws EShopException;

	public Review getReview(int productId) throws EShopException;

	public List<Product> searchProducts(String namePattern) throws EShopException;

	public List<Product> getSpecialProducts() throws EShopException;
	
	public List<Product> getNewProducts() throws EShopException;

	public OutputResponse postReview(ProductReview productReview) throws EShopException;

}
