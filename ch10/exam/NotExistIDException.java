package ch10.exam;

public class NotExistIDException extends Exception {
	public NotExistIDException() { }
	public NotExistIDException(String message) {
		// 작성 위치
		super(message);	// Exception 클래스에 전달
	}
}
