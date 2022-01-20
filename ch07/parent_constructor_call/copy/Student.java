package ch07.parent_constructor_call.copy;

// 부모 클래스 People을 상속을 받음

public class Student extends People {
	// 필드
	int studentNo;	// 학번
	
	// 생성자 : 필드 초기화 (부모가 정의한 필드, 자식이 정의한 필드)
	public Student(String name, String ssn, int studentNo) {
		// 부모생성자를 먼저 호출해야 한다.
		super(name, ssn);
		this.studentNo = studentNo;
	}
	
	public Student(int studentNo) {
		super();	// 생략됨
		this.studentNo = studentNo;
	}
}
