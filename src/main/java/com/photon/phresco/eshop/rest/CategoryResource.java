package com.photon.phresco.eshop.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import net.sf.json.JSONException;
import net.sf.json.JSONObject;

import com.photon.phresco.eshop.api.EShop;
import com.photon.phresco.eshop.factory.EShopServiceFactory;
import com.photon.phresco.eshop.models.rest.Category;
import com.photon.phresco.eshop.models.rest.Product;
import com.photon.phresco.eshop.utils.Utility;

@Path("/categories")
public class CategoryResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String  getCategories(@QueryParam("callback") String callback) throws JSONException, Exception {
		EShop shop = EShopServiceFactory.getEShop();
		List<Category> categories = shop.getCategories();
		System.out.println("categories = " + categories);
		JSONObject jsonObj = new JSONObject();
		String categoriesJson = jsonObj.put("category", categories).toString();
		return Utility.getJSONP(callback, categoriesJson);
	}
	
	@GET
	@Path("{categoryId}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getProducts(
			@PathParam("categoryId") int categoryId, @QueryParam("callback") String callback) throws Exception {
		System.out.println("categoryId = " + categoryId);
		EShop shop = EShopServiceFactory.getEShop();
		List<Product> products = shop.getProducts(categoryId);
		JSONObject jsonObj = new JSONObject();
		String productsJson = jsonObj.put("product", products).toString();
		return Utility.getJSONP(callback, productsJson);
	}
}