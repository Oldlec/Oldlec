package com.oldlec.web.vo;

import java.util.Date;

public class Comment {
	private int Content;
	private Date RegDate;
	private Date ModDate;
	private int UserNo;
	private int ArticleNo;
	private boolean IsValid;
	
	public int getContent() {
		return Content;
	}
	public void setContent(int content) {
		Content = content;
	}
	public Date getRegDate() {
		return RegDate;
	}
	public void setRegDate(Date regDate) {
		RegDate = regDate;
	}
	public Date getModDate() {
		return ModDate;
	}
	public void setModDate(Date modDate) {
		ModDate = modDate;
	}
	public int getUserNo() {
		return UserNo;
	}
	public void setUserNo(int userNo) {
		UserNo = userNo;
	}
	public int getArticleNo() {
		return ArticleNo;
	}
	public void setArticleNo(int articleNo) {
		ArticleNo = articleNo;
	}
	public boolean isIsValid() {
		return IsValid;
	}
	public void setIsValid(boolean isValid) {
		IsValid = isValid;
	}
}
