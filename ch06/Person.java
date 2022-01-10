package ch06;
	// main() 메소드 없음
public class Person {
	// 속성(필드), 동작
	String name;	// 이름
	int age;
	
	// 생성자 : 필드를 초기화
	public Person() {	// ()안의 파라미터 : 매개변수 -> 매개변수가 없음
		// 필드를 초기화 하지 않음
		
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

}
