/*
 * ###
 *  PHR_JavaWebService
 * %%
 * Copyright (C) 1999 - 2012 Photon Infotech Inc.
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ###
 */
/*
 * Author by {phresco} QA Automation Team
 */
package com.photon.phresco.testcases;

import java.io.IOException;

import junit.framework.TestCase;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.openqa.selenium.server.SeleniumServer;

import com.photon.phresco.Screens.TestJson;
import com.photon.phresco.Screens.WelcomeScreen;
import com.photon.phresco.uiconstants.PhrescoJwsUiConstants;
import com.photon.phresco.uiconstants.PhrescoUiConstants;
import com.thoughtworks.selenium.Selenium;

public class RestApiCategories extends TestCase {

	private PhrescoUiConstants phrsc;
	private PhrescoJwsUiConstants jws;
	private int SELENIUM_PORT;
	private String browserAppends;
	private Log log = LogFactory.getLog(getClass());
	private String contextName;
	WelcomeScreen wel;
	String serverURL;
	String methodName;

	@Test
	public void testRestApiCategories() throws InterruptedException,
			IOException, Exception {
		try {

			assertNotNull("Browser name should not be null", browserAppends);

			assertNotNull("selenium-port number should not be null",
					SELENIUM_PORT);
			wel = new WelcomeScreen(browserAppends, serverURL, contextName);
			assertNotNull(wel);
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();
			System.out.println("methodName = " + methodName);
			wel.JwsCategories(methodName);
			System.out.println("Sample Testing*******************************");
			TestJson nodejson = new TestJson();
			nodejson.testCategories();
		} catch (Exception t) {
			new RuntimeException(t);
					}
	}

	public void setUp() throws Exception {

		phrsc = new PhrescoUiConstants();
		jws = new PhrescoJwsUiConstants();
		serverURL = phrsc.PROTOCOL + "://" + phrsc.HOST + ":" + phrsc.PORT
				+ "/";
		browserAppends = "*" + phrsc.BROWSER;
		contextName = phrsc.CONTEXT + jws.CONTEXT_REST_API
				+ jws.CONTEXT_CATEGORIES;
	}

	public void tearDown() {
		clean();
	}

	private void clean() {
		wel.closeBrowser();
	}

}