package com.photon.phresco.eshop.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.photon.phresco.eshop.api.EShop;
import com.photon.phresco.eshop.factory.EShopServiceFactory;
import com.photon.phresco.eshop.models.rest.Product;

@Path("/specialproducts")
public class SpecialProductsResource {

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Product> getProducts()
			throws Exception {
		EShop shop = EShopServiceFactory.getEShop();
		List<Product> products = shop.getSpecialProducts();

		return products;
	}


}