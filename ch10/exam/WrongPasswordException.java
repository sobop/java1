package ch10.exam;

// 문제를 풀고, 답을 확인하는 습관을 들입니다.

public class WrongPasswordException extends Exception {
	public WrongPasswordException() { }
	public WrongPasswordException(String message) {
		// 작성 위치
		super(message);	// Exception 클래스에 전달
	}
}
