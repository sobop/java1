package ch06.filed_usage;

public class Car {
	// 필드
	String company;
	
	// 생성자 : 반환형이 없고 메소드 이름이 클래스 이름
	public Car(String c) {	// 매개변수 company에서 변수 이름은 중요하지 않다.
		company = c;		// Car 클래스의 필드에 접근
	}
	
	public void method() {
		company = "기아자동차";
	}
}
