package array;
//6. A ~ F까지 중 C만 제외하고 배열에 담아 출력+
/*  1) 문자형 5칸짜리 배열 선언
	2) 정수형 임시 변수
	3) 반복문
		초기식 int i = 0 
		조건식 i < 배열.length
		증감식 i++
		실행문 임시변수 = 현재i
			조건문(if 임시변수가 1보다 크다면, 2보다 작거나같다면)
				임시변수++		
			배열[i] = (char)(임시변수 + 65)	
	4)출력할 반복문 	*/
public class BasicArray06_윤철민 {
	public static void main(String[] args) {
		
	}
}



//char[] arr = new char[5];
////int temp = 0;
////for(int i = 0; i < arr.length; i++) {
//// temp = i;
//// if(temp > 1) {
////    temp++;
//// }
//// arr[i] = (char)(temp + 65);
////}
////
////for(int i = 0; i < arr.length; i++) {
//// System.out.println(arr[i]);
////}
//
//// 방법2) index와 문자형 변수 이용
//char ch = 'A';
//int index = 0;
//while (index < 5) {
// if (ch != 'C') {
//    arr[index++] = ch;
// }
// ch++;
//}
//for (int i = 0; i < arr.length; i++) {
// System.out.println(arr[i]);
//}
//
//}
//}




