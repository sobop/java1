package ch10;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		// 매개변수로 문자열 숫자를 입력받아 저장
		int num = Integer.parseInt(args[0]);
		System.out.println("num = " + num);
		}
	// 예외가 발생되면 stacktrace()의 내용을 출력
	// 프로그램이 실행되면서 호출된 메소드들의 역순으로 프로그램의 위치가 저장되어 있고 그것을 출력
}
