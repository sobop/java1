package ch07.abstract_class;

// 구체화된 클래스 -> 실체가 있다.
// 추상클래스를 상속을 받음 -> 구체화
// 규칙 : 추상클래스의 추상메소드를 재정의하지 않으면 추상메소드가 되고
//		추상메소드를 가지는 클래스는 추상클래스가 된다.
// 1. 재정의를 해서 사용을 한다.
// 2. 재정의를 하지 않고 또 추상클래스가 될 수도 있다. -> 다른 클래스가 상속해서 사용

public abstract class SmartPhone2 extends Phone {
	// 생성자
	public SmartPhone2(String owner) {
		super(owner);	// 부모 생성자를 호출
	}
	
	// 추상메소드는 재정의를 한다. : 규칙
	@Override
	public void bell() {
		System.out.println("벨이 울립니다.");
	}

	// 재정의
	@Override
	public void turnOn() {	// 구체적으로 메소드를 정의
		System.out.println("스마트폰을 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("스마트폰을 끕니다.");
	}
	
	// hangUp() 메소드를 재정의하지 않으면, 추상메소드가 된다.
	public abstract void hangUp();	// abstract 클래스가 된다.
}
