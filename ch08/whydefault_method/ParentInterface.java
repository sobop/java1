package ch08.whydefault_method;

public interface ParentInterface {
	public void method1();
	public default void method2() {
		System.out.println("method2() 호출됨");
	}
}
