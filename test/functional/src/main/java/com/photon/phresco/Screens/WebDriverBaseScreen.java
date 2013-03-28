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

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.photon.phresco.selenium.util.ScreenException;

public class WebDriverBaseScreen extends WebDriverAbstractBaseScreen {
	
	private Log log = LogFactory.getLog(getClass());
	protected WebDriverBaseScreen() throws ScreenException{
		if(element==null){
			throw new ScreenException("********The element value should not be null********");
		}
	}
	
	public void click()throws ScreenException{
		log.info("Entering:********click operation start********");
	try{
		element.click();
	}catch(Throwable t){
		t.printStackTrace();
	}
		log.info("Entering:********click operation end********");
		
	}
	public void clear()throws ScreenException{
		log.info("Entering:********clear operation start********");
		try{
		element.clear();
		}catch(Throwable t){
			t.printStackTrace();
		}
		log.info("Entering:********clear operation end********");
		
	}
	public void type(String text)throws ScreenException{
		log.info("Entering:********enterText operation start********");
		try{
			clear();
			element.sendKeys(text);
			
			
		}catch(Throwable t){
			t.printStackTrace();
		}
		log.info("Entering:********enterText operation end********");
	}
	public void submit()throws ScreenException{
		log.info("Entering:********submit operation start********");
		try{
			element.submit();
		}catch(Throwable t){
			t.printStackTrace();
		}
		log.info("Entering:********submit operation end********");
		
	}
	
	
	public void selectListItem(String xpath,String valueToSelect){
		
		WebElement selectElement = driver.findElement(By.xpath(xpath));

		// Then instantiate the Select class with that WebElement
		Select select = new Select(selectElement);

		// Get a list of the options
		List<WebElement> options = select.getOptions();

		// For each option in the list, verify if it's the one you want and then click it
		for (WebElement we : options) {
		if (we.getText().equals(valueToSelect)) {
		we.click();
		//break;
		}
		}

		}
	
	public void accept() throws InterruptedException{
		
	      WebDriver popup = null;
	      	Set<String> windowname=driver.getWindowHandles();
	      	Iterator<String> window=windowname.iterator();
	      
	      while(window.hasNext()) { 
	        String windowHandle = window.next();	      
	        popup = driver.switchTo().window(windowHandle); 
	        System.out.println("------------------POP-UP WINDOW NAME---->"+popup.getTitle().toString());
	        if (popup.getTitle().toString().equalsIgnoreCase("")) {
	        	  popup.findElement(By.name("OK")).click();
	        	  Thread.sleep(5000);
	          break;
	        }
	      }
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

