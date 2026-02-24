package review;

public class Array {

	int num;

	public static void main(String[] args) {
		Array a = new Array();
//		System.out.println(a.num);
//		int[][] ar = null;
//		System.out.println(ar);
//		int num = 0;
//		System.out.println(num);
		int[][] ar = new int[3][];

		for (int i = 0; i < ar.length; i++) {
//			System.out.println(i);	
			for (int j = 0; j < i + 1; j++) {
//				System.out.print(i + j + 1 + " ");
				System.out.println((i * (i + 1)) / 2 + j + 1);
			}
			System.out.println();
		}

		// 중첩 반복문일 경우 연속된 값이 필요하면
		// 인덱스가 아닌 별도의 증가 변수를 사용한다
		int num = 1;

		for (int i = 0; i < ar.length; i++) {
			ar[i] = new int[i + 1];
			for (int j = 0; j < ar[i].length; j++) {
//				System.out.println();
				ar[i][j] = num++;
				System.out.print(ar[i][j]);
			}
			System.out.println();
		}

		// (i * (i + 1))/2 + j + 1;
	}
}
