package casting;
//11번 : 오버플로우 / 언더플로우 ★
public class CastingTest03 {
	public static void main(String[] args) {
		//오버플로우 : byte는 8비트(1byte) 가장 큰 값 다음은 다시 가장 작은 값으로 순환하게 됨
		byte byteNum = 127;
		System.out.println(byteNum);
//		System.out.println(byteNum + 1); //단순출력이므로 128이 잘 출력됨
		byteNum++; //byteNum + 1;
		System.out.println(byteNum); //-128

		//언더플로우
		System.out.println((float)1.0e-50);
		//1.0e-50 = 1.0 x 10^-50
		//0.00000000000000000000000000000000000000000000000001
		System.out.println((double)1.0e-50);
		
		//실수형 오버플로우 : 실수형은 범위를 넘으면 보통 Infinity(무한대)로 가거나 -Infinity가 됨
		float num7 = 10L; //자동형변환 ( long -> float ) ★ 추후 재확인
		double num8 = 10L; // 자동형변환 ( long -> double ) ★ 추후 재확인
		long big = 9_223_372_036_854_775_807L; // 2^53 + 1
		double number = big;
		//double 바꿀 때 오버플로우 없음
		//큰 long은 정확도가 1씩 안맞을 수 잇음
		System.out.println(number); //9.223372036854776E18
		float number2 = big;
		System.out.println(number2); //9.223372E18
		//long -> double => 오버플로우 x
		//long -> float	=> 오버플로우 x
		//결과가 근사값 => 정밀도 손실
		
		long max = Long.MAX_VALUE;
		double doubleCasting = max;
		float floatCasting = max;
		System.out.println("long 값 : " + max); //9223372036854775807
		System.out.println("double 변환 : " + doubleCasting);
		System.out.println("float 변환 : " + floatCasting);
		//IEEE 754 정밀도 손실
		//E18 -> 10^18
		//long 최대값 근처
		//오버플로우 아님
		
	}
}
