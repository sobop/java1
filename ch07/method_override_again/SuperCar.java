package ch07.method_override_again;

public class SuperCar extends Car {
	// 재정의
	public void run() {
		System.out.println("SuperCar:run() 호출됨");
	}
	
	@Override	// 재정의
	public void method1() {
		System.out.println("SuperCar:method1()");
	}
	
	// 재정의 : 반환형, 메소드이름, 매개변수가 동일
	public void method2(String data) {	// 재정의한 것이 아니다.
		// 새로운 메소드를 정의한 것이다.
		System.out.println("SuperCar:method2()");
	}
	
	// 매개변수가 다르므로 에러
	// @Override가 재정의 -> 매개변수가 동일 -> 문법적인 오류가 나는 것을 방지
//	@Override
//	public void method3(String data) {	// 에러
//	}
}
