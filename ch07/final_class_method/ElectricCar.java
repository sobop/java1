package ch07.final_class_method;

public class ElectricCar extends Car {
	// 재정의
//	@Override
//	public void method() {	// 부모 클래스 Car의 method()가 final 이므로 재정의 불가능
//		
//	}
	
	@Override
	public void method1() {
		System.out.println("ElectircCar:method1() 호출됨");
	}
}
