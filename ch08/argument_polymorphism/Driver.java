package ch08.argument_polymorphism;

public class Driver {
	void drive(Vehicle vehicle) {	// 운전할 운송수단을 매개변수로 받는다.
		// 운전수단이 버스면 카드를 체크했는지 확인
		if(vehicle instanceof Bus) {	// 버스 구현 객체인지?
			// 강제타입변환 : Vehicle 타입은 Vehicle만 접근 가능
			// Bus의 메소드를 접근하려면 Vehicle로는 접근 불가능
			// Vehicle를 Bus로 강제타입변환 -> Bus는 checkFare()를 사용가능
			((Bus)vehicle).checkFare();	// 카드체크 확인 : 강제타입변환
		}
		vehicle.run();
	}
}
