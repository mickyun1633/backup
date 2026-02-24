package library;

import exception.BookAlreadyException;
import exception.BookNotAvailableException;
import exception.MaxBorrowException;

/**
 * 대여 및 반납 기능을 정의하는 인터페이스
 */
public interface Borrow {

	/**
	 * 책을 대여한다.
	 * 
	 * 이미 대여 중이거나 빌릴 수 없는 상태인 경우 예외를 발생시킨다
	 * 
	 * @throws BookAlreadyException 
	 * 		이미 대여 중인 책인 경우 발생
	 * 
	 * @throws BookNotAvailableException 
	 * 		책이 빌릴 수 없는 상태일 경우 발생
	 * 
	 * @throws MaxBorrowException
	 * 		책 대여 권 수가 30권이 넘어간 경우 발생
	 * 
	 */	
	void bookBorrow () throws BookAlreadyException, BookNotAvailableException, MaxBorrowException;	
	
	/** 책을 반납한다.
	 *	책의 상태를 대여 가능한 상태로 변경한다. 
	 */
	void bookReturn ();
	
}
