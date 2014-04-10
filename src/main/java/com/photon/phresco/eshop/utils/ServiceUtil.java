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
package com.photon.phresco.eshop.utils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;

import com.photon.phresco.eshop.models.CategoryHBM;
import com.photon.phresco.eshop.models.ProductHBM;
import com.photon.phresco.eshop.models.ReviewHBM;
import com.photon.phresco.eshop.models.rest.Category;
import com.photon.phresco.eshop.models.rest.Product;
import com.photon.phresco.eshop.models.rest.ProductDetails;
import com.photon.phresco.eshop.models.rest.ProductReview;
import com.photon.phresco.eshop.models.rest.Review;

public class ServiceUtil {

	public static String getValue(Cell cell) {
		if (cell == null) {
			return null;
		}

		if (Cell.CELL_TYPE_STRING == cell.getCellType()) {
			return cell.getStringCellValue();
		}

		if (Cell.CELL_TYPE_NUMERIC == cell.getCellType()) {
			return String.valueOf(cell.getNumericCellValue());
		}

		if (Cell.CELL_TYPE_BOOLEAN == cell.getCellType()) {
			return String.valueOf(cell.getBooleanCellValue());
		}

		if (Cell.CELL_TYPE_BLANK == cell.getCellType()) {
			return null;
		}

		return null;
	}

	public static List<Category> getCategories(List<CategoryHBM> categoryHBMs) {
		List<Category> categories = new ArrayList<Category>(10);

		int i = 0;
		for (CategoryHBM categoryHBM : categoryHBMs) {
			Category category = new Category(categoryHBM.getCategoryId(),
					categoryHBM.getCategoryName(),
					categoryHBM.getCategoryImage(),categoryHBM.getCategoryDetailsImage(), categoryHBM.getTotalProducts());
			categories.add(category);

			i++;
		}

		return categories;
	}

	public static List<Product> getProducts(List<ProductHBM> productsHBMs) {
		List<Product> products = new ArrayList<Product>(10);

		int i = 0;
		for (ProductHBM productHBM : productsHBMs) {
			Product product = getProduct(productHBM);

			product.setRating(productHBM.getRating());
			products.add(product);
			i++;
		}

		return products;
	}

	public static Product getProduct(ProductHBM productHBM) {
		
		ProductDetails prodDetail = new ProductDetails();
		Product product = new Product(productHBM.getProductId(), productHBM.getProductName(), productHBM.getCategoryId(),
				productHBM.getModel(), productHBM.isSpecialProduct(), productHBM.isNewProduct(), productHBM.getListPrice(), productHBM.getSellPrice(),
				productHBM.getProductDescription(), productHBM.getProductImage(), productHBM.getProductDetailImage(), prodDetail);

		product.setRating(productHBM.getRating());

		return product;
	}

	public static ReviewHBM getReviewHBM(ProductReview productReview) {

		ReviewHBM reviewHBM = new ReviewHBM();
		reviewHBM.setProductId(productReview.getProductId());
		reviewHBM.setUserId(productReview.getUserId());
		reviewHBM.setRatings(productReview.getRating());
		reviewHBM.setComment(productReview.getComment());
		reviewHBM.setCommentDate(new Date());

		return reviewHBM;
	}

	public static Review getReview(List<Object> objects) {
		Review review = new Review();

		for (Object object : objects) {
			if (object instanceof ReviewHBM) {
				ReviewHBM reviewHBM = (ReviewHBM) object;
				System.out.println("ReviewHBM = " + reviewHBM);
			}
		}

		return review;
	}

	public static int getRating(int rating) {
		float average = (rating / 5);
		int averageRating = Math.round(average);

		return averageRating;
	}
}
