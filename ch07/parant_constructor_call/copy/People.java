package ch07.parant_constructor_call.copy;

public class People {
	String name;	
	String ssn;		// 주민번호
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	// default 생성자가 존재하지 않음 : 다른 생성자가 하나라도 존재하면
	
}
