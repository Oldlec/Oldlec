package com.oldlec.web.vo;

import java.util.Date;

public class UserInfo {
	private int UserNo;
	private Date RegDate;
	
	public int getUserNo() {
		return UserNo;
	}
	public void setUserNo(int userNo) {
		UserNo = userNo;
	}
	public Date getRegDate() {
		return RegDate;
	}
	public void setRegDate(Date regDate) {
		RegDate = regDate;
	} 
}
