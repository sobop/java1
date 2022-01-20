package ch07.parent_constructor_call;

// 부모 클래스 People을 상속을 받음

public class Student extends People {
	// 필드
	int studentNo;	// 학번
	
	// 생성자 : 필드 초기화 (부모가 정의한 필드, 자식이 정의한 필드)
	public Student(String name, String ssn, int studentNo) {
		// 부모생성자를 먼저 호출해야 한다.
		// super(); -> 사용할 수 없음
		super(name, ssn);	// super : 부모 객체인 People을 말한다
		this.studentNo = studentNo;
		
		// super() 생성자를 사용하려면 People 클래스에서 default 생성자를 추가하면 된다.
	}
}
