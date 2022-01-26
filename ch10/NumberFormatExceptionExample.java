package ch10;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		// 매개변수로 문자열 숫자를 입력받아 저장
		int num = Integer.parseInt(args[0]);
		System.out.println("num = " + num);
	}

	// 예외가 발생되면 stacktrace()의 내용을 출력
	// 프로그램이 실행되면서 호출된 메서드들의 역순으로 프로그램의 위치가 저장되어 있고 그것을 출력
	// 자바 라이브러리는 문제가 없는 코드이므로 에러의 원인이 아니고
	// 결국은 우리들이 프로그램한 부분에서 예외의 원인을 제공하는 것이다.
	// stacktrace()에서 여러분이 짠 코드가 어디에 있는지를 찾는 것이 중요하다.
}
