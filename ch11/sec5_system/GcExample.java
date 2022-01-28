package ch11.sec5_system;

public class GcExample {

	public static void main(String[] args) {
		Car myCar = new Car("소나타");	// 쓰레기가 된다.
		myCar = new Car("그랜저");
		System.gc();	// 가비지 컬렉션을 요구한다.
			// 가비지 컬렉터가 바로 GC을 하지 않고 필요할 때 한다.
	}

}

class Car {
	String model;
	
	Car(String model) {
		this.model = model;
	}
}