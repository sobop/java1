package ch07.final_class_method;

public class ElectricCar extends Car {
	// 재정의
//	@Override
//	public void method() {	// 부모 클래스 Car의 method()가 final이므로 재정의 불가능
		
//	}
	
	@Override
	public void method1() {	// 재정의가 가능함
		System.out.println("ElectricCar:method1() 호출됨");
	}
}
