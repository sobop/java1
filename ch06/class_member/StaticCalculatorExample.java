package ch06.class_member;

public class StaticCalculatorExample {

	public static void main(String[] args) {
		// 정적 맴버에 접근(사용) : 클래스이름을 사용해서 접근 -> 객체 생성없이
		Calculator.battery = 100;		// 정적 필드에 접근
		System.out.println("배터리 값: " + Calculator.battery);
		Calculator.chargeBattery(200);	// 정적 메소드를 사용
		System.out.println("배터리 값: " + Calculator.battery);
		
		Calculator cal1 = new Calculator("홍길동", "샤프");
		cal1.result = 0;
		int result = cal1.add(10, 20);
		System.out.println("10 + 20 = " + result);
		
		// 오류를 범하기 쉬운경우
		cal1.battery = 200;			// 정적 필드에 값을 대입
									// cal1인스턴스에 고유하게 존재하는것이 아님
									// 정적 필드는 클래스 이름으로 접근
		Calculator.battery = 200;	// 정적 필드에 접근할 때 사용하는 방법
		cal1.chargeBattery(100);	// 정적 메소드를 호출 -> 에러는 아니고 경고
		Calculator.chargeBattery(100);
	}

}
