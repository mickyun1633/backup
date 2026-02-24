package day18_Task_윤철민;	//ListCollection

import java.util.ArrayList;
import java.util.List;

public class Ex16_04 {
	public static void main(String[] args) {
		
		// 리스트 선언
		List<String> list = new ArrayList<>();
		
		// 데이터 삽입
		list.add("딸기");
		list.add("바나나");
		list.add("망고");
		
		// 리스트 출력
		System.out.println("리스트 내용 : " + list);
		
		// 3번째 위치에 삽입
		list.add(2, "수박");
		
		System.out.println("리스트 내용2 : " + list);
		}
}
