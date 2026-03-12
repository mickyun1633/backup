package casting;
//9번 : 기본형변환
public class CastingTest01 {
	public static void main(String[] args) {
		
		//정수 <-> 정수
		int num1 = (int)3L; //강제형변환 ( long -> int )
		System.out.println(num1);
		long num2 = 3;	//자동형변환 ( int -> long)
		System.out.println(num2);
		
		//실수 <-> 실수
		float num3 = (float)3.0; //강제형변환(double -> float )
		double num4 = 3.14f; //자동형변환( float -> double )
		System.out.println(num3);
		System.out.println(num4);
		
		//정수 -> 실수
		float num5 = 10; //자동형변환( int -> float ) 
		double num6 = 3; //자동형변환( int -> double)
		float num7 = 10L; //자동형변환 ( long -> float ) ★ 추후 재확인
		double num8 = 10L; // 자동형변환 ( long -> double ) ★ 추후 재확인
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num7);
		System.out.println(num8);
		
		//실수 -> 정수
		int num9 = (int)3.15f; // 강제 형변환 ( float -> int) 소수점 버림
		long num10 = (long)5.1555; // 강제 형변환 ( double -> long) 소수점 버림
		System.out.println(num9);
		System.out.println(num10);
		
	}
}










