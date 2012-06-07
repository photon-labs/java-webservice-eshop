package com.photon.phresco.eshop.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.photon.phresco.eshop.api.EShop;
import com.photon.phresco.eshop.factory.EShopServiceFactory;
import com.photon.phresco.eshop.models.rest.Product;

@Path("/search")
public class SearchResource {

	@GET
	@Path("{namePattern}")
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Product> getProducts(@PathParam("namePattern") String namePattern)
			throws Exception {
		EShop shop = EShopServiceFactory.getEShop();
		List<Product> products = shop.searchProducts(namePattern);

		return products;
	}

}