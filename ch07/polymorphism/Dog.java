package ch07.polymorphism;

public class Dog extends Animal {
	// 재정의
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
