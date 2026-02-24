package twoArray;
//8번 : 깊은 복사
public class DeepCopy {
	public static void main(String[] args) {
		
		// 배열과 내부 요소까지 모두 새로 복사
		int[] ar1 = {1, 2, 3};
		int[] ar2 = ar1.clone();
		
		System.out.println(ar1[0]);
		System.out.println(ar2[0]);
		
		ar2[0] = 100;
		System.out.println(ar1[0]);
		System.out.println(ar2[0]);
		
	}
}
