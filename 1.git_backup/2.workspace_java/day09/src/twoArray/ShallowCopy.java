package twoArray;
//7번 : 얕은 복사
public class ShallowCopy {
	public static void main(String[] args) {
		//참조만 복사
		//원본 배열과 복사 배열이 같은 객체를 가리킴
		
		int[] ar1 = {1, 2, 3};
		int[] ar2 = ar1;
		System.out.println(ar1[0]);
		System.out.println(ar2[0]);
		ar2[0] = 100;
		System.out.println(ar1[0]);
		System.out.println(ar2[0]);
	
	
	
	}
}
