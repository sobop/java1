package ch07.exam.p6;

public class Child extends Parent {
	private String name;
	
	public Child() {	// 1.
		// 다른 생성자를 호출
		this("홍길동");	// this : Child
		System.out.println("Child() call");
	}
	
	public Child(String name) {	// 2.
		// 부모 생성자를 호출
		this.name = name;
		System.out.println("Child(String name) call");	// 출력 1.
	}
}
