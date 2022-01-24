package ch10.try_with_resources;

public class ThrowsExample {

	public static void main(String[] args) throws ClassNotFoundException {
//		try {
//			method1();
//		} catch(ClassNotFoundException e) {
//			System.out.println("예외처리");
//		}
		method1();
	}

	private static void method1() {
		// 방법 1 : 자신이 예외처리
//		try {
//			Class clazz = Class.forName("Java.lang.String2");
//		} catch (ClassNotFoundException e) {
//			System.out.println("예외처리");
//		}
		
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
