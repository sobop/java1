package ch10.user_defined_exception;

// 사용자 정의 예외 클래스 : Exception, RuntimeException을 상속 받는다.
// 생성자 : default 생성자, 예외의 원을 저장하는 생성자
public class BalanceInsufficientException extends Exception {
	public BalanceInsufficientException() { }
	public BalanceInsufficientException(String message) {	// message : 예외의 원인
		super(message);	// 부모 생성자 호출 : Exception 
	}
}
