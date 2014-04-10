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
package com.photon.phresco.eshop.factory;

import com.photon.phresco.eshop.api.EShop;
import com.photon.phresco.eshop.api.EShopPublish;
import com.photon.phresco.eshop.impl.EShopImpl;
import com.photon.phresco.eshop.impl.EShopPublishImpl;

public class EShopServiceFactory {

	private static EShop eshop;
	private static EShopPublish eshopPublish;

    private EShopServiceFactory() {

    }

    public static synchronized EShop getEShop() {
        if (eshop == null) {
        	eshop = new EShopImpl();
        }

        return eshop;
    }

    public static synchronized EShopPublish getEShopPublish() {
        if (eshopPublish == null) {
        	eshopPublish = new EShopPublishImpl();
        }

        return eshopPublish;
    }

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
