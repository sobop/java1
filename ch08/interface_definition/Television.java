package ch08.interface_definition;

// RemoteControl 기능이 있는 TV
// implements 키워드 사용
// implements : 구현한다.
// 구현 객체

public class Television implements RemoteControl {
	// 필드
	int volume;
	// 추상 메소드를 재정의 해야함
	// 재정의하지 않으면 추상 메소드가 되고 -> 추상클래스가 된다.
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");

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
		System.out.println("TV볼륨: " + this.volume);
	}
	// default 메소드는 재정의할수도 있고, 그대로 사용할 수 있다. -> 가지고 있다.

}
