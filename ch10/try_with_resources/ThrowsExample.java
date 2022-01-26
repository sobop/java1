package ch10.try_with_resources;

public class ThrowsExample {

	public static void main(String[] args) throws ClassNotFoundException {
//		try {
//			method1();
//		} catch(ClassNotFoundException e) {
//			System.out.println("예외 처리를 한다.");	// 사용자에게 친숙한 표현을 사용
//		}
		
		method1();	// 나도 던져 버림 -> JVM이 처리
	}

	private static void method1() throws ClassNotFoundException {
		// 방법 1 : 자신이 예외 처리
//		try {
//			Class clazz = Class.forName("java.lang.String2");
//			// ClassNotFoundException 발생 -> 예외처리를 해주어야 함
//		} catch(ClassNotFoundException e) {
//			System.out.println("예외처리");
//		}
		
		// 방법 2 : 나를 호출한 곳에서 예외를 처리하도록 예외를 던진다.
		Class clazz = Class.forName("java.lang.String2");
	}

}
