package ch06.class_member;

public class CalculatorExample {
	
	
	// 정적(static) 멤버 메소드 -> main()메소드를 실행하기 위해
	// CalculatorExample 클래스를 생성하지 않음
	// JVM이 CalculatorExample.main()을 호출하여 실행함 
	public static void main(String[] args) {
		// 계산을 수행
		Calculator myCal = new Calculator("홍길동", "샤프");
		int sum = myCal.add(20, 30);
		System.out.println("20 + 30 = " + sum);
		// 계산기에 저장된 result 값을 reset(0)
		myCal.result = 0;	// 필드 값을 조작
		
		Calculator cal2 = null;
//		cal2.result = 0;	// result를 참조  -> null point Exception 발생
		sum = cal2.add(20, 50);
		System.out.println("20 + 30 = " + sum);
	}

}
