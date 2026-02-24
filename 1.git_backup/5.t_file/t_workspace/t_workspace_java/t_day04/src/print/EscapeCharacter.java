package print;
//4번 : 이스케이프 문자(제어문자)
public class EscapeCharacter { // 클래스 중괄호 시작
	public static void main(String[] args) { //main 메소드 중괄호 시작
		// \n \t \" \' \\
		System.out.println("안녕하세요. 자바입니다.");
		System.out.println("안녕하세요.\n자바입니다.");
		System.out.println("안녕하세요.\n\n오늘은 4일차 수업입니다.");
		
		System.out.println("이름\t나이\t지역");
		System.out.println("김영선\t20\t서울");
		
		System.out.println("오늘은 자바 \"4일차\" 수업입니다.");
		System.out.println("오늘은 \'자바\' 4일차 수업입니다.");
		
		char ch = 'a';
		char quote = '\''; //이경우 반드시 이스케이프 문자 사용 ' char를 표현하는 구분자기 때문에 
		//문자 자체 '를 넣으려면 반드시 \'로 사용해야한다
		System.out.println(ch);
		System.out.println(quote);
		
		System.out.println("파일경로 : D:\\web_0900_kys\\java\\workspace");
		
		System.out.print("print메소드는 줄바꿈하지 않는다. 이 때 \'\\n\'을 사용하면 줄바꿈된다\n");
		// \' : 작은 따옴표를 표현 출력결과 '
		// \\ : \를 표현 출력결과 \
		// n : 문자 자체 출력
		// \' : 작은 따옴표를 표현 출력결과 '
		// => 출력결과는 '\n'로 나온다
		
		System.out.print("진짜 줄바꿈되는지 확인");
		
	} //main 메소드 중괄호 끝
} //클래스 중괄호 끝








