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
package com.photon.phresco.Screens;

import java.io.IOException;


import org.apache.commons.lang.StringUtils;

import com.photon.phresco.uiconstants.PhrescoJavaWebserviceUiConstants;

public class WelcomeScreen extends PhotonAbstractScreen {
	private PhrescoJavaWebserviceUiConstants phrsc = new PhrescoJavaWebserviceUiConstants();
	private PhrescoJavaWebserviceUiConstants nodejs;
	

	public WelcomeScreen(String selectedBrowser, String selectedPlatform, String url, String contextName)
			throws InterruptedException, IOException, Exception {
		super(selectedBrowser, selectedPlatform, url, contextName);

	}

	public void JwsEshop(String methodName) throws InterruptedException,
			IOException, Exception {
		if (StringUtils.isEmpty(methodName)) {
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();
			;
		}
		isTextPresent(phrsc.ESHOP, methodName);

	}

	public void JwsConfig(String methodName) throws InterruptedException,
			IOException, Exception {

		if (StringUtils.isEmpty(methodName)) {
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();
			;
		}
		isTextPresent(phrsc.CONFIG, methodName);

	}

	public void JwsCategories(String methodName) throws InterruptedException,
			IOException, Exception {

		if (StringUtils.isEmpty(methodName)) {
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();
			;
		}
		System.out.println("***********TEXT:*************"+phrsc.CATEGORIES);
		isTextPresent(phrsc.CATEGORIES, methodName);
		Thread.sleep(5000);
		
	}

	public void JwsProducts(String methodName) throws InterruptedException,
			IOException, Exception {

		if (StringUtils.isEmpty(methodName)) {
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();
			;
		}
		isTextPresent(phrsc.PRODUCTS, methodName);

	}

	public void JwsCategory1(String methodName) throws InterruptedException,
			IOException, Exception {
		if (StringUtils.isEmpty(methodName)) {
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();
			;
		}
		Thread.sleep(5000);
		isTextPresent(phrsc.CATEGORY1, methodName);
		

	}

	public void JwsCategory2(String methodName) throws InterruptedException,
			IOException, Exception {
		if (StringUtils.isEmpty(methodName)) {
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();
			;
		}
		isTextPresent(phrsc.CATEGORY2, methodName);

	}

	public void JwsCategory3(String methodName) throws InterruptedException,
			IOException, Exception {
		if (StringUtils.isEmpty(methodName)) {
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();
			;
		}
		isTextPresent(phrsc.CATEGORY3, methodName);

	}

	public void Jwsnewproducts(String methodName) throws Exception, IOException {

		if (StringUtils.isEmpty(methodName)) {
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();
			;
		}
		isTextPresent(phrsc.PRODUCTS, methodName);

	}

	public void JwsSpecialproducts(String methodName) throws Exception,
			IOException {

		if (StringUtils.isEmpty(methodName)) {
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();
			;
		}
		isTextPresent(phrsc.SPECIALPRODUCTS, methodName);

	}

	public void JwsSearchMobile(String methodName) throws Exception,
			IOException {

		if (StringUtils.isEmpty(methodName)) {
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();
			;
		}
		isTextPresent(phrsc.SEARCHMOBILE, methodName);

	}

	public void JwsSearchComputer(String methodName) throws Exception,
			IOException {
		isTextPresent(phrsc.SEARCHCOMPUTER, methodName);

	}

	public void JwsReviewProduct() throws Exception, IOException {

	}
	

}
