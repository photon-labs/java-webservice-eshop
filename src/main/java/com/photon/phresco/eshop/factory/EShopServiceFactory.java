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
