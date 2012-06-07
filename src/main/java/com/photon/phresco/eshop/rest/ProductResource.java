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
import com.photon.phresco.eshop.models.rest.Review;

@Path("/products")
public class ProductResource {

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Product> getProducts()
			throws Exception {
		EShop shop = EShopServiceFactory.getEShop();
		List<Product> products = shop.getProducts();

		return products;
	}

	@GET
	@Path("{productId}")
	@Produces({ MediaType.APPLICATION_JSON })
	public Product getProduct(@PathParam("productId") String productId)
			throws Exception {
		int id = Integer.parseInt(productId);
		EShop shop = EShopServiceFactory.getEShop();
		Product product = shop.getProduct(id);

		return product;
	}

	@GET
	@Path("/{productid}/reviews")
	@Produces({ MediaType.APPLICATION_JSON })
	public Review getReviews(@PathParam("productid") String productid)
			throws Exception {
		int id = Integer.parseInt(productid);
		EShop shop = EShopServiceFactory.getEShop();
		Review review = shop.getReview(id);

		return review;
	}

}