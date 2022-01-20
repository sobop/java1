package ch07.exam.p5;

/* 에러의 해결 방법
 * 	1. Parent 클래스에 default 생성자를 추가
 * 	2. 부모생성자를 사용
 */

public class Child extends Parent {
	private int studentNo;
	
	// 생성자
	public Child(String name, int studentNo) {	// 에러 발생
		// 규칙 : 부모 생성자를 호출
//		super();	// 부모 생성자를 명시하지 않으면 default 생성자가 호출된다.
		super(name);	// 부모 생성자를 사용
//		this.name = name;	// 중복되므로 삭제
		this.studentNo = studentNo;
	}
}
