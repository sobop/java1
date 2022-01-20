package ch07.polymorphism;

public class PolymorphismExample {

	public static void main(String[] args) {
		// Dog 객체를 생성 : 참조변수를 Dog으로 할 수도 있음
		Dog d1 = new Dog();
		// Polymorphism(다형성)
		// 1. 부모 타입 = 자식 타입
		Animal animal = new Dog();	// 부모 클래스 = 자식 클래스 -> 자동 타입 변환
		// 2. 재정의
		animal.sound();	// 멍멍 (자식이 재정의한 메소드가 호출됨)
		animal = new Cat();	// 자동 타입 변환
		animal.sound();	// 야옹
		// 부모 타입에 어떤 자식을 대입하느냐에 따라서 그 대입한 자식의 성질이 나타나는 것 -> 다형성
		animal = new Pig();
		animal.sound();	// 꽥꽥
	}

}
