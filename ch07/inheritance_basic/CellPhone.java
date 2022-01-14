package ch07.inheritance_basic;

// 모든 클래스는 Object 클래스를 상속받는다.
// extends Object가 생략되었음.
// Object 클래스가 제공하는 메소드를 가지고 있음.
// clone(), toString(), equals(), hashcode(), finalize() 메소드
public class CellPhone {
	String model;
	String color;
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	void sendMessage(String message) {
		System.out.println(message + "를 보냅니다.");
	}
	
	void reciveMessage(String message) {
		System.out.println(message + "를 수신합니다.");
	}
	
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
