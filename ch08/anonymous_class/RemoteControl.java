package ch08.anonymous_class;

/* 키워드 interface 사용
 * 구성맴버 : 상수, 추상메소드, default 메소드, 정적 메소드
 * class에는 있는데 interface는 없는 것 : 필드, 생성자 -> 인스턴스화 할 수 없음
 */

public interface RemoteControl {
	// 상수
	public int MAX_VOLUME = 10;	// 변수가 아니고 상수, static final 생략함
		// 변경 불가능
	public int MIN_VOLUME = 0;	// 상수이므로 대문자 표기
	
	// 추상 메소드
	void turnOn();	// 선언부만 존재 : abstract 사용하지않음
					// public abstract 키워드 생략
	public void turnOff();
	public void setVolume(int volume);
	
	// default 메소드 : java 8부터 추가된 기능 -> 인터페이스를 확장할 때 사용
	// 나중에 인터페이스를 수정할 때 사용
	// 상속할 때 사용 (부모 인터페이스 -> 자식 인터페이스) : default 메소드 -> 추상 메소드로 변경
	// 구현 객체(class 입장에서는 자식객체와 유사)에서 재정의하지 않을 수 있다. -> 선택사항
	default void setMute(boolean mute) {	// 정의부가 존재
		// 실행부가 잇음
		if(mute) {
			System.out.println("무음 처리합니다");
		} else {
			System.out.println("무음 해제합니다");
		}
	}
	// 정적 메소드
	// 클래스로더가 인터페이스를 사용할 때 데이터 영역으로 로딩을 하고 그 때 존재한다.
	// 구현 객체에 무관하게 사용 가능
	static void changeBattery() {	// 정적 메소드 -> 인터페이스 이름으로 접근(사용)
		// 공통 기능
		System.out.println("건전지를 교환합니다.");
	}
}
