package ch08.field.polymorphsim;

public class Car {
	Tire forntLeftTire = new HankookTire();	// 구현객체를 대입
	Tire forntRightTire = new HankookTire();// 자동타입변환
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	void run() {
		forntLeftTire.roll();
		forntRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
