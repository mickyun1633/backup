package library;

import java.util.HashMap;

public class LoginManager {

//	LoginManager 클래스 설계
//	(Map에 사용자 저장/조회)
//	사용자 로그인 기능 구현 	메소드명 : Login

	private HashMap<String, String> user = new HashMap<>();
	

	 public HashMap<String, String> getUser() {
		return user;
	}


	 void idAdd(User user) {
		this.user.put(user.getUserId(),user.getUserPw()); 
		
	}
	
	
}
