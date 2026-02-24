package method;
// 9. 정수 배열을 매개변수로 받아 배열의 길이를 반환하는 메소드 작성하기
public class Method09 {
			// 메소드 생성
			// 배열의 길이를 구해서 반환
			// 리턴값 o
			// arr.length 배열의 길이 알려줌
	public static int getLength(int[] arr) {
			return arr.length;
			}
			//메인메소드
	public static void main(String[] args) {		
			// 매개변수 선언
			// 정수 배열 선언
			// 선언와 동시에 배열에 1,2,3,4,5 값 저장
			int[] number = { 1, 2, 3, 4, 5 };
			// 배열의 길이 구하기 getLength 
			int length = getLength(number);
			//출력
			System.out.println("배열의 길이는 " + length + "입니다.");
			}
		}



