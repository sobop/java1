package ch10.exception_process;

/*
 * Exception : 모든 예외의  최상위 클래스
 * 일반적인 예외 클래스 : Syntax 에러 -> 컴파일러가 예외를 알려준다
 * 컴파일 오류를 해결한다.
 * 실행예외(RuntimeException) : 문법적인 오류는없다. 실행 시 예외가 발생
 * 모든 실행 예외 클래스의 부모
 * NullPointerException
 */
public class ExceptionExample {

	public static void main(String[] args) {
		try {
			Thread.sleep(1000);	// 잠자고있는동안에 깨우는 방법으로 Interrupted를 발생
		} catch (InterruptedException e1) {	// 100ms 안에 인터럽트가 발생되면 예외가발생
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	// 일정한 시간동안 잠자기 : 단위ms -> 예외처리를 해준다.
		// 예외처리를 해주도록 컴파일러가 알려준것이다.
		try {	// try안에는 예외가 발생할 수 있는 코드를 둔다.
			// 자원을 획득한다.
		String str = null;
		System.out.println("문자열의 길이 = " + str.length());	// NullPointerException
		} catch(NullPointerException e) {	// 에외를 처리하고자 하는 예외를 기술
			// 예외처리 : 사용자나 운영자에게 예외 발생을 알림
			// 로그를 남긴다. (프로그램의 버그를 수정하기 위한 단서)
			System.out.println("예외 발생 : " + e.getMessage());
		} finally {	// 예외가 발생하던 발생하지 않던 무조건 처리되는 부분이다.
			// 자원의 반납을 보통 수행한다.
			System.out.println("무조건 실행된다.");
			
		}

	}

}
