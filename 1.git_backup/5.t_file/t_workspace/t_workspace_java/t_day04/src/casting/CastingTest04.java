package casting;
//12번 : 강제형변환
public class CastingTest04 {
	public static void main(String[] args) {
		
		//정수 -> 정수 (큰타입 값 -> 작은타입 저장공간)
		int num1 = (int)3L;
		System.out.println(num1);
		
		//실수 -> 정수 (소수점 버림)
		double doubleNum = 4.225;
		int intNum = (int)doubleNum;
		System.out.println(intNum);
		
		//정수 -> 문자
		int charNum = 65;
		char ch = (char)charNum;
		System.out.println(ch); //A
		
		//문자 -> 정수
		char ch2 = 'a';
		int intNum2 = (int)ch2;
		System.out.println(intNum2); //97
		
	}
}
