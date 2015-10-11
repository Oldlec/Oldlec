package com.oldlec.web.vo;

public class User {
	private int No;
	private String Id;
	private String PassWord;
	private String Email;
	private String Nickname;
	private boolean IsValid;
	
	
	
	/*    */
	

	public int getNo() {
		return No;
	}
	public void setNo(int no) {
		No = no;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
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
