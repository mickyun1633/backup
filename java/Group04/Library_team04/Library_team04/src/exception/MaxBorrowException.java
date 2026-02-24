package exception;

public class MaxBorrowException extends Exception {

	public MaxBorrowException() {
		super("대여 가능한 권수를 초과했습니다.");
	}
	
}
