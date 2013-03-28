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
/*
 * Author by {phresco} QA Automation Team
 */
package com.photon.phresco.testcases;

import static org.testng.AssertJUnit.assertNotNull;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.photon.phresco.Screens.TestJson;
import com.photon.phresco.Screens.WelcomeScreen;
import com.photon.phresco.uiconstants.PhrescoJavaWebserviceUiConstants;
import com.photon.phresco.uiconstants.PhrescoUiConstants;

public class JavaWebServiceTest {

	private PhrescoJavaWebserviceUiConstants jws;
	private int SELENIUM_PORT;
	private String selectedBrowser;
	private String selectedPlatform;
	private PhrescoJavaWebserviceUiConstants nodejs;
	private Log log = LogFactory.getLog(getClass());

	private PhrescoUiConstants phrsc;
	private String contextName;
	WelcomeScreen wel;
	private String serverURL;

	String methodName;

	@Parameters(value = { "browser", "platform" })
	@BeforeTest
	public void setUp(String browser, String platform) throws Exception {

		phrsc = new PhrescoUiConstants();
		jws = new PhrescoJavaWebserviceUiConstants();
		serverURL = phrsc.PROTOCOL + "://" + phrsc.HOST + ":" + phrsc.PORT
				+ "/";
		selectedBrowser = browser;
		selectedPlatform = platform;
		assertNotNull("Browser name should not be null", selectedBrowser);

		assertNotNull("selenium-port number should not be null", SELENIUM_PORT);
		wel = new WelcomeScreen(selectedBrowser, selectedPlatform, serverURL,
				phrsc.CONTEXT);
		assertNotNull(wel);

	}

	@Test
	public void testRestApiCategories() throws InterruptedException,
			IOException, Exception {
		try {

			assertNotNull("Browser name should not be null", selectedBrowser);

			assertNotNull("selenium-port number should not be null",
					SELENIUM_PORT);
			assertNotNull(wel);
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();
			System.out.println("methodName = " + methodName);
			System.out.println("Sample Testing*******************************");
			Thread.sleep(5000);
			wel.JwsCategories(methodName);
			wel.JwsCategory1(methodName);
			wel.JwsCategory2(methodName);
			wel.JwsCategory3(methodName);
			wel.Jwsnewproducts(methodName);
			wel.JwsProducts(methodName);
			wel.JwsSearchComputer(methodName);
			wel.JwsSearchMobile(methodName);
			wel.JwsSpecialproducts(methodName);
			wel.JwsEshop(methodName);
			System.out.println("Sample Testing*******************************");

		} catch (Exception t) {
			new RuntimeException(t);
		}
	}

	@Test
	public void testNavigationCategories() throws InterruptedException,
			IOException, Exception {
		try {
			System.out
					.println("***********Entering: PageNavigationTestMethod*************");
			System.out.println("***********restApiURL*************" + serverURL
					+ contextName);
			contextName = phrsc.CONTEXT + jws.CONTEXT_REST_API
					+ jws.CONTEXT_CATEGORIES;
			wel.restApiGeneral(serverURL, contextName);
			TestJson nodejson = new TestJson();
			nodejson.testCategories(serverURL, phrsc, jws);

		} catch (Exception t) {
			new RuntimeException(t);
		}
	}

	/*
	 * @Test public void testCategory1() throws InterruptedException,
	 * IOException, Exception { try{
	 * 
	 * assertNotNull("Browser name should not be null",selectedBrowser);
	 * assertNotNull("selenium-port number should not be null", SELENIUM_PORT);
	 * assertNotNull(wel); methodName =
	 * Thread.currentThread().getStackTrace()[1] .getMethodName();
	 * System.out.println("methodName = " + methodName);
	 * contextName=phrsc.CONTEXT; wel.restApiCategories(serverURL,contextName);
	 * wel.JwsCategory1(methodName);
	 * System.out.println("*******************End of testCategory1************"
	 * );
	 * 
	 * 
	 * } catch(Exception t){ new RuntimeException(t); } }
	 */
	@Test
	public void testNavigationCategories1() throws InterruptedException,
			IOException, Exception {
		try {

			System.out
					.println("***********Entering: PageNavigationTestMethod*************");
			System.out.println("***********Page:Navigation*************");

			contextName = phrsc.CONTEXT + jws.CONTEXT_REST_API
					+ jws.CONTEXT_CATEGORY1;
			wel.restApiGeneral(serverURL, contextName);
			TestJson nodejson = new TestJson();
			nodejson.testCategory1();

		} catch (Exception t) {
			new RuntimeException(t);
		}
	}

