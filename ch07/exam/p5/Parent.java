package ch07.exam.p5;

public class Parent {
	public String name;
	
	// 생성자
	// 생성자가 하나라도 있으면 default 생성자는 존재하지 않는다.
	// 필요하면 명시적으로 작성을 해야 한다.
	
//	public Parent() { }
	
	public Parent(String name) {
		this.name = name;
	}
}
