package com.photon.phresco.eshop.finder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceFinder {

	public static Object findBean(String beanName) {
//		String envType = System.getProperty("SERVER_ENVIRONMENT");
		System.out.println("Find Bean "  + beanName);
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:spring-hibernate.xml");
		System.out.println("Found Bean");
		return context.getBean(beanName);
	}
}
