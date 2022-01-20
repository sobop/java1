package ch08.whydefault_method;

public class ChildInterfaceImpl implements ChildInterface {

	@Override
	public void method1() {
		System.out.println("ChildInterfaceImpl():method1()");

	}

	// 추상메소드는 재정의해야한다.
	@Override
	public void method2() {
		System.out.println("ChildInterfaceImpl():method2()");

	}

	@Override
	public void method3() {
		System.out.println("ChildInterfaceImpl():method2()");
		
	}

}
