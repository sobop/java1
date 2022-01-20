package ch08.anonymous_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		// 구현 객체 Television을 별도의 java파일로 정의를 함
		// 별도의 Television.java를 만드는 이유는 재사용
		// 다른 패키지에서 사용할 수 있음 -> import해서 사용할 수 있음.
		// 새로운 구현 객체가 필요.
		// 별도의 자바 파일을 안만들고 사용하는 방법?
		// 익명 구현 객체 : 별도의 자바파일로 객체를 정의하지않고 구현객체를 사용
		// 클래스 이름이 없으므로 생성자 없음 -> 생성자로 인터페이스 이름을 사용
		RemoteControl sbox = new RemoteControl() {	// 구현 객체(클래스)를 정의하는 부분
			// 추상 메소드르 재정의해준다.
			int volume;
			
			@Override
			public void turnOn() {
				System.out.println("셋탑박스를 켭니다.");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("셋탑박스를 끕니다.");
				
			}
			
			@Override
			public void setVolume(int volume) {
				if(volume < MIN_VOLUME) {
					volume = MIN_VOLUME;
				} else if(volume > MAX_VOLUME) {
					volume = MAX_VOLUME;
				} else {
					this.volume = volume;
				}
				System.out.println("셋탑박스볼륨: " + this.volume);
			}
	
		};
		sbox.turnOn();
		sbox.setVolume(5);
		sbox.setMute(false);
		sbox.turnOff();
	}

}
