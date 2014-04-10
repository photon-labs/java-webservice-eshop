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

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.photon.phresco.eshop.commons.exception.EShopException;
import com.photon.phresco.eshop.commons.exception.ExceptionUtil;
import com.photon.phresco.eshop.models.CategoryHBM;
import com.photon.phresco.eshop.models.ProductHBM;
import com.photon.phresco.eshop.models.ReviewHBM;
import com.photon.phresco.eshop.models.UserHBM;
import com.photon.phresco.eshop.models.rest.Comment;
import com.photon.phresco.eshop.models.rest.KeyValue;
import com.photon.phresco.eshop.models.rest.Rating;
import com.photon.phresco.eshop.models.rest.Review;
import com.photon.phresco.eshop.utils.ServiceUtil;

public class EShopService {

	private HibernateTemplate template;
	private ExceptionUtil exceptionUtil = ExceptionUtil.getInstance();

	public void setSessionFactory(SessionFactory sessionFactory) {
		template = new HibernateTemplate(sessionFactory);
	}

	public List<CategoryHBM> getCategories() throws EShopException {
		@SuppressWarnings("unchecked")
		List<CategoryHBM> categoryList = (List<CategoryHBM>) template
			.execute(new HibernateCallback() {
				public Object doInHibernate(Session session)
						throws HibernateException, SQLException {
					DetachedCriteria criteria = DetachedCriteria.forClass(CategoryHBM.class);
					List<CategoryHBM> categoryHBMs = template.findByCriteria(criteria);
					List<CategoryHBM> categoryHBMList = new ArrayList<CategoryHBM>(10);

					for (CategoryHBM categoryHBM : categoryHBMs) {
						List<Integer> count = session.createCriteria(ProductHBM.class)
								.setProjection(Projections.rowCount()).
								add(Restrictions.eq("categoryId",categoryHBM.getCategoryId())).list();

						System.out.println("Count = " + count);
						categoryHBM.setTotalProducts((int) count.get(0));
						categoryHBMList.add(categoryHBM);
					}

					return categoryHBMList;
				}
			});

		return categoryList;
	}

	public List<ProductHBM> getProducts(final int categoryId) throws EShopException {
		@SuppressWarnings("unchecked")
		List<ProductHBM> productList = (List<ProductHBM>) template
		.execute(new HibernateCallback() {
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				DetachedCriteria criteria = DetachedCriteria.forClass(ProductHBM.class).
				add(Restrictions.eq("categoryId", categoryId));

				List<ProductHBM> productHBMs = template.findByCriteria(criteria);
				List<ProductHBM> productHBMList = new ArrayList<ProductHBM>(10);

				for (ProductHBM productHBM : productHBMs) {
					Object[] values = {1, 2, 3, 4, 5};
					List<ReviewHBM> reviewHBMs = session.createCriteria(ReviewHBM.class)
						.add(Restrictions.in("ratings", values))
						.add(Restrictions.eq("productId", productHBM.getProductId())).list();

					int rating = 0;

					// TODO average rating calculation not working
					if (reviewHBMs != null && reviewHBMs.size() > 0) {
						ReviewHBM reviewHBM = reviewHBMs.get(0);
						rating = ServiceUtil.getRating(reviewHBM.getRatings());
					}

					productHBM.setRating(rating);
					productHBMList.add(productHBM);
				}

				return productHBMList;
			}
		});

