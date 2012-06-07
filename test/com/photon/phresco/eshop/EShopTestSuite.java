package com.photon.phresco.eshop;

import junit.framework.Test;
import junit.framework.TestSuite;

import com.photon.phresco.eshop.test.EShopTest;

public class EShopTestSuite {

	public static Test suite() {
		TestSuite suite = new TestSuite();
		//$JUnit-BEGIN$
		suite.addTest((Test) new EShopTest());
		//$JUnit-END$
		return suite;
	}

}
