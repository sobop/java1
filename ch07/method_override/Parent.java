package ch07.method_override;

public class Parent {
	// 메소드
	void method1() {
		System.out.println("Parent:method1() 호출됨");
	}
	
	void method2() {	// 접근 권한 : default
		System.out.println("Parent:method2() 호출됨");
	}
	
	public void method4() {	// 접근 권한 : public
		System.out.println("Parent:method4() 호출됨");
	}
}
