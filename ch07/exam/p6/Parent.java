package ch07.exam.p6;

public class Parent {
	public String nation;
	
	public Parent() {
		this("대한민국");	// 3
		System.out.println("Parent() call");
	}
	
	public Parent(String nation) {
		this.nation = nation;	//4
		System.out.println("Parent(String nation) call");
	}
}
