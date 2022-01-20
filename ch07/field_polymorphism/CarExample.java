package ch07.field_polymorphism;

/* Polymorphism(다형성)
 * 	1. 자동타입변환 : 부모 타입 = 자식 타입
 * 		Tire frontLeftTire = new HanKookTire("앞왼쪽", 15);
 * 	2. 부모의 메소드를 자식이 재정의
 * 		HanKookTire, KumhoTire 재정의
 * 		fronLeftTireire.roll(); -> 자식이 재정의한 메소드가 동작
 *  다형성 : 부모에 어떤 자식 객체를 대입하느냐에 따라서 그 객체의 성질이 나타난다.
 *  타이어 : 한국타이어, 금호타이어
 * 	새로운 타이어(넥슨타이어)를 추가할 경우, 변경되는 소스 코드는 무엇인가?
 * 		- NexenTire 클래스를 생성
 * 		- CarExample.java 클래스를 수정 : 타이어가 고장나면 NexenTire 대체
 * 		- Car.java는 수정이 되지 않음 -> 어떤 Tire에 의존하지 않고 실행이 된다.
 * 		- 타이어가 고장이 나면 다른 타이어로 대체하는 부분을 프로그램으로 하지 않고
 * 		   설정(주입)으로 하면 소스코드를 수정하지 않고 동작을 할 수 있다.
 * 	제품을 개발하고 운영을 한다. 은행 시스템 : 1년 365일 계속 동작을 해야 한다. 
 * 		-> 서비스의 중단이 있으면 안된다.
 * 		한국통신 인터넷 사고 -> 먹통 (배상, 회사 타격)
 *  기존 제품에 대한 유지보수를 위해서 수정이 되더라고 서비스의 중단없이 계속 서비스는
 *  	제공이 되어야 함 -> 다형성을 제공하면 서비스의 중단이 없다.
 *  자식 객체를 변경하더라도 Car 클래스는 변경이 되지 않는다.
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
					car.frontLeftTire = new HanKookTire("앞왼쪽", 15);
					break;
				case 2:
					System.out.println("앞오른쪽 KumhoTire로 교체");
					car.frontRightTire = new KumhoTire("앞오른쪽", 13);	
					break;
				case 3:
					System.out.println("뒤왼쪽 NexenTire로 교체");
					car.backLeftTire = new NexenTire("뒤왼쪽", 14);	
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
