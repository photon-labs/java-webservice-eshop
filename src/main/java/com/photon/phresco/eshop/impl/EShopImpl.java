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
package com.photon.phresco.eshop.impl;

import java.util.List;

import com.photon.phresco.eshop.api.EShop;
import com.photon.phresco.eshop.commons.Constants;
import com.photon.phresco.eshop.commons.exception.EShopException;
import com.photon.phresco.eshop.finder.ServiceFinder;
import com.photon.phresco.eshop.models.ReviewHBM;
import com.photon.phresco.eshop.models.rest.Category;
import com.photon.phresco.eshop.models.rest.OutputResponse;
import com.photon.phresco.eshop.models.rest.Product;
import com.photon.phresco.eshop.models.rest.ProductReview;
import com.photon.phresco.eshop.models.rest.Review;
import com.photon.phresco.eshop.service.EShopService;
import com.photon.phresco.eshop.utils.ServiceUtil;
import com.photon.phresco.eshop.utils.Utility;

public class EShopImpl implements EShop, Constants {

	private EShopService ps;

	public EShopImpl() {
		ps = (EShopService) ServiceFinder.findBean(BEAN_ESHOP_SERVICE);
	}

	/* (non-Javadoc)
	 * @see com.photon.phresco.eshop.api.EShop#getCategoryList()
	 */
	public List<Category> getCategories() throws EShopException {
        return ServiceUtil.getCategories(ps.getCategories());
	}

	/* (non-Javadoc)
	 * @see com.photon.phresco.eshop.api.EShop#getProducts(int)
	 */
	public List<Product> getProducts(int categoryId) throws EShopException {
        return ServiceUtil.getProducts(ps.getProducts(categoryId));
	}

	/* (non-Javadoc)
	 * @see com.photon.phresco.eshop.api.EShop#getProducts()
	 */
	public List<Product> getProducts() throws EShopException {
		return ServiceUtil.getProducts(ps.getProducts());
	}

	/* (non-Javadoc)
	 * @see com.photon.phresco.eshop.api.EShop#getProduct(int)
	 */
	public Product getProduct(int productId) throws EShopException {
		return ServiceUtil.getProduct(ps.getProduct(productId));
	}

	/* (non-Javadoc)
	 * @see com.photon.phresco.eshop.api.EShop#getReviews(int)
	 */
	public Review getReview(int productId) throws EShopException {
		return ps.getReviews(productId);
	}

	/* (non-Javadoc)
	 * @see com.photon.phresco.eshop.api.EShop#searchProducts(java.lang.int)
	 */
	public List<Product> searchProducts(String namePattern) throws EShopException {
		return ServiceUtil.getProducts(ps.searchProducts(namePattern));
	}

	/* (non-Javadoc)
	 * @see com.photon.phresco.eshop.api.EShop#getSpecialProducts(int)
	 */
	public List<Product> getSpecialProducts() throws EShopException {
        return ServiceUtil.getProducts(ps.getSpecialProducts());
	}


	/* (non-Javadoc)
	 * @see com.photon.phresco.eshop.api.EShop#getSpecialProducts(int)
	 */
	public List<Product> getNewProducts() throws EShopException {
        return ServiceUtil.getProducts(ps.getNewProducts());
	}

	public OutputResponse postReview(ProductReview ProductReview) throws EShopException {
		try {
			ReviewHBM reviewHBM = ServiceUtil.getReviewHBM(ProductReview);
			ps.postReview(reviewHBM);
		} catch (EShopException e) {
			Utility.getOutputMessage(REPONSE_MESSAGE_TYPE, e.getMessage());
		}

		return Utility.getOutputMessage(REPONSE_SUCCESS, REPONSE_SUCCESS);
	}

	public static void main (String[] args) {
		float average = (4/5);
		System.out.println("Average = " + average);
		System.out.println(Math.round(average));
	}

}