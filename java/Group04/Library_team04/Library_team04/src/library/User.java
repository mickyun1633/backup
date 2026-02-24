package library;

public abstract class User {

	// User 추상클래스 설계
	// 사용자 기본정보 userId, userPw, login method
	private String userId;
	private String userPw;
	public User(String userId, String userPw) {
		this.userId = userId;
		this.userPw = userPw;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	
	
	public abstract boolean login(String id ,String pw); 


}
