package twoArray;

//1번 : 2차원배열(행과 열로 구성된 데이터를 저장하는 배열의 형태)
public class TwoArrayTest01 {
	public static void main(String[] args) {
		// 1차원 배열의 선언과 생성
		int[] ar1 = new int[4];
		System.out.println(ar1);
		System.out.println("1차원배열의 길이 : " + ar1.length);
		System.out.println("ar1[0]의 값 : " + ar1[0]);
		System.out.println("ar1[1]의 값 : " + ar1[1]);
		System.out.println("ar1[2]의 값 : " + ar1[2]);
		ar1[3] = 10;
		System.out.println("ar1[3]의 값 : " + ar1[3]);

		// 2차원 배열의 선언과 생성
		int[][] ar2 = new int[2][3];
		System.out.println(ar2); // [[I@681a9515
		int[][] ar3 = new int[3][2];
		System.out.println(ar3); // [[I@3af49f1c
		System.out.println("ar3[0]은 행을 의미 : " + ar3[0]); // [I@19469ea2 0행의 참조값(1차원배열)
		// 1차원 배열을 의미하므로 해당 행의 시작주소값이 나온다
		// [0, 0]
		System.out.println(ar3[0][0]);
		// 1차원 배열의 첫번째 값 출력

		// 2차원 배열의 선언과 생성2
		int[][] ar4 = { { 10, 20, 30 }, { 40, 50, 60 } };
		System.out.println(ar4); // 2차원배열 [[
		System.out.println(ar4[0]); // 행을의미 1차원배열 [
		System.out.println(ar4[1]); // 행을의미 1차원배열 [

		System.out.println(ar4[0][0]);
		System.out.println(ar4[0][1]);
		System.out.println(ar4[0][2]);
		System.out.println(ar4[1][0]);
		System.out.println(ar4[1][1]);
		System.out.println(ar4[1][2]);

		System.out.println("2차원 배열(행)의 길이 : " + ar4.length);
		System.out.println("2차원 배열(열)의 길이 : " + ar4[0].length);

//		System.out.println(ar2);
//		for(int i = 0; i < ar2.length; i++) { //행 반복
//			System.out.println("ar2.length의 값(ar2의 행의 길이) : " + ar2.length);
//			System.out.println("ar2.length의 값(ar2의 행의 길이) : " + ar2[i]);
//			for(int j = 0; j < ar2[i].length; j++) { //열 반복
//				System.out.println(i + "행 : " + ar2[i] + ", " + j + "열 : " + j + ", ar2[i][j]의 값 : " + ar2[i][j]);
//			}
//		}

		// ar2 => 2행 3열
		// 1 2 3
		// 4 5 6
//		00	01	02
//		10	11	12

//		1	2	3
//		2	3	4
		// 방법2) 카운터 변수 사용
		int num = 1;
		for (int i = 0; i < ar2.length; i++) {
			// 방법3) 행 기준 시작값 계산
			int start = i * ar2[i].length + 1;
			for (int j = 0; j < ar2[i].length; j++) {
//				ar2[i][j] = i + j + 1;
				// 방법1) 배열의 길이를 이용한다(힌트) => 1차원 배열처럼 생각하기
//				ar2[i][j] = i * ar2[i].length + j + 1;

				// 방법2) 카운터 변수를 사용
//				ar2[i][j] = num++;
//				System.out.print(ar2[i][j] + " ");

				// 방법3) 행 기준 시작값 계산
				ar2[i][j] = start + j;
				System.out.print(ar2[i][j] + " ");

			}
			System.out.println();
		}

	}
}
