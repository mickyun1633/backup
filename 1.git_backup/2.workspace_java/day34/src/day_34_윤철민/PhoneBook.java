package day_34_윤철민;

/* ② PhoneBook 클래스 요구사항
HashMap<String, String> 사용 (이름 - 전화번호)
구현 메서드
add(String name, String phone) : 연락처 추가, 이미 존재하면 예외 발생
search(String name) : 이름으로 검색, 없으면 예외 발생
delete(String name) : 삭제 메소드, 없는 이름이면 예외 발생
printAll() : 이름 기준 오름차순 정렬 후 전체 출력

예외처리
중복 추가 시 : "이미 존재하는 연락처입니다."
없는 이름 검색/삭제 시 : "존재하지 않는 연락처입니다."
이름 또는 전화번호가 null이거나 빈 문자열이면 : "이름과 전화번호를 입력하세요." */ 

public class PhoneBook {
	
		// HashMap<String, String> 사용 (이름 - 전화번호)
		private HashMap<Stirng, String> phoneMap = new HashMap<>();
	
		
}
