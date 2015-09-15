package com.oldlec.web.vo;

import java.util.Date;

public class CommentVote {
	private int CommentNo;
	private int UserNo;
	private boolean IsLiked;
	private Date LikeDate;
	
	public int getCommentNo() {
		return CommentNo;
	}
	public void setCommentNo(int commentNo) {
		CommentNo = commentNo;
	}
	public int getUserNo() {
		return UserNo;
	}
	public void setUserNo(int userNo) {
		UserNo = userNo;
	}
	public boolean isIsLiked() {
		return IsLiked;
	}
	public void setIsLiked(boolean isLiked) {
		IsLiked = isLiked;
	}
	public Date getLikeDate() {
		return LikeDate;
	}
	public void setLikeDate(Date likeDate) {
		LikeDate = likeDate;
	}
}
