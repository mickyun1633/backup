package method;
// 9번 : Call By Reference
public class CallByReference {
	public static void main(String[] args) {
		//java의 기본 참조 타입 복사는 얕은 복사이다
		
		//참조값과 call by value
		int[] ar = {1, 2, 3};
		System.out.println(ar); //참조값(heap메모리)  [I@28a418fc
//		System.out.println("메소드 호출 전 : " + ar[0]); // 1
//		modifyArray(ar); //메소드 호출
//		System.out.println("메소드 호출 후 : " + ar[0]); // 10

		
		System.out.println(ar); //[I@28a418fc
		System.out.println("array2 메소드 호출 전 : " + ar[0]); //1
		modifyArray2(ar);
		System.out.println("array2 메소드 호출 후 : " + ar[0]);
		System.out.println(ar);
		
	}
	
	static void modifyArray(int[] ar) {
		System.out.println(ar); //[I@28a418fc
		ar[0] = 10;
		// main의 ar주소값이 얕은복사로 복사되어 전달됨(modifyArray메소드)
		// 복사된 주소값이 같은 배열을 가리킴
		// 배열 내부의 값 변경 -> 외부 배열도 변경됨
		// 배열 요소에 영향을 끼친다(원본에 영향있음)
		// 객체 내부 값 변경 -> 원본 반영
	}
	
	static void modifyArray2(int[] ar) {
		ar = new int[] {10, 20, 30}; //참조 재할당 -> 원본 미반영
		System.out.println(ar);
		// 처음엔 같은 주소를 받음
		// 메소드 내부에서 ar = new int[] {...} 새로운 배열 주소로 변경
		// 이 변경은 메소드 내부에서만 유효
		
	}
}











