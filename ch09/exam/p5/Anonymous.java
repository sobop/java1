package ch09.exam.p5;

public class Anonymous {
	// 필드
	Vehicle field = new Vehicle() {
		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
		}	
	};	// 익명 구현 객체 : 자전거
	
	// 메서드의 로컬변수
	void method1() {
		Vehicle localVar = new Vehicle() {
			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
		};	// 승용차 익명 구현 객체
		localVar.run();
	}
	
	void method2(Vehicle vehicle) {
		vehicle.run();
	}
}
