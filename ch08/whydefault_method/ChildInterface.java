package ch08.whydefault_method;

public interface ChildInterface extends MyInterface {
	/*
	 * MyInterface 가지고 있는 메소드 : 추상 method1(), default method2()
	 * default메소드를 사용하는 방법 : 3가지
	 * 1. default 메소드를 그대로 사용하는 방법
	 * 2. 재정의해서 사용하는 방법
	 * 3. default 메소드를 추상 메소드로 변경해서 사용하는 방법
	 */
	// 3. 추상메소드로 변경해서 사용하는 방법
	void method2();
	void method3();
}
