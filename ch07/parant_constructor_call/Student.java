package ch07.parant_constructor_call;

public class Student extends People {
	int studentNo;
	
	// 생성자 : 필드초기화 (부모가 정의한 필드, 자식이 정의한 필드)
	public Student(String name, String ssn, int studentNO) {
		// 부모생성자를 호출해야 한다.
		// super(); -> 사용할 수 없음
		super(name, ssn);
		this.studentNo = studentNO;
	}
	
	public Student(int studentNo) {
		super();	// 생략됨
		this.studentNo = studentNo;
	}
	
}
