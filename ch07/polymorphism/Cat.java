package ch07.polymorphism;

public class Cat extends Animal {
	// 고양이 이므로 구체적으로 소리를 내는 것을 재정의
	@Override
	void sound() {
		System.out.println("야옹");
	}
}
