package com.oldlec.web.vo;

import java.util.Date;

public class ArticleVote {
	private int ArticleNo;
	private int UserNo;
	private boolean IsLiked;
	private Date LikeDate;
	
	public int getArticleNo() {
		return ArticleNo;
	}
	public void setArticleNo(int articleNo) {
		ArticleNo = articleNo;
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
