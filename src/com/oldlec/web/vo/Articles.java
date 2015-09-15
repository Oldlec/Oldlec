package com.oldlec.web.vo;

import java.util.Date;

public class Articles {
	private int No;
	private String Title;
	private String Content;
	private int View;
	private Date RegDate;
	private Date ModDate;
	private int CategoryNo;
	private int UserNo;
	private boolean IsValid;
	
	public int getNo() {
		return No;
	}
	public void setNo(int no) {
		No = no;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public int getView() {
		return View;
	}
	public void setView(int view) {
		View = view;
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
	public int getCategoryNo() {
		return CategoryNo;
	}
	public void setCategoryNo(int categoryNo) {
		CategoryNo = categoryNo;
	}
	public int getUserNo() {
		return UserNo;
	}
	public void setUserNo(int userNo) {
		UserNo = userNo;
	}
	public boolean isIsValid() {
		return IsValid;
	}
	public void setIsValid(boolean isValid) {
		IsValid = isValid;
	}
}
