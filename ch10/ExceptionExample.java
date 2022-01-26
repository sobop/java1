package ch10;

/* Exception : 모든 예외의 최상위 클래스
 * 일반적인 예외 클래스 : Syntax 에러 -> 컴파일러가 예외를 알려준다.
 * 	컴파일 오류를 해결한다.
 * 실행예외(RuntimeException) : 문법적인 오류는 없다. 실행 시 예외가 발생
 * 	모든 실행 예외 클래스의 부모
 * 	NullPointerException
 */

public class ExceptionExample {

	public static void main(String[] args) {
		// RuntimeException : 문법적인 오류 없고 실행 시 예외 발생
		String str = null;	// 문자열을 가리키고 있지 않음
		System.out.println("문자열의 길이 = " + str.length());	// NullPointerException
	}

}
