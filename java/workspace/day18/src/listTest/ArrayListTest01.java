package listTest;	//01.23

import java.util.ArrayList;

//1번 : ArrayList의 제네릭
public class ArrayListTest01 {
		public static void main(String[] args) {
			
			// ArrayList 객체 생성
			// ctrl + shift + o import
			ArrayList al = new ArrayList();
			System.out.println(al);
			
			// 요소 추가 메소드 .add(값) : 값은 Wrapper 타입의 값(박싱)
			al.add(1);			// 정수형 1 추가
			al.add(2);			// 정수형 2 추가
			al.add(3);			// 정수형 3 추가
			al.add(true);		// 논리형 true 추가
			al.add(5.5);		// 실수형 5.5 추가
			al.add("문자열");		// 문자열 추가
//			al.add
			
			System.out.println(al);
			System.out.println(al.toString());
			
			// 요소 길이 확인하는 메소드 .size()
			// 배열 .length
			// 문자열 .length()
			
			
			// ArrayList의 크기를 순회하여 요소 출력
			// 요소를 가져오는 메소드 .get(idx)
			for(int i = 0; i < al.size(); i++) {
				System.out.println(al.get(i));	// ArrayList의 i번째 요소를 출력
			}
	
			// <Element> : 제네릭
			ArrayList<Integer> al2 = new ArrayList();
			al2.add(1);	// auto boxing
			
			// 반복문 이용하여 10 ~ 1 순서대로 값 추가
			// 1) for문 초기식 int i = 0; 조건식 i < 10; 증감식 i++
			// 2) ArrayList 객체 a12 추가메소드 .add(10 - i)
			// 3) 반복문 밖에서 출력
			for  (int i = 0; i < 10; i++) {
				al2.add(10 - i);                        		
			}
			System.out.println(al2);
		
			// a12 요소 하나씩 출력
			for(int i : al2) {
				System.out.println(i);	// 산술연산도 바로 가능
			}
			
			// 값 가져오는 메소드 : index번호로 득정 값 가져오기 .get(idx)
			System.out.println(al2.get(0));	// 리턴타입 => a12 제네릭 타입과 동일
			
			// 삭제 : index 번호로 삭제하고 삭제한 요소를 반환 .remove(idx)
			System.out.println("인덱스 0번째의 값 " + al2.remove(0) + "를 삭제했습니다.");
			System.out.println(al2);
			
			// 삭제 : 값으로 검색하여 삭제(Object), 삭제 성공 여부를 반환 .remove(Object)
			System.out.println("값 삭제 여부 : " + al2.remove(Integer.valueOf(50)));
			System.out.println("값 삭제 여부 : " + al2.remove(8));
			System.out.println(al2);
			System.out.println("값 삭제 여부 : " + al2.remove(Integer.valueOf(8)));
			System.out.println(al2);
			
			// 수정 : 수정전의 값을 반환 set(idx, element)
			System.out.println("수정전 : " + al2);
			System.out.println(al2.set(0, 100));
			System.out.println("수정후 : " + al2);
			
		}
	}












