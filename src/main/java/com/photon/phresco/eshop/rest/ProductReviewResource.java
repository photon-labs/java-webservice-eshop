package com.photon.phresco.eshop.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.photon.phresco.eshop.api.EShop;
import com.photon.phresco.eshop.factory.EShopServiceFactory;
import com.photon.phresco.eshop.models.rest.OutputResponse;
import com.photon.phresco.eshop.models.rest.ProductReview;

@Path("/product")
@Produces(MediaType.APPLICATION_JSON)
public class ProductReviewResource {

	@POST
	@Path("/post/review")
	@Consumes("text/plain")
	@Produces(MediaType.APPLICATION_JSON)
	public OutputResponse postClichedMessage(String review) throws Exception {
	    // Store the message
		System.out.println("Message = " + review);
		Gson gson = new Gson();
		ProductReview productReview = gson.fromJson(review, ProductReview.class);
		EShop shop = EShopServiceFactory.getEShop();
		//JSONObject jsonObject = JSONObject.fromObject(review);
		//System.out.println("jsonObject = " + jsonObject);
		OutputResponse or = shop.postReview(productReview);

		return or;
	}
}