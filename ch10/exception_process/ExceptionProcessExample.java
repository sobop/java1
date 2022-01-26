package ch10.exception_process;

// 예외 처리 방법 : try-catch-finally 구문을 사용
public class ExceptionProcessExample {

	public static void main(String[] args) {
		try {
			Thread.sleep(1000);	// 잠자고 있는 동안에 깨우는 방법으로 interrupt를 발생
		} catch (InterruptedException e1) {	// 100ms안에 인터럽트가 발생되면 예외가 발생
			e1.printStackTrace();
		}	// 일정한 시간 동안 잠자기 : 단위 ms -> 예외 처리를 해준다.
		// 예외처리를 해주도록 컴파일러가 알려준 것이다.
		
		try {	// try 블럭안에는 예외가 발생할 수 있는 코드를 둔다.
			// 자원을 획득한다. (파일에 대한 정보, 데이터베이스 자원...)
			// 파일을 읽거나 쓴다. 데이터베이스에 저장하거나 검색한다.
			String str = null;	// 문자열을 가리키고 있지 않음
			System.out.println("문자열의 길이 = " + str.length());	// NullPointerException
			return;
		} catch(NullPointerException e) {	// 예외를 처리하고자 하는 예외를 기술
			// 예외 처리 : 사용자가나 운영자에게 예외 발생을 알림
			// 로그를 남긴다.(프로그램의 버그를 수정하기 위한 단서)
			// catch문을 여러 개 기술할 수 있다.
			System.out.println("예외 발생 : " + e.getMessage());
			return;
		} finally {	// 예외가 발생하던, 발생하지 않던 무조건 처리되는 부분이다.
			// 자원의 반납을 보통 수행한다.
			System.out.println("모조건 실행된다.");
		}
		
	}

}
