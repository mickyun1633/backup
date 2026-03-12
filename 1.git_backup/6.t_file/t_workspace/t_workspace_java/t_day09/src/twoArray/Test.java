package twoArray;

public class Test {
	public static void main(String[] args) {
		int[][] ar = {{1, 2, 3}, {4, 5}, {6}}; 
		//각 행의 길이가 다름 => 가변배열(비정형 배열)
		
		for(int[] arr : ar) {
			for(int num : arr) {
				System.out.print(num);
			}
			System.out.println();
		}
	}
}
