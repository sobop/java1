package ch08.interface_basic;

public class Car {
	// 필드
//	HanKookTire frontLeftTire = new HanKookTire("앞왼쪽", 4);
//	HanKookTire frontRightTire = new HanKookTire("앞오른쪽", 3);
//	HanKookTire backLeftTire = new HanKookTire("뒤왼쪽", 3);
//	HanKookTire backRightTire = new HanKookTire("뒤오른쪽", 3);
	KumhoTire frontLeftTire = new KumhoTire("앞왼쪽", 4);
	KumhoTire frontRightTire = new KumhoTire("앞오른쪽", 3);
	KumhoTire backLeftTire = new KumhoTire("뒤왼쪽", 3);
	KumhoTire backRightTire = new KumhoTire("뒤오른쪽", 3);
	
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
