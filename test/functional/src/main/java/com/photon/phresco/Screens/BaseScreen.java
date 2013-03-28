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
 * ###
  * PHR_JavaWebService
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
package com.photon.phresco.Screens;

import java.awt.AWTException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONObject;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Platform;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.photon.phresco.selenium.util.Constants;
import com.photon.phresco.selenium.util.ScreenActionFailedException;
import com.photon.phresco.selenium.util.ScreenException;
import com.photon.phresco.uiconstants.PhrescoJavaWebserviceUiConstants;
import com.thoughtworks.selenium.Selenium;

public class BaseScreen {

	
	public  Selenium selenium;
	public  WebDriver driver;
	private  ChromeDriverService chromeService;
	private  Log log = LogFactory.getLog("BaseScreen");
	DesiredCapabilities capabilities;
	private PhrescoJavaWebserviceUiConstants nodejs;
	private  JSONObject json;

		
	public BaseScreen() {

	}

	public BaseScreen(String url, String browser, String selectedPlatform, String reporter)
			throws AWTException, IOException, ScreenActionFailedException {

	}

	public  void initialize(String browser, String selectedPlatform, 
			String url,String context)
			throws com.photon.phresco.selenium.util.ScreenActionFailedException, MalformedURLException {

		try {
			instantiateBrowser(browser, selectedPlatform, url, context);
		} catch (ScreenException se) {
			se.printStackTrace();
		}

	}

	public  void instantiateBrowser(String browserName, String selectedPlatform, String url,
			String context) throws ScreenException, MalformedURLException {
		URL server = new URL("http://localhost:4444/wd/hub/");
		if (browserName.equalsIgnoreCase(Constants.BROWSER_CHROME)) {
			log.info("-------------***LAUNCHING GOOGLECHROME***--------------");
			try {
				capabilities = new DesiredCapabilities();
				capabilities.setBrowserName("chrome");
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else if (browserName.equalsIgnoreCase(Constants.BROWSER_IE)) {
			log.info("---------------***LAUNCHING INTERNET EXPLORE***-----------");
			try {
				capabilities = new DesiredCapabilities();
				capabilities.setJavascriptEnabled(true);
				capabilities.setBrowserName("iexplorer");
				} catch (Exception e) {
					e.printStackTrace();
			}
		}
			
			else if (browserName.equalsIgnoreCase(Constants.BROWSER_OPERA)) {
				log.info("-------------***LAUNCHING OPERA***--------------");
				try {
				capabilities = new DesiredCapabilities();
				capabilities.setBrowserName("opera");
				capabilities.setCapability("opera.autostart ",true);

				System.out.println("-----------checking the OPERA-------");
				} catch (Exception e) {
					e.printStackTrace();
				}
		
		} 
			else if (browserName.equalsIgnoreCase(Constants.BROWSER_SAFARI)) {
				log.info("-------------***LAUNCHING SAFARI***--------------");
				try {
					
			    capabilities = new DesiredCapabilities();
				capabilities.setBrowserName("safari");
			System.out.println("-----------checking the SAFARI-------");
			} catch (Exception e) {
				e.printStackTrace();
			}
	
		} else if (browserName.equalsIgnoreCase(Constants.BROWSER_FIREFOX)) {
			log.info("-------------***LAUNCHING FIREFOX***--------------");
				try {
				
				capabilities = new DesiredCapabilities();
				capabilities.setBrowserName("firefox");
				} catch (Exception e) {
					e.printStackTrace();
				}

		} else if (browserName.equalsIgnoreCase(Constants.HTML_UNIT_DRIVER)) {
			log.info("-------------***HTML_UNIT_DRIVER***--------------");
			capabilities = new DesiredCapabilities();
			capabilities.setBrowserName("htmlunit"); 
			/*URL server = new URL("http://testVM:4444/wd/hub");
			new RemoteWebDriver(new Url("http://testVM:4444/wd/hub");*/

			System.out.println("-----------checking the HTML_UNIT_DRIVER-------");
			// break;
			// driver = new RemoteWebDriver(server, capabilities);

		}
				
				else {
			throw new ScreenException(
					"------Only FireFox,InternetExplore, Chrome, Opera, Safari and Htmlunit works-----------");
		}
		
		/**
		 * These 3 steps common for all the browsers
		 */


		if (selectedPlatform.equalsIgnoreCase("WINDOWS")) {
			capabilities.setCapability(CapabilityType.PLATFORM,
					Platform.WINDOWS);
			// break;
		} else if (selectedPlatform.equalsIgnoreCase("LINUX")) {
			capabilities.setCapability(CapabilityType.PLATFORM, Platform.LINUX);
			// break;
		} else if (selectedPlatform.equalsIgnoreCase("MAC")) {
			capabilities.setCapability(CapabilityType.PLATFORM, Platform.MAC);
			// break;
		}
		
		driver = new RemoteWebDriver(server, capabilities);	
		driver.get(url+context);
		
	}
	
	

	public  void windowMaximizeFirefox() {
		driver.manage().window().setPosition(new Point(0, 0));
		java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit()
				.getScreenSize();
		Dimension dim = new Dimension((int) screenSize.getWidth(),
				(int) screenSize.getHeight());
		driver.manage().window().setSize(dim);
	}

	public void closeBrowser() {
		log.info("-------------***BROWSER CLOSING***--------------");
		if (driver != null) {
			driver.quit();
			if (chromeService != null) {
				chromeService.stop();
			}
		} else {
			throw new NullPointerException();
		}

	}

	public  String getChromeLocation() {
		log.info("getChromeLocation:*****CHROME TARGET LOCATION FOUND***");
		String directory = System.getProperty("user.dir");
		String targetDirectory = getChromeFile();
		String location = directory + targetDirectory;
		return location;
	}

	public  String getChromeFile() {
		if (System.getProperty("os.name").startsWith(Constants.WINDOWS_OS)) {
			log.info("*******WINDOWS MACHINE FOUND*************");
			// getChromeLocation("/chromedriver.exe");
			return Constants.WINDOWS_DIRECTORY + "/chromedriver.exe";
		} else if (System.getProperty("os.name").startsWith(Constants.LINUX_OS)) {
			log.info("*******LINUX MACHINE FOUND*************");
			return Constants.LINUX_DIRECTORY_64 + "/chromedriver";
		} else if (System.getProperty("os.name").startsWith(Constants.MAC_OS)) {
			log.info("*******MAC MACHINE FOUND*************");
			return Constants.MAC_DIRECTORY + "/chromedriver";
		} else {
			throw new NullPointerException("******PLATFORM NOT FOUND********");
		}

	}
	
	public void restApiGeneral(String serverURL,String context) throws MalformedURLException, InterruptedException {
		
		System.out.println("***********restApiURL*************"+serverURL+context);
		navigatePath(serverURL,context);
		
		
	}

	public void navigatePath(String serverURL,String context) throws InterruptedException, MalformedURLException
	{	
		
		driver.get(serverURL+context);
		Thread.sleep(5000);
	}
	
}
