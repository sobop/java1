package ch07.field_polymorphism;

public class Car {
	// 필드
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	// 직접 HanKookTire나 KumhoTire 클래스를 사용하지 않고
	// 부모 클래스 Tire를 사용하고 자식 객체를 대입 받아서 동작하도록 구현
//	HanKookTire secondaryTie = new HanKookTire("예비", 10);
//	NexenTire secondaryTie = new NexenTire("예비", 10);
	// HanKookTire에서 NexenTire로 교체하려면 Car 클래스를 수정
	// 서비스의 중단이 발생한다.
	// 부모타입의 필드를 사용하면 다른 타이어로 대체하더라도 소스코드를 수정하지 않아도 된다.
	Tire secondayTire = new Tire("예비", 10);
	
	// 메소드
	// 반환값 : 0(정상동작), 1~4: 펑크난 타이어의 위치
	int run() {
		System.out.println("자동차가 달립니다.");
		if(frontLeftTire.roll() == false) {	// 펑크
			stop();
			return 1;	// 장착 위치 : frontLeft
		}
		if(frontRightTire.roll() == false) {	// 펑크
			stop();
			return 2;
		}
		if(backLeftTire.roll() == false) {	// 펑크
			stop();
			return 3;
		}
		if(backRightTire.roll() == false) {	// 펑크
			stop();
			return 4;
		}
		return 0;
	}

	private void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
