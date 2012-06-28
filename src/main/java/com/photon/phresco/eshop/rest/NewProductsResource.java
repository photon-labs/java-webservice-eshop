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

@Path("/newproducts")
public class NewProductsResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getProducts(@QueryParam("callback") String callback)
			throws Exception {
		EShop shop = EShopServiceFactory.getEShop();
		List<Product> products = shop.getNewProducts();
		JSONObject jsonObj = new JSONObject();
		String productsJson = jsonObj.put("product", products).toString();
		return Utility.getJSONP(callback, productsJson);
	}


}