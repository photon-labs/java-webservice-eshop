/**
 * 
 */
package com.photon.phresco.eshop.test;

import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.photon.phresco.eshop.api.EShopPublish;
import com.photon.phresco.eshop.factory.EShopServiceFactory;

/**
 * @author senthilkumar_sh
 * 
 */
public class EShopPublishTest {

	private static EShopPublish eshopPublish;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		eshopPublish = EShopServiceFactory.getEShopPublish();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Ignore
	public void testPublishEShopData() {
		try {
			eshopPublish.publishEShopData();
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}

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
	public static void tearDownAfterClass() throws Exception {
	}

}
