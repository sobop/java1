package ch07.abstract_class;

// 추상 클래스 : abstract 키워드를 사용해서 표기
// 클래스들의 공통되는 특징을 모아 놓은 클래스
// 추상화 : 구체적으로 정의하지 않고, 틀만 갖추어 놓은 것이다.
// 인스턴스화를 할 수 없다.(객체를 생성할 수 없다.)
// 메소드 : 규격(틀)을 정의한다. -> 반환형, 메소드 이름, 매개변수
// 	정의 : 실행부가 있는 것(구체적인 동작이 구현되어 있는 것)
// 	선언 : 형식만 만들어 놓는 것(구체적인 동작이 구현되어 있지 않음)
public abstract class Phone {
	// 필드
	public String owner;
	
	// 생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// 메소드
	public void turnOn() {	// 동작을 정의하더라도 일반적인 동작을 기술(기본 틀만 정의)
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
	
	// 추상 메소드 : 실행문이 없음
	public abstract void bell();	// 선언만(중괄호가 없이, 반환형, 이름, 매개변수를 선언)
		// -> 추상 메소드  -> abstract 키워드를 사용
	
	// 추상 메소드
	public abstract void hangUp();
}
