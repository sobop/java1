package ch07.polymorphism;

/* Polymorphism(다형성)
 * 전제조건 : 상속관계(부모클래스와 자식클래스)
 * 1. 자동타입변환
 * 	부모 타입 = 자식 타입
 * 2. 메소드의 재정의 : 자식 클래스가 부모 클래스의 메소드를 재정의
 */
public class Animal {
	void sound() {
		System.out.println("소리를 냅니다.");
	}
}
