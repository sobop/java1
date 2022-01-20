package ch08.interface_basic;

/*
 * HanKook 타이어만 사용하던 것을 다른 타이어를 사용하고 싶다.
 * KumhoTire로 변경
 * - Car 클래스를 수정
 * - CarExample 클래스도 수정
 * -> NexenTire로 바꾸고 싶으면 역시 마찬가지로 Car, CarExample 클래스를 수정
 */
public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		// 시범 운행을 한다.
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
				case 1:
					System.out.println("앞왼쪽 HankookTire로 교체");
					car.frontLeftTire = new KumhoTire("앞왼쪽", 15);
					break;
				case 2:
					System.out.println("앞오른쪽 KumhoTire로 교체");
					car.frontRightTire = new KumhoTire("앞오른쪽", 13);	
					break;
				case 3:
					System.out.println("뒤왼쪽 NexenTire로 교체");
					car.backLeftTire = new KumhoTire("뒤왼쪽", 14);	
					break;
				case 4:
					System.out.println("뒤오른쪽 KumhoTire로 교체");
					car.backRightTire = new KumhoTire("뒤오른쪽", 17);		
					break;
			}
			System.out.println("----------------------------------------");
		}
	}
}
