package ch07.auto_promotion;

public class Child extends Parent {
	
	String childField;
	
	public void childMethod() {
		System.out.println("Child:childMethod()");
	}
	
	@Override
	public void method1() {
		System.out.println("Child:method1()");
	}
}

