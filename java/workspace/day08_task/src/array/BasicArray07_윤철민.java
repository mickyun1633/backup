package array;
//7. aBcDeFgHiJkLmNoPqRsTuVwXyZ 배열에 담고 출력(char만 사용, 선언없이)
/*  1) 문자형 26칸짜리 배열 선언
	2) 값대입할 반복문 초기식 조건식 증감식
		실행문 arr
	초기식 int i = 0 
	조건식 i < 배열.length
	증감식 i++
	실행문 임시변수 = 현재i
		조건문(if 임시변수가 1보다 크다면, 2보다 작거나같다면)
			임시변수++		
		배열[i] = (char)(임시변수 + 65)	
4)출력할 반복문 	*/
public class BasicArray07_윤철민 {
	public static void main(String[] args) {
		
	}
}





//package array;
//
//public class BasicArray07_본인이름 {
//   public static void main(String[] args) {
////      7. aBcDeFgHiJkLmNoPqRsTuVwXyZ 배열에 담고 출력
//
//      //1) 문자형 26칸배열선언
//      //2) 값대입할 반복문 초기식 조건식 증감식
//      //      실행문 arr[i] = (char)(i % 2 != 0 ? i + 65 : i + 97)
//      //3) 출력할 반복문
//      
//      char[] arr = new char[26];
//      for(int i = 0; i < arr.length; i++) {
//         arr[i] = (char)(i % 2 != 0 ? i + 65 : i + 97);
//      }
//      for(int i = 0; i < arr.length; i++) {
//         System.out.print(arr[i]);
//      }
//      
//   }
//}