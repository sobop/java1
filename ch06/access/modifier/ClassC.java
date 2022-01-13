package ch06.access.modifier;

public class ClassC {
	public void method() {
		// ClassA에 접근할 수 있는지 확인
		// 4개의 생성자를 사용해서 객체를 생성할 수 있는지?
		ClassA c1 = new ClassA();	// public -> 정상처리
		ClassA c2 = new ClassA("홍길동"); // protected -> 정상처리
		ClassA c3 = new ClassA("홍길동", 20); // default -> 정상처리
//		ClassA c4 = new ClassA(30); // private -> 에러
		
		c1.field1 = "홍길동";		// public -> 접근 가능
		c1.field2 = 30;			// protected -> 접근 가능
		c1.field3 = 40L;		// default -> 접근 가능
//		c1.field4 = 3.14f;		// private -> 에러
		
		c1.method1();	// public -> 접근 가능
		c1.method2();	// protected -> 접근 가능
		c1.method3();	// default -> 접근 가능
//		c1.method4();	// private -> 에러
	}
}
