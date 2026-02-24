package library;

import java.util.ArrayList;
import java.util.List;

/** User 클래스 상속 받기 
 *  추상 클래스 abstract, 상속 extends */

public abstract class Member extends User {
	
		/** List 필드 생성 : User가 대여한 책 목록을 저장하기 위한 필드
		 *  User가 현재 대여 중인 책 권수 */   
		private int countBook;		
		/** User가 현재 대여 할 수 있는 최대 책 권수  
		 *  30권으로 제한 */
		private int borrowBookCount = 30;
		/** User가 어떤 책을 빌렸는지 책 이름
		 *  문자열만 저장 가능 
		 *  import cmd + shift + o */
		private List<String> borrowBook;

		// 생성자 
		public Member(String userId, String userPw) {
			/** 부모(User) 생성자 호출
			 *  userId, userPw 초기화 */ 
			super(userId, userPw); 
			// User가 대여한 책 권 수 0으로 초기화 
			this.countBook = 0;
			/** User가 대여한 책 이름 저장할 ArrayList 객체 생성
			 *  import cmd + shift + o */
			this.borrowBook = new ArrayList<>();
			
		}
		
		/** 로그인 메소드 오버라이딩
		 *  cmd + opt + s
		 *  로그인 성공으로 처리 getUserId() */
		@Override
		public boolean login() {
			System.out.println(getUserId() + " 님 로그인 성공");
			return true;
		}
		
		/** 도서대여 메소드
		 *  User가 대여하면 목록에 추가, bookBorrow  */
		public void bookBorrow(String bookName) {
			/** 최대 대여 권수 초과 조건식
			 *  if, >= */
			if(countBook >= borrowBookCount) {
				/** 출력 : 대여 권수 초과  */
				System.out.println("대여 권수 (30권)을 초과했습니다.");
				return;
			}
			/** 대여한 책 이름 추가 
			 *  .add();  */
			borrowBook.add(bookName);
			/** 책을 대여 했으니 추가 
			 *  후위증감 ++; */
			countBook++;
			/** 출력 : 대여 완료 */
			System.out.println(bookName + " 대여를 완료했습니다.");
		}
		
		
		/** 도서반납 메소드
		 *  User가 대여하면 목록에 추가, bookReturn */
		public void bookReturn(String bookName) {
			/** 책 반납
			 *  if, .remove */
			if(borrowBook.remove(bookName)) {
				/** 책 반남 헸으니 감소 
				 *  후위감소 --; */
				countBook--;
				/** 출력 : 반납 완료  */
				System.out.println("이 " + bookName + " 반납 완료했습니다.");
			} else {
				/** 출력 : 대여 중인 책이 아닐 때 */
				System.out.println("대여 중인 책이 아닙니다.");
			}
		}
		
		/** 대출중인 책 목록 확인 메소드 */ 
		public void bookBorrowList() {
			/** 출력 : 대출 중인 책 목록, this.borrowBook */
			System.out.println("대출 중인 책 목록 : " + this.borrowBook);
			}
		
	}		

