package ch08.multiple_interface;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		RemoteControl rc = new SmartTelevision();
		rc.turnOn();
		rc.turnOff();
		// 구현객체가 Searchable을 구현했는지 검사를 한다.
		if(rc instanceof Searchable) {
			Searchable s2 = (Searchable)rc;
			s2.search("http://www.google.com");
		}
		
		
		Searchable search = new SmartTelevision();
		search.search("http://www.naver.com");
		RemoteControl rc2 = (RemoteControl)search;
		rc2.turnOn();
		rc2.turnOff();
		// 자신의 타입이 정의한 것만 접근 가능
		// 다른 인터페이스가 정의한 메소드에 접근하려면 강제 타입 변환을 한다.
	}

}
