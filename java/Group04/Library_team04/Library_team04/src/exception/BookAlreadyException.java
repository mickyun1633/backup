package exception;

public class BookAlreadyException extends Exception{

	public BookAlreadyException() {
		super("이 책은 이미 대여되었습니다.");
	}
	
}
