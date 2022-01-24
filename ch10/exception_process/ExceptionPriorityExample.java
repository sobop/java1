package ch10.exception_process;

public class ExceptionPriorityExample {
	public static void main(String[] args) {
		// 두 개의 정수를 입력받아서 더하고 그 결과를 출력
		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0];
			data2 = args[1];	
			int num1 = Integer.parseInt(data1);
			int num2 = Integer.parseInt(data2);
			int result = num1 + num2;
			System.out.println(result);
			// 예외의 원인이 동급인 경우는 우선순위가 없다.
			// 범위가 다를 경우(상속 : Exception -> RuntimeException -> ArrayIndexOutBoundsException)는
			// 작은 범위의 예외를 먼저 기술한다. -> 나중에 큰 범위의 예외를 기술한다.
		} catch(RuntimeException e) {	// 모든 실행 예외를 처리
			System.out.println("예외가 발생하였습니다.");
//		}
//		catch(ArrayIndexOutOfBoundsException e) { // RuntimeException이 큰 범위라 오류발생
//			System.out.println("파라미터가 부족합니다.");
//			System.out.println("사용법 : java TryCatchFinallyException num1 num2");
		} catch(Exception e) {	// 더 넓은 범위의 예외를 잡을 수 있는 부모를 기술
			// Exception은 모든 예외를 다 잡는다.
			System.out.println("예외가 발생하였습니다. " + e.getMessage());
		} finally {
			System.out.println("다시 실행하십시요.");
		}
	}
}
