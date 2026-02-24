package section06; //01.21 윤철민

import java.util.Random;

/*	카드게임에 사용된 카드는 중복되는 숫자 없이 총 10장입니다
	배열과 랜덤 함수를 이용해 철수가 게임에 사용했던 카드를 구해보세요
 	카드에 적힌 숫자는 1부터 10이며, 카드는 섞여있으므로 순서는 상관 없습니다	*/
public class Ex01 {
	public static void main(String[] args) {
		// 중복x, 배열, 랜덤
		
		// 카드 1~10 카드 배열 생성
		// 정수형 배열 선언과 동시에 1~10 저
		int[] cards = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		// 랜덤 객체 생성
		// 랜덤 import - ctrl + shift + o
		Random rand = new Random();
		// 카드 10번 섞기
		// for문 
		for(int i = 0; i < 10; i++) {
			int randomIndex = rand.nextInt(10);
		}
	}
}