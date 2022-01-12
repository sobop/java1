package ch06.final_keyword;
/*
 *  final : 최종 -> 변경불가능
 *  최초로 처음 한번은 값을 대입 가능
 *  1. 필드 선언시
 *  2. 생성자로 초기화
 *  그 외에는 수정 불가능
 */
public class Person {
	final String nation = "Korea";
	final String ssn;	// 주민등록번호
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
	public void method() {
//		ssn = "001020-1009999";	// 수정 불가능 -> final 이므로 수정 불가능
	}
}

