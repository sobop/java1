package ch07.method_override;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		child.method1();	// Parent 정의한 메소드
		child.method2();	// Parent, Child??? -> Child 재정의한 메소드가 호출됨
		// 재정의의 규칙 : 자식 클래스가 재정의한 메소드가 호출된다.
		child.method3();	// Child 정의한 메소드
		child.method5();
		// Parent 클래스의 method2()를 직접 호출할 수는 없음
		child.method6();
	}

}
