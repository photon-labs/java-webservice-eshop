package com.photon.phresco.eshop.impl;

import com.photon.phresco.eshop.api.EShopPublish;
import com.photon.phresco.eshop.commons.Constants;
import com.photon.phresco.eshop.finder.ServiceFinder;
import com.photon.phresco.eshop.service.EShopPublishService;

public class EShopPublishImpl implements EShopPublish, Constants {

	private EShopPublishService eps;

	public EShopPublishImpl() {
		eps = (EShopPublishService) ServiceFinder.findBean(BEAN_ESHOP_PUBLISH_SERVICE);
	}

	public void publishEShopData() throws Exception {
		eps.publishEShopData();
	}
}