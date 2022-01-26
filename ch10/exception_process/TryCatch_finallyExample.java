package ch10.exception_process;

public class TryCatch_finallyExample {

	public static void main(String[] args) {
		// 두개의 정수를 입력받아서 더하고 그 결과를 출력
		// 매개변수로 문자열이 들어온다.
		// 매개변수를 입력하지 않으면 예외가 발생할 수 있다. -> 예외처리가 필요.
		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0];
			data2 = args[1];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("파라미터가 부족합니다.");
			System.out.println("사용법 : java TryCatchFinallyException num1 num2");
			return;	// 프로그램 종료
		}
		
		// 문자열 -> 정수로 변환
		try {
			int num1 = Integer.parseInt(data1);	// NumberFormatException 발생 가능 : 2a
			int num2 = Integer.parseInt(data2);
			int result = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + result);
		} catch(NumberFormatException e) {
			System.out.println("올바른 숫자를 입력하세요.");
		}
		// 경험에 의해서 예외가 발생되는지? 예외 처리를 해야 되겠다...
		// 숙련도에 따라서 예외처리를 못할 수 있다.
		// 회사 : 설계부서, S/W 개발부서, H/W개발부서, 검증부서, ..., 운영부서, 생산부서, 생산검증
		
	}

}
