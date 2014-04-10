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
package com.photon.phresco.eshop.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import net.sf.json.JSONObject;

import com.photon.phresco.eshop.api.EShop;
import com.photon.phresco.eshop.factory.EShopServiceFactory;
import com.photon.phresco.eshop.models.rest.Product;
import com.photon.phresco.eshop.utils.Utility;

@Path("/specialproducts")
public class SpecialProductsResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getProducts(@QueryParam("callback") String callback)
			throws Exception {
		EShop shop = EShopServiceFactory.getEShop();
		List<Product> products = shop.getSpecialProducts();
		JSONObject jsonObj = new JSONObject();
		String productsJson = jsonObj.put("product", products).toString();
		return Utility.getJSONP(callback, productsJson);
	}


}