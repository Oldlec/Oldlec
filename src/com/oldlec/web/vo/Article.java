package com.oldlec.web.vo;

import java.util.Date;

public class Article {
	private int no;
	private String title;
	private String content;
	private int view;
	private Date regDate;
	private Date modDate;
	private int categoryNo;
	private int userNo;
	private boolean isValid;
	
	
	
	/* values for ArticleView */
	private String writerName;
	private int cntCmnt;
	private int cntLiked;
	private int cntNotLiked;
	


	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getView() {
		return view;
	}
	public void setView(int view) {
		this.view = view;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Date getModDate() {
		return modDate;
	}
	public void setModDate(Date modDate) {
		this.modDate = modDate;
	}
	public int getCategoryNo() {
		return categoryNo;
	}
	public void setCategoryNo(int categoryNo) {
		this.categoryNo = categoryNo;
	}
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public boolean isValid() {
		return isValid;
	}
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
	public String getWriterName() {
		return writerName;
	}
	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}

	public int getCntCmnt() {
		return cntCmnt;
	}
	public void setCntCmnt(int cntCmnt) {
		this.cntCmnt = cntCmnt;
	}
	public int getCntLiked() {
		return cntLiked;
	}
	public void setCntLiked(int cntLiked) {
		this.cntLiked = cntLiked;
	}
	public int getCntNotLiked() {
		return cntNotLiked;
	}
	public void setCntNotLiked(int cntNotLiked) {
		this.cntNotLiked = cntNotLiked;
	}
	
	
	
	
}
