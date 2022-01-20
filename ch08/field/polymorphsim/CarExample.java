package ch08.field.polymorphsim;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		
		myCar.forntLeftTire = new KumhoTire();
		myCar.backLeftTire = new KumhoTire();
		myCar.run();
	}

}