	@Test
	public void testNavigationCategories2() throws InterruptedException,
			IOException, Exception {
		try {

			System.out
					.println("***********Entering: PageNavigationTestMethod*************");
			System.out.println("***********Page:Navigation*************");
			contextName = phrsc.CONTEXT + jws.CONTEXT_REST_API
					+ jws.CONTEXT_CATEGORY2;
			wel.restApiGeneral(serverURL, contextName);
			TestJson nodejson = new TestJson();
			nodejson.testCategory2();

		} catch (Exception t) {
			new RuntimeException(t);
		}
	}

	@Test
	public void testNavigationCategories3() throws InterruptedException,
			IOException, Exception {
		try {

			System.out
					.println("***********Entering: PageNavigationTestMethod*************");
			System.out.println("***********Page:Navigation*************");
			contextName = phrsc.CONTEXT + jws.CONTEXT_REST_API
					+ jws.CONTEXT_CATEGORY3;
			wel.restApiGeneral(serverURL, contextName);
			TestJson nodejson = new TestJson();
			nodejson.testCategory3();

		} catch (Exception t) {
			new RuntimeException(t);
		}
	}

	@Test
	public void testNavigationNewproducts() throws InterruptedException,
			IOException, Exception {
		try {

			System.out
					.println("***********Entering: PageNavigationTestMethod*************");
			System.out.println("***********Page:Navigation*************");
			contextName = (phrsc.CONTEXT + jws.CONTEXT_REST_API + jws.CONTEXT_NEWPRODUCTS);
			wel.restApiGeneral(serverURL, contextName);
			TestJson nodejson = new TestJson();
			nodejson.testNewProducts();

		} catch (Exception t) {
			new RuntimeException(t);
		}
	}

	@Test
	public void testNavigationProducts() throws InterruptedException,
			IOException, Exception {
		try {

			System.out
					.println("***********Entering: PageNavigationTestMethod*************");
			System.out.println("***********Page:Navigation*************");
			contextName = phrsc.CONTEXT + jws.CONTEXT_REST_API
					+ jws.CONTEXT_PRODUCTS;
			wel.restApiGeneral(serverURL, contextName);
			TestJson nodejson = new TestJson();
			nodejson.Products();

		} catch (Exception t) {
			new RuntimeException(t);
		}
	}

	@Test
	public void testNavigationSearchComputer() throws InterruptedException,
			IOException, Exception {
		try {

			System.out
					.println("***********Entering: PageNavigationTestMethod*************");
			System.out.println("***********Page:Navigation*************");
			contextName = phrsc.CONTEXT + jws.CONTEXT_REST_API
					+ jws.CONTEXT_SEARCHCOUMPUTER;
			wel.restApiGeneral(serverURL, contextName);
			TestJson nodejson = new TestJson();
			nodejson.SearchComputer();

		} catch (Exception t) {
			new RuntimeException(t);
		}
	}

	@Test
	public void testNavigationSearchMobile() throws InterruptedException,
			IOException, Exception {
		try {

			System.out
					.println("***********Entering: PageNavigationTestMethod*************");
			System.out.println("***********Page:Navigation*************");
			contextName = phrsc.CONTEXT + jws.CONTEXT_REST_API
					+ jws.CONTEXT_SEARCHMOBILE;
			wel.restApiGeneral(serverURL, contextName);
			TestJson nodejson = new TestJson();
			nodejson.SearchMobile();

		} catch (Exception t) {
			new RuntimeException(t);
		}
	}

	@Test
	public void testNavigationSpecialproducts() throws InterruptedException,
			IOException, Exception {
		try {

			System.out
					.println("***********Entering: PageNavigationTestMethod*************");
			System.out.println("***********Page:Navigation*************");
			contextName = phrsc.CONTEXT + jws.CONTEXT_REST_API
					+ jws.CONTEXT_SPECIAL_PRODUCTS;
			wel.restApiGeneral(serverURL, contextName);
			TestJson nodejson = new TestJson();
			nodejson.SpecialProducts();

		} catch (Exception t) {
			new RuntimeException(t);
		}
	}

	@Test
	public void testNavigationWelcomepage() throws InterruptedException,
			IOException, Exception {
		try {

			System.out
					.println("***********Entering: PageNavigationTestMethod*************");
			System.out.println("***********Page:Navigation*************");
			contextName = phrsc.CONTEXT;
			wel.restApiGeneral(serverURL, contextName);

		} catch (Exception t) {
			new RuntimeException(t);
		}
	}

	@AfterClass
	public void tearDown() {
		clean();
	}

	private void clean() {
		wel.closeBrowser();
	}

}