/**
 * PHR_JavaWebService
 *
 * Copyright (C) 1999-2013 Photon Infotech Inc.
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
/**
 * 
 */
package com.photon.phresco.eshop.test;

import java.util.List;

import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.photon.phresco.eshop.api.EShop;
import com.photon.phresco.eshop.factory.EShopServiceFactory;
import com.photon.phresco.eshop.models.rest.Category;
import com.photon.phresco.eshop.models.rest.Product;

/**
 * @author senthilkumar_sh
 * 
 */
public class EShopTest {

	private static EShop eshop;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws

	Exception {
		eshop = EShopServiceFactory.getEShop();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetCategories() {
		try {
			List<Category> categories = eshop.getCategories();
			System.out.println("categories = " + categories);

			for (int i = 0; i < categories.size(); i++) {
				Category category = categories.get(i);
				System.out.println("Products = " + category.getProductCount());
			}
			Assert.assertTrue(categories.size() != 0);
		} catch (Exception e) {
			Assert.assertTrue(false);
		}
	}

	@Test
	public void testGetProducts() {
		try {
			List<Product> products = eshop.getProducts(1);
			System.out.println("products = " + products);

			Assert.assertTrue(products.size() != 0);
		} catch (Exception e) {
			Assert.assertTrue(false);
		}
	}

	/*@Ignore
	public void testGetReviewsList() {
		try {
			List<Review> reviews = null; //eshop.getReviewList();
			System.out.println("reviewsList = "

			+ reviews);

			//Assert.assertTrue(!reviews.isEmpty());
		} catch (Exception e) {
			Assert.assertTrue(false);
		}
	}*/

	/*
	 * @Test public void testGetreviews() { try { List<ReviewHBM> reviews =
	 * 
	 * eshop.getReviews(1); System.out.println("reviews = " +
	 * 
	 * reviews);
	 * 
	 * Assert.assertTrue(!reviews.isEmpty()); } catch (Exception e) {
	 * Assert.assertTrue(false); } }
	 */

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws

	Exception {
	}

}
