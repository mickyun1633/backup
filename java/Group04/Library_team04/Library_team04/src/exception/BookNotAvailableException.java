package exception;

public class BookNotAvailableException extends Exception  {

	public BookNotAvailableException() {
		super("이 책은 대여할수 없습니다.");
	}
	
}
