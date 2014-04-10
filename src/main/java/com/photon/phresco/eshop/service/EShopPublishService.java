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
package com.photon.phresco.eshop.service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.photon.phresco.eshop.commons.Constants;
import com.photon.phresco.eshop.models.CategoryHBM;
import com.photon.phresco.eshop.models.ProductHBM;
import com.photon.phresco.eshop.utils.ServiceUtil;

public class EShopPublishService implements Constants {

	private HibernateTemplate template;
	private InputStream is = this.getClass().getClassLoader()
			.getResourceAsStream("files/Eshop_product_details.xlsx");

	public void setSessionFactory(SessionFactory sessionFactory) {
		template = new HibernateTemplate(sessionFactory);
	}

	public boolean publishEShopData() {
		try {
			List<CategoryHBM> categories = getCategoriesFromExcel();
			List<ProductHBM> products = getProductsFromExcel();
			System.out.println("Categories");
			for (Iterator<CategoryHBM> itr = categories.iterator(); itr.hasNext();) {
				CategoryHBM category = (CategoryHBM) itr.next();
				template.save(category);
			}

			System.out.println("Products");
			for (Iterator<ProductHBM> itr = products.iterator(); itr.hasNext();) {
				ProductHBM product = (ProductHBM) itr.next();
				template.save(product);
			}
		} catch (Exception e) {
			return false;
		}

		return true;
	}

	public List<CategoryHBM> getCategoriesFromExcel() throws Exception {
		System.out.println("Inside getCategoriesFromExcel");
		XSSFWorkbook workbook = new XSSFWorkbook(is);
		System.out.println("workbook = " + workbook);
		XSSFSheet sheet = workbook.getSheet(EXCEL_SHEET_CATEGORIES);
		System.out.println("Sheet = " + sheet);
		List<CategoryHBM> categories = new ArrayList<CategoryHBM>(10);
		Iterator<Row> itr = sheet.rowIterator();
		System.out.println("itr " + itr);
		for (int i = 0; i < 1; i++) {
			itr.next();
		}
		while (itr.hasNext()) {
			try {
				Row row = itr.next();
				System.out.println("Row 0 value" + row.getCell(0));
				int categoryId = (int) row.getCell(0).getNumericCellValue();
				String categoryName = ServiceUtil.getValue(row.getCell(1));
				String categoryImage = ServiceUtil.getValue(row.getCell(2));
				String categoryDetailsImage = ServiceUtil.getValue(row.getCell(3));
				int categoryParentId = 0;
				String categoryDescription = ServiceUtil.getValue(row.getCell(5));
	
				CategoryHBM category = new CategoryHBM(categoryId, categoryName,
						categoryImage, categoryDetailsImage, categoryParentId,
						categoryDescription);
				categories.add(category);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return categories;
	}

	public List<ProductHBM> getProductsFromExcel() throws Exception {
		XSSFWorkbook workbook = new XSSFWorkbook(is);
		XSSFSheet sheet = workbook.getSheet(EXCEL_SHEET_PRODUCTS);
		List<ProductHBM> products = new ArrayList<ProductHBM>(10);
		Iterator<Row> itr = sheet.rowIterator();

		for (int i = 0; i < 1; i++) {
			itr.next();
		}

		while (itr.hasNext()) {
			try {
				Row row = itr.next();
				int productId = (int) row.getCell(0).getNumericCellValue();
				String productName = ServiceUtil.getValue(row.getCell(1));
				System.out.println("productId = " + productId);
				String manufacturer = ServiceUtil.getValue(row.getCell(2));
				int categoryId = (int) row.getCell(3).getNumericCellValue();
				System.out.println("categoryId = " + categoryId);
				String model = ServiceUtil.getValue(row.getCell(4));
				String specialProductStr = ServiceUtil.getValue(row.getCell(5));
				String newProductStr = ServiceUtil.getValue(row.getCell(6));
				Integer specialProduct = (YES.equals(specialProductStr) ? 1 : 0);
				Integer newProduct = (YES.equals(newProductStr) ? 1 : 0);
				Double listPrice = row.getCell(7).getNumericCellValue();
				System.out.println("listPrice = " + listPrice);
				Double sellPrice = row.getCell(8).getNumericCellValue();
				System.out.println("sellPrice = " + sellPrice);
				String productDescription = ServiceUtil.getValue(row.getCell(9));
				String productImage = ServiceUtil.getValue(row.getCell(10));
				String productDetailImage = ServiceUtil.getValue(row.getCell(11));
				Date createdDate = new Date();
				Date lastUpdatedDate = new Date();
				
				ProductHBM product = new ProductHBM(productId, productName, manufacturer,
						categoryId, model, specialProduct, newProduct, listPrice, sellPrice,
						productDescription, productImage, productDetailImage,
						createdDate, lastUpdatedDate);
				products.add(product);
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
		}

		return products;
	}

}
