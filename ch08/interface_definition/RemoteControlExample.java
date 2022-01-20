package ch08.interface_definition;

public class RemoteControlExample {

	public static void main(String[] args) {
		Television tv = new Television();
//		tv.turnOn();
		tv.setVolume(5);
		tv.setMute(true);
		tv.turnOff();
		
		RemoteControl rc = new Television();	// 자동 타입변환
		// 왼쪽 RemoteControl 인터페이스 = 오른쪽 Television 구현 객체
		// Television은 RemoteControl interface를 구현한 객체
		// 구현하지 않은 객체는 대입을 할 수 없다.
		rc.turnOn();		// 재정의한 메소드가 호출된다.
		rc.setVolume(4);
		rc.setMute(true);	// 인터페이스에 있는 메소드가 호출됨(default메소드)
		rc.turnOff();
		
		RemoteControl.changeBattery();	// 정적메소드는 인터페이스 이름으로 호출
		// 특정 구현 객체에 의존하지 않음
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(4);
		rc.setMute(true);	// 인터페이스에 있는 메소드가 호출됨(default메소드)
		rc.turnOff();
	}

}
