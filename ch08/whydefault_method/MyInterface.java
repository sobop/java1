package ch08.whydefault_method;

public interface MyInterface {
	public void method1();
	public default void method2() {	// 새로운 기능을 추가
		System.out.println("MyClassA:method2() 실행됨");
	}
	// 새로운 기능 추가할 때 default 사용하기
}
