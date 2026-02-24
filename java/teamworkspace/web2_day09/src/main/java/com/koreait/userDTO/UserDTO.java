package com.koreait.userDTO;

public class UserDTO {
	
/*	CREATE TABLE TBL_USER(
			user_number NUMBER, 정수형 
			user_id varchar2(50) NOT NULL, 문자열
			user_pw varchar2(100) NOT NULL, 문자열
			user_name varchar2(100) NOT NULL, 문자열
			user_email varchar2(100), 문자열
			CONSTRAINT pk_user PRIMARY KEY(user_number)
		);												*/
	
	//필드
	private int userNumber;
	private String userId;
	private String userPW;
	private String userName;
	private String userEmail;
	
	
	// getter, setter (alt + shift + s , r)
	public int getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPW() {
		return userPW;
	}
	public void setUserPW(String userPW) {
		this.userPW = userPW;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	
	// toString 오버라이딩 (
	@Override
	public String toString() {
		return "UserDTO [userNumber=" + userNumber + ", userId=" + userId + ", userPW=" + userPW + ", userName="
				+ userName + ", userEmail=" + userEmail + "]";
	}
	
	
	
	
}
