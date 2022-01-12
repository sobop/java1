package ch06.static_block;

public class TelevisionExample {

	public static void main(String[] args) {	// 정적 메소드
		// TelevisionExample 클래스가 인스턴스화 되지 않더라도 실행된다.
		Television.staticMethod();
		// 정적 메소드는 Television 클래스 이름을 사용해서 호출 기능 -> Television 객체가 생성안됨

	}

}
