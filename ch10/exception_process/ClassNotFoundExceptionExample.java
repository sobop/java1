package ch10.exception_process;

public class ClassNotFoundExceptionExample {

	public static void main(String[] args) {
		// 정상적인 경로 : java.lang.String
		try {
			Class clazz = Class.forName("java.lang.String2");
			System.out.println(clazz);
		} catch (ClassNotFoundException e) {
			System.out.println("올바른 경로를 사용하세요");
			e.printStackTrace();
		}

	}

}
