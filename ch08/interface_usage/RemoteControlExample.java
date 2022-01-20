package ch08.interface_usage;

public class RemoteControlExample {

	public static void main(String[] args) {
		MyClass mc = new MyClass();	// default 생성자 사용
		// 필드를 사용해서 인터페이스를 동작
		mc.rc.turnOn();
		mc.rc.turnOff();
		
		MyClass mc2 = new MyClass(new RemoteControl() {	// 익명 구현 객체(Audio)
			// 추상 메소드를 재정의
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}
		});
		// 생성자로 넣어둔 Audio가 동작
		mc2.rc.turnOn();	// rc에는 Audio 익명 구현 객체가 저장이 됨
		mc2.rc.turnOff();	
		
		mc2.method1();		// 메소드의 로컬 변수로 동작(사용)
		mc2.method2(new Television());	// 메소드의 매개변수로 사용
	}

}
