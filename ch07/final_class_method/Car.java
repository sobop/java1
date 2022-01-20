package ch07.final_class_method;

/*
 * final : 최종의, 변경 불가능. 보통 상수
 * final class : 상속 불가능
 * final method : 자식 클래스에서 부모 클래스의 메소드를 재정의 불가능
 * final field : 값을 변경 불가능 (상수)
 */

public class Car {
	final String company = "현대자동차";	// 필드
	final void method() {	// final -> 변경 불가능
		System.out.println("Car:method() 호출됨");
	}
	
	void method1() {
//		company = "포드";	// 변경 불가능 -> final은 변경 불가능
		System.out.println("Car:method1() 호출됨");
	}
}
