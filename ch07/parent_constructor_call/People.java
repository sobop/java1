package ch07.parent_constructor_call;

public class People {
	// 필드
	String name;	// 이름
	String ssn;		// 주민등록번호
	
	// 생성자 : 필드를 초기화
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	// default 생성자가 존재하지 않음 : 다른 생성자가 하나라도 존재하면
}
