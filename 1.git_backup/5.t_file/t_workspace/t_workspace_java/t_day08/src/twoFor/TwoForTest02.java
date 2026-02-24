package twoFor;
//2번 : 이중for문
public class TwoForTest02 {
	public static void main(String[] args) {
		
		// * * * 
		// * * *
		// * * *
		
		for(int i = 1; i <= 3; i++) {
//			System.out.println(i);
			for(int j = 1; j <= 3; j++) {
//				System.out.print("i : " + i + ", j : " + j + "\t");
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//	*
		//	* *
		//	* * *
		//	* * * *
		
		for(int i = 1; i <= 4; i++) {
//			System.out.println(i);
			for(int j = 1; j <= i; j++) {
//				System.out.println(j);
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// 1 2 3
		// 1 2 3
		// 1 2 3
		
		for(int i = 0; i < 3; i++) {
//			System.out.println(i);
			for(int j = 1; j <=3; j++ ) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		
	}
}
