package ch08.whydefault_method;

// MyClassA가 에러가 발생됨
// 기존에 만든 제품은 수정하지않고 새로운 제품만 만들고싶은데
// 새로운제품을 만들면서 기존제품도 수정을 해야하는 문제가 발생됨
public class MyClassA implements MyInterface {

	@Override
	public void method1() {
		System.out.println("MyClassA:method1() 실행됨");

	}
	// 추상메소드 method2()를 재정의해야함

}
