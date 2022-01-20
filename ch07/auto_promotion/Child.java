package ch07.auto_promotion;

public class Child extends Parent {
	// 필드
	String childField;
	
	// 메소드
	public void childMethod() {
		System.out.println("Child:childMethod()");
	}
	
	// 재정의
	@Override
	public void method1() {
		System.out.println("Child:method1()");
	}
}
