package twoArray;

import java.util.Arrays;

//4번 : 삽입정렬
public class InsertionSort {
	public static void main(String[] args) {
		int[] number = { 5, 2, 9, 1, 6 };
		System.out.println("초기배열 : ");

		for (int num : number) {
			System.out.print(num + " ");
		}
		System.out.println();

		for (int i = 1; i < number.length; i++) {
			int key = number[i]; // number[1] => 2
			int j = i - 1; // 1 - 1 = 0

			// while문 : key보다 큰 값을 오른쪽으로 이동
			while (j >= 0 && number[j] > key) { // j => 3
				number[j + 1] = number[j]; // number[4] = number[3]
				j--; // j = 2
			}
			number[j + 1] = key;
			System.out.println(i + "단계 : " + Arrays.toString(number));

		}

	}
}
