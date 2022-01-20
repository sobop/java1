package ch07.abstract_class;

public class PhoneExample {

	public static void main(String[] args) {
//		Phone phone = new Phone("홍길동");	// 추상클래스는 인스턴스화 할 수 없다.
			// 추상 메소드 bell()이 구체적으로 정의되어 있지 않음 
		SmartPhone sp = new SmartPhone("홍길동");	// 구체화를 하고 객체생성 가능
		sp.turnOn();
		sp.bell();
		sp.hangUp();
		sp.turnOff();
//		SmartPhone2 sp2 = new SmartPhone2("두만강");	// 객체를 생성할 수 없음
			// SmartPhone2가 추상클래스이므로 객체를 생성할 수 없음
		EnhanceSmartPhone esp = new EnhanceSmartPhone("이선희");
	}

}
