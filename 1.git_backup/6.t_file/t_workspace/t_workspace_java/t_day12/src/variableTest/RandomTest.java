package variableTest;

import java.util.Random;

//9번 : Random 클래스
public class RandomTest {
	public static void main(String[] args) {
		Random r = new Random();
		
		System.out.println(r.nextInt());
		System.out.println(r.nextInt(10)); // 0 ~ 9 사이의 정수 중 하나가 출력됨
		//1 ~ 10 난수 출력
		System.out.println(r.nextInt(10) + 1); // 1 ~ 10 사이의 정수중 하나가 출력됨
		//20 ~ 30 사이 난수 출력
		System.out.println(r.nextInt(11) + 20);
		//공식 : random.nextInt(끝값 - 시작값  + 1) + 시작값
		
	}
}
