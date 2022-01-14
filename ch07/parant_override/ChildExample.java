package ch07.parant_override;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		child.method1();	// Parent 정의한 메소드
		child.method2();	// Parent -> Child 재정의한 메소드
		child.method3();	// Child 정의한 메소드
		child.method5();	// Child 정의한 메소드
		// Parent 클래스의 method2()를 직접 호출할 수 없다.
		child.method6();
	}

}
