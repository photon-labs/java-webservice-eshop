package com.photon.phresco.eshop.models.rest;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Comment {
	private int ratings;
	private String comment;
	private int userid;
	private Date commentDate;
	private double average;

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public Date getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}

	public Comment() {
	}


	public Comment(int userid2, Date commentDate2,String Comment,int ratings) {
		this.userid = userid2;
		this.commentDate = commentDate2;
		this.comment=Comment;
		this.ratings=ratings;
	}

}
