package com.photon.phresco.eshop.api;

import java.util.List;

import com.photon.phresco.eshop.commons.Constants;
import com.photon.phresco.eshop.commons.exception.EShopException;
import com.photon.phresco.eshop.models.rest.Category;
import com.photon.phresco.eshop.models.rest.OutputResponse;
import com.photon.phresco.eshop.models.rest.Product;
import com.photon.phresco.eshop.models.rest.ProductReview;
import com.photon.phresco.eshop.models.rest.Review;

public interface EShop extends Constants {

	public List<Category> getCategories() throws EShopException;

	public List<Product> getProducts(int categoryId) throws EShopException;
	
	public List<Product> getProducts() throws EShopException;
	
	public Product getProduct(int productId) throws EShopException;

	public Review getReview(int productId) throws EShopException;

	public List<Product> searchProducts(String namePattern) throws EShopException;

	public List<Product> getSpecialProducts() throws EShopException;
	
	public List<Product> getNewProducts() throws EShopException;

	public OutputResponse postReview(ProductReview productReview) throws EShopException;

}
