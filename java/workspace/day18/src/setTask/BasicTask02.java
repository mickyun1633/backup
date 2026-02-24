package setTask; //01.23

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BasicTask02 {
	public static void main(String[] args) {

		// List 사용(시간 15분)

		// 1) Random 클래스를 이용해서 1 ~ 45 사이의 숫자 6개를 중복없이 생성
		// Random 클래스 생성 new
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		// List 사용, Integer, ArrayList<>()
		List<Integer> lotto = new ArrayList<>();
		
		// 2) 생성된 번호를 배열 lotto에 저장한다
		// while문
		// size()
		while (lotto.size() < 6) {
			int num = r.nextInt(45) + 1;
			if(!lotto.contains(num)) {
				lotto.add(num);
			}	
		}
		// 3) 사용자에게 1 ~ 45사이 숫자 6개를 입력받아 user에 저장
		List<Integer> user = new ArrayList<>();
		System.out.println("중복!");
		
		
		
		
		
		
		
		

		// 4) 로또번호와 user가 작성한 번호를 비교해서 일치하는 개수를 구한다

		// 5) 로또번호와 user가 작성한 번호를 각각 오름차순 정렬해서 출력한다
	}
}