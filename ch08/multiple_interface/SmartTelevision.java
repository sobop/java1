package ch08.multiple_interface;

// 구현객체는 여려개의 인터페이스를 구현할 수 있다.
// 리모콘 기능(RemoteControl)과 검색기능(Searchable)
// 클래스는 다중 상속이 안됨 : 차이점

public class SmartTelevision implements RemoteControl, Searchable {
	// 구현객체는 추상 메소드를 재정의해주어야함
	@Override
	public void search(String url) {	// Searchable interface
		System.out.println(url + "을 검색합니다.");
		
	}

	@Override
	public void turnOn() {				// RemoteControl
		System.out.println("스마트 TV를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("스마트 TV를 끕니다.");
		
	}

}
