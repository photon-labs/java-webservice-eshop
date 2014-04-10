/**
 * PHR_JavaWebService
 *
 * Copyright (C) 1999-2014 Photon Infotech Inc.
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