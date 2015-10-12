package com.oldlec.web.vo;

import java.util.Date;

public class User {
	private int No;

	private String PassWord;
	private String Email;
	private String Nickname;
	private boolean IsValid;
	
	
	/* User Role   */

	private String defaultRole;
	
	
	
	/*User Info*/
	private Date regDate;
	

	public int getNo() {
		return No;
	}
	public void setNo(int no) {
		No = no;
	}

	public String getPassWord() {
		return PassWord;
	}
	public void setPassWord(String passWord) {
		PassWord = passWord;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getNickname() {
		return Nickname;
	}
	public void setNickname(String nickname) {
		Nickname = nickname;
	}
	public boolean isIsValid() {
		return IsValid;
	}
	public void setIsValid(boolean isValid) {
		IsValid = isValid;
	}

	
}
