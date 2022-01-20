package ch08.interface_usage;

// 어플리케이션의 기능을 수행하는 클래스
public class MyClass {
	// 인터페이스를 필드로 사용하는 경우
	RemoteControl rc = new Television();
	// 디폴트 생성자
	MyClass() { }
	// 생성자에서 필드를 사용
	MyClass(RemoteControl rc) {
		this.rc = rc;	// 매개변수로 받은 RemoteControl을 필드에 대입
	}
	
	// 메소드
	void method1() {
		// 로컬변수로 인터페이스를 사용
		RemoteControl rc = new RemoteControl() {	// 익명 구현 객체 : Audio

			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}
		};
		rc.turnOn();	// 동작을 실행
		rc.turnOff();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
