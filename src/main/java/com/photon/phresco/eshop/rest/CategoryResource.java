package com.photon.phresco.eshop.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.photon.phresco.eshop.api.EShop;
import com.photon.phresco.eshop.factory.EShopServiceFactory;
import com.photon.phresco.eshop.models.rest.Category;
import com.photon.phresco.eshop.models.rest.Product;

@Path("/categories")
public class CategoryResource {

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Category> getCategories() throws Exception {
		EShop shop = EShopServiceFactory.getEShop();
		List<Category> categories = shop.getCategories();
		System.out.println("categories = " + categories);
		return categories;
	}

	@GET
	@Path("{categoryId}")
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Product> getProducts(
			@PathParam("categoryId") int categoryId) throws Exception {
		System.out.println("categoryId = " + categoryId);
		EShop shop = EShopServiceFactory.getEShop();
		List<Product> products = shop.getProducts(categoryId);
		return products;
	}

}