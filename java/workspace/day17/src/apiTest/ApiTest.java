package apiTest;
//1번 : 자바 기본 API(Java Standard API)
public class ApiTest {
	public static void main(String[] args) {
		
		
		String text = "java String API";
		String text1 = "abc";
		
		//문자열길이 .length() : Compact String을 위해 바이트 길이를 문자길이로
								//변환하는 코드로 되어있는 메소드
		System.out.println(text.length());
		System.out.println(text1.length());
		// byte[] => -97, 98, 99]
		// 3 >> 0 = 3
		
		// 문자 추출 .charAt(int idx)
		System.out.println(text1.charAt(0));
		
		//Math 클래스
		System.out.println(Math.ceil(10.8));	//ceil()올림
		System.out.println(Math.floor(10.8));	//floor() 내림
		System.out.println(Math.round(9.5));	//round() 반올림(소수점 첫번째 자리에서 반올림)
		
	}
	
	
	
	
	
	
	
}
