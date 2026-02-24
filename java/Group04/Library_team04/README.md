# Library_team04

1) 도서 대출 프로그램

홍성인 	사용자 설계자 
윤철민 	회원 기능 담당
서서울 	도서 설계자, 예외클래스   
김재민 	서비스 로직 설계자
오명근 	UI 및 실행

2) 기본 규칙
   들여쓰기 문법, 중괄호 스타일(K&R 스타일)

3) 프로젝트 명명 규칙 
   클래스명 : 파스칼표기법
	(User, LoginManager, Member, Book, Borrow(인터페이스), LibraryService, MaxBorrowException, BookNotAvailableException, BookAlreadyException, ConsoleUI, ConsoleUI, LibraryApp)

   변수/메소드명 : 카멜표기법(~~~)
   패키지명 : 소문자로 작성
   컬렉션/배열 : 복수형(~~~)
   메소드 : 동사(카멜표기법)(~~~~)
   예외 : Exception 필수
   상수 : 대문자

4) 클래스 작성 순서
   package
   import
   class 선언
   필드
   생성자
   메소드
   내부 클래스

5) 메소드 규칙/변수 선언 규칙/주석(api주석)
   하나의 메소드 = 하나의 역할만 있다(SRP 적용)
