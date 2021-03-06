package ch10.exception_process;

public class MultiCatchExceptionExample {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0];	// ArrayIndexOutOfBoundsException
			data2 = args[1];	// 
			int num1 = Integer.parseInt(data1);	// NumberFormatException 발생 가능 : 2a
			int num2 = Integer.parseInt(data2);
			int result = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + result);
		// 예외의 원인이 동급인 경우는 우선순위가 없다.
		// 범위가 다를 경우(상속 : Exception -> RuntimeException -> ArrayIndexOutBoundsException)는
		// 작은 범위의 예외를 먼저 기술한다.	-> 나중에 큰 범위의 예외를 기술한다.
		} catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println("파라미터가 부족합니다.");
			System.out.println("사용법 : java TryCatchFinallyException num1 num2");
		} catch(NumberFormatException e) {
			System.out.println("올바른 숫자를 입력하세요.");
		} finally {
			System.out.println("다시 실행하십시요.");
		}
	}

}
