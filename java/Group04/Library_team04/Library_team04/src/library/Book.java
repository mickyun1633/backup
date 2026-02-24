package library;

import java.util.Objects;

import exception.BookAlreadyException;
import exception.BookNotAvailableException;
import exception.MaxBorrowException;

/**책을 표현하는 클래스
책의 기본 정보와 대출 상태 관리
대여 및 반납 기능 제공
*/
public class Book implements Borrow{
	/** 빌린 책 이름 */
	private String bookName; 
	/** 대여 가능 여부 */
	private boolean possibleBorrow; 

	/**
	 * Book 객체 생성
	 * @param bookName
	 */
	public Book(String bookName) {
		super();
		this.bookName = bookName;
	}
	
	/**
	 * @return 책이름
	 */
	public String getBookName() {
		return bookName;
	}

	/** 
	 * @return 대여 중이면 true, 대여 가능하면 false 
	 */

	public boolean isPossibleBorrow() {
		return possibleBorrow;
	}

	/**
	 * 책 대여 메소드 오버라이딩
	 * @throws BookAlreadyExcepton
	 * 		이미 대여 중인 도서일 경우
	 * @throws BookNotAvailableException
	 * 		책이 빌릴 수 없는 상태인 경우
	 */
	@Override
	public void bookBorrow() throws BookAlreadyException, BookNotAvailableException, MaxBorrowException {
		
		if(possibleBorrow) {
			throw new BookAlreadyException();
		}
		possibleBorrow = true;
	}
	
	@Override
	public void bookReturn() {
		possibleBorrow = false;
	}
	

	/**
	 * 객체 타입 비교
	 * @param obj 비교 대상
	 * 
	 * @return
	 * 	동일한 책일 경우 true, 아니면 false 반환
	 * 
	 * 예외 처리 조건 중 이미 대여한 책을 구분하기 위해서
	 * 같은 이름이 입력되는걸 확인하기위해 사용하는 코드
	 * 
	 * 지금 당장 구현하지 못함
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		 if (getClass() != obj.getClass())
	         return false;
	      Book other = (Book) obj;
	      return Objects.equals(this.bookName, other.bookName);
	   
	}
	/**
	 * 책 객체의 해시코드 반환
	 */
	@Override
	public int hashCode() {
		return Objects.hash(bookName);
	}

}

//Book 클래스 설계
//도서와 관련된 기본정보 	 bookName(String), 책 대출 여부(boolean)
//도서 대출 메소드 오버라이딩
//equals, hashCode 오버라이딩 	 => 대출 가능여부 확인 후, 대출 가능하면 빌릴 책 넣기, 대출 가능하면 대여, 불가능 하면 예외처리