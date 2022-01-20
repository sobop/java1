package ch08.argument_polymorphism;

public class Bus implements Vehicle {
	// 추상메소드를 재정의
	@Override
	public void run() {
		System.out.println("버스가 달립니다");
	}
	
	void checkFare() {
		
	}
}
