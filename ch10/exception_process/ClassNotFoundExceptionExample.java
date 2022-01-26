package ch10.exception_process;

// 클래스가 없다.

public class ClassNotFoundExceptionExample {

	public static void main(String[] args) {
		// : 정상적인 경로 : java.lang.String
		// 컴파일러가 예외를 알려준다. -> 수정하면 된다.
		try {
			Class clazz = Class.forName("java.lang.String2");	// 잘못된 클래스를 사용
			System.out.println(clazz);
		}catch(ClassNotFoundException e) {
			// e : 에러의 정보가 실림
			System.out.println("올바른 경로를 사용하세요.");
		}
	}

}
