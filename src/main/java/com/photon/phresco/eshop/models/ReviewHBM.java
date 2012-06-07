package com.photon.phresco.eshop.models;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ReviewHBM {

	private int reviewId;
	private int productId;
	private int userId;
	private int ratings;
	private String comment;
	private Date commentDate;
	private int totalRating;

	public ReviewHBM() {

	}

	public ReviewHBM(int reviewId, int productId, int userId, int ratings,
			String comment, Date commentDate) {
		this.reviewId = reviewId;
		this.productId = productId;
		this.userId = userId;
		this.ratings = ratings;
		this.comment = comment;
		this.commentDate = commentDate;
	}

	/**
	 * @return the reviewId
	 */
	public int getReviewId() {
		return reviewId;
	}

	/**
	 * @param reviewId
	 *            the reviewId to set
	 */
	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}

	/**
	 * @param productId
	 *            the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the ratings
	 */
	public int getRatings() {
		return ratings;
	}

	/**
	 * @param ratings
	 *            the ratings to set
	 */
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment
	 *            the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @return the commentDate
	 */
	public Date getCommentDate() {
		return commentDate;
	}

	/**
	 * @param commentDate
	 *            the commentDate to set
	 */
	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}

	/**
	 * @return the totalRating
	 */
	public int getTotalRating() {
		return totalRating;
	}

	/**
	 * @param totalRating
	 *            the totalRating to set
	 */
	public void setTotalRating(int totalRating) {
		this.totalRating = totalRating;
	}

}
