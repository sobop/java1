package ch06.access.modifier_2;

import ch06.access.modifier.ClassA;

// ClassA와 다른 패키지 경로에 정의된 클래스
// ClassA : 부모 클래스
// ClassD : 자식 클래스

public class ClassD extends ClassA {
	// 상속을 했으므로 ClassD에는 ClassA의 필드와 메소드를 가지고있다.
	// Overload : 메소드 오버로드, 생성자 오버로드
	// Override : 부모의 메소드를 제정의
	@Override 	// @(앳트) 어노테이션 : 부모의 메소드를 재정의한다고 컴파일러에게 알린다.
	public void method1() {	// 부모가 가지고 있는 메소드
		super.method1();
	}
	public void method() {
		// ClassA의 필드에 접근
		field1 = "홍길동";		// public -> 접근 가능
		field2 = 30;			// protected -> 접근 가능
//		field3 = 40L;			// default(같은 패키지 내에 있는것만 접근가능)
//		field4 = 3.14f;			// private(자신의 클래스 내에서 접근가능)
		
		// ClassA의 메소드에 접근
		method1();	// public -> 접근 가능
		method2();	// protected -> 접근 가능
//		method3();	// default -> 에러
//		method4();	// private -> 에러
	}
	
	// 생성자에 접근
	public ClassD() {	// default 생성자
		super();	// 부모 생성자를 호출 -> 부모 객체가 먼저 존재해야 한다.
					// 자식의 생성자에서는 먼저 부모 생성자를 호출한다.
					// public -> 접근 가능
	}
	
	public ClassD(String field1) {
		super(field1);	// 부모 생성자를 호출 -> protected -> 접근가능
						// 상속받은 클래스에는 public과 같은효과
	}
	
	public ClassD(String field1, int field2) {
//		super(field1, field2);	// default -> 접근 불가능
	}
	
	public ClassD(int field2) {
//		super(field2);	// private -> 접근 불가능
	}
}
