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

	@Ignore
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

	@Ignore
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
