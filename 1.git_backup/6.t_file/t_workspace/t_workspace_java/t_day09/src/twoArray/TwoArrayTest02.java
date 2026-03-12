package twoArray;

//2번 : 2차원 배열과 for-each문
public class TwoArrayTest02 {
	public static void main(String[] args) {
		int[] ar1 = { 10, 20, 30, 40 }; // 4열
		int[][] ar2 = { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 } }; // 4행 2열

		System.out.println("1차원 배열 길이 : " + ar1.length);
		System.out.println("2차원 행의 길이 : " + ar2.length);
		System.out.println("2차원 열의 길이 : " + ar2[0].length);

		// for문 => 인덱스 사용
		for (int i = 0; i < ar2.length; i++) {
			for (int j = 0; j < ar2[i].length; j++) {
				System.out.print(ar2[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i] + " ");
		}
		System.out.println();

		// for-each문
//		for(자료형 변수명 : 배열명) {
//			
//		}
		for (int num : ar1) {
			System.out.println(num);
		}

		for (int[] data : ar2) {
			System.out.println(data);
			for (int value : data) {
				System.out.println(value);
			}
		}

	}
}