		return productList;
	}

	public List<ProductHBM> getProducts() throws EShopException {
		@SuppressWarnings("unchecked")
		List<ProductHBM> productList = (List<ProductHBM>) template
			.execute(new HibernateCallback() {
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				DetachedCriteria criteria = DetachedCriteria.forClass(ProductHBM.class);

				List<ProductHBM> productHBMs = template.findByCriteria(criteria);
				List<ProductHBM> productHBMList = new ArrayList<ProductHBM>(100);

				for (ProductHBM productHBM : productHBMs) {
					Object[] values = {1, 2, 3, 4, 5};
					List<ReviewHBM> reviewHBMs = session.createCriteria(ReviewHBM.class)
						.add(Restrictions.in("ratings", values))
						.add(Restrictions.eq("productId", productHBM.getProductId())).list();
					int rating = 0;

					// TODO average rating calculation not working
					if (reviewHBMs != null && reviewHBMs.size() > 0) {
						ReviewHBM reviewHBM = reviewHBMs.get(0);
						rating = ServiceUtil.getRating(reviewHBM.getRatings());
					}

					productHBM.setRating(rating);
					productHBMList.add(productHBM);
				}

				return productHBMList;
			}
		});

		return productList;
	}

	public List<ProductHBM> getSpecialProducts() throws EShopException {
		@SuppressWarnings("unchecked")
		List<ProductHBM> productList = (List<ProductHBM>) template
		.execute(new HibernateCallback() {
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				DetachedCriteria criteria = DetachedCriteria.forClass(ProductHBM.class).
				add(Restrictions.eq("specialProduct", 1));

				List<ProductHBM> productHBMs = template.findByCriteria(criteria);
				List<ProductHBM> productHBMList = new ArrayList<ProductHBM>(10);

				for (ProductHBM productHBM : productHBMs) {
					Object[] values = {1, 2, 3, 4, 5};
					List<ReviewHBM> reviewHBMs = session.createCriteria(ReviewHBM.class)
						.add(Restrictions.in("ratings", values))
						.add(Restrictions.eq("productId", productHBM.getProductId())).list();

					int rating = 0;

					// TODO average rating calculation not working
					if (reviewHBMs != null && reviewHBMs.size() > 0) {
						ReviewHBM reviewHBM = reviewHBMs.get(0);
						rating = ServiceUtil.getRating(reviewHBM.getRatings());
					}

					productHBM.setRating(rating);
					productHBMList.add(productHBM);
				}

				return productHBMList;
			}
		});

		return productList;
	}

	public List<ProductHBM> getNewProducts() throws EShopException {
		@SuppressWarnings("unchecked")
		List<ProductHBM> productList = (List<ProductHBM>) template
		.execute(new HibernateCallback() {
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				DetachedCriteria criteria = DetachedCriteria.forClass(ProductHBM.class).
				add(Restrictions.eq("newProduct", 1));

				List<ProductHBM> productHBMs = template.findByCriteria(criteria);
				List<ProductHBM> productHBMList = new ArrayList<ProductHBM>(10);

				for (ProductHBM productHBM : productHBMs) {
					Object[] values = {1, 2, 3, 4, 5};
					List<ReviewHBM> reviewHBMs = session.createCriteria(ReviewHBM.class)
						.add(Restrictions.in("ratings", values))
						.add(Restrictions.eq("productId", productHBM.getProductId())).list();

					int rating = 0;

					// TODO average rating calculation not working
					if (reviewHBMs != null && reviewHBMs.size() > 0) {
						ReviewHBM reviewHBM = reviewHBMs.get(0);
						rating = ServiceUtil.getRating(reviewHBM.getRatings());
					}

					productHBM.setRating(rating);
					productHBMList.add(productHBM);
				}

				return productHBMList;
			}
		});

		return productList;
	}

	public ProductHBM getProduct(final int productId) throws EShopException {
		@SuppressWarnings("unchecked")
		ProductHBM productHBM = (ProductHBM) template
			.execute(new HibernateCallback() {
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				DetachedCriteria criteria = DetachedCriteria.forClass(ProductHBM.class).
				add(Restrictions.eq("productId", productId));

				List<ProductHBM> productHBMs = template.findByCriteria(criteria);
				ProductHBM productHBM = null;

				if (productHBMs.size() > 0) {
					productHBM = productHBMs.get(0);
					Object[] values = {1, 2, 3, 4, 5};

					List<ReviewHBM> reviewHBMs = session.createCriteria(ReviewHBM.class)
						.add(Restrictions.in("ratings", values))
						.add(Restrictions.eq("productId", productHBM.getProductId())).list();

					int rating = 0;
	
					// TODO average rating calculation not working
					if (reviewHBMs != null && reviewHBMs.size() > 0) {
						ReviewHBM reviewHBM = reviewHBMs.get(0);
						rating = ServiceUtil.getRating(reviewHBM.getRatings());
					}
	
					productHBM.setRating(rating);
				}

				return productHBM;
			}
		});

		return productHBM;
	}

	public Review getReviews(final int productId) throws EShopException {
		@SuppressWarnings("unchecked")
		Review review = (Review) template.execute(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Review review = new Review();
				review.setProductId(productId);
				review.setUserId(1);
				List<KeyValue> ratings = new ArrayList<KeyValue>(5);
				Rating rating = new Rating();
				int total = 0;

				for (int i = 1; i <= 5; i++) {
					List<Integer> count = session.createCriteria(ReviewHBM.class).setProjection(Projections.rowCount())
							.add(Restrictions.eq("ratings", i)).add(Restrictions.eq("productId", productId)).list();
					System.out.println("count = " + count);
					int totalRating = (int) count.get(0);
					total += totalRating;
					System.out.println("Total Rating = " + totalRating);
					// reviewHBM.setTotalRating(totalRating);
					KeyValue keyvalue = new KeyValue(i, totalRating);
					ratings.add(keyvalue);
					rating.setRating(ratings);
					// reviews.add(reviewHBM);
				}

				Criteria crit = session.createCriteria(ReviewHBM.class).add(Restrictions.eq("productId", productId));
				ProjectionList p1 = Projections.projectionList();
				p1.add(Projections.property("comment"));
				p1.add(Projections.property("ratings"));
				p1.add(Projections.property("commentDate"));
				p1.add(Projections.property("userId"));

				crit.setProjection(p1);

				List<Comment> list = crit.list();

				Iterator iter = list.iterator();
				List<Comment> comments = new ArrayList<Comment>();
				while (iter.hasNext()) {
					Object[] obj = (Object[]) iter.next();
					Comment comment = null;
					for (int i = 0; i < obj.length; i++) {
						comment = new Comment();
						comment.setComment(obj[0].toString());
						comment.setRatings((Integer) obj[1]);
						java.sql.Date sqlDate = (java.sql.Date) obj[2];
						java.util.Date utilDate = new java.util.Date(sqlDate.getTime());
						comment.setCommentDate(utilDate);
						comment.setUserid((Integer) obj[3]);
						comments.add(comment);
						 Criteria criteria = session.createCriteria(UserHBM.class).add(Restrictions.eq("userId", (Integer) obj[3]));
						 ProjectionList p2 = Projections.projectionList();
						 p2.add(Projections.property("userName"));
						 criteria.setProjection(p2);
						 
						 List listusername = criteria.list();
						 Iterator iter1 = listusername.iterator();
							while (iter1.hasNext()) {
								Object[] obj1 = (Object[]) iter.next();
								for (int j = 0; j < obj1.length; j++) {
									System.out.println("obj{j] value ---> " + obj1[j]);
									comment.setUser((String) obj1[j]);
								}
							}
					}

				}

				int averateRating = ServiceUtil.getRating(total);
				review.setAverage(averateRating);
				review.setRatings(rating);
				review.setComments(comments);

				return review;
			}
		});

		return review;
	}

	public List<ProductHBM> searchProducts(final String namePattern) throws EShopException {
		@SuppressWarnings("unchecked")
		List<ProductHBM> productList = (List<ProductHBM>) template
		.execute(new HibernateCallback() {
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				DetachedCriteria criteria = DetachedCriteria.forClass(ProductHBM.class)
					.add(Restrictions.like("productName", "%" + namePattern + "%"))
					.add(Restrictions.like("productDescription", "%" + namePattern + "%"));

				List<ProductHBM> productHBMs = template.findByCriteria(criteria);
				List<ProductHBM> productHBMList = new ArrayList<ProductHBM>(10);

				for (ProductHBM productHBM : productHBMs) {
					Object[] values = {1, 2, 3, 4, 5};
					List<ReviewHBM> reviewHBMs = session.createCriteria(ReviewHBM.class)
						.add(Restrictions.in("ratings", values))
						.add(Restrictions.eq("productId", productHBM.getProductId())).list();

					int rating = 0;

					// TODO average rating calculation not working
					if (reviewHBMs != null && reviewHBMs.size() > 0) {
						ReviewHBM reviewHBM = reviewHBMs.get(0);
						rating = ServiceUtil.getRating(reviewHBM.getRatings());
					}

					productHBM.setRating(rating);
					productHBMList.add(productHBM);
				}

				return productHBMList;
			}
		});

		return productList;
	}

	public void postReview(ReviewHBM reviewHBM) throws EShopException {
		template.save(reviewHBM);
	}

	public void saveProduct(ProductHBM product) throws EShopException {
		template.save(product);
	}

	public void saveCategory(CategoryHBM category) throws EShopException {
		template.save(category);
	}

}