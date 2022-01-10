package ch06;

/*
 * 클래스의 구성 맴버 : 필드, 생성자, 메소드, 상수
 * 필드 : 속성, 정보
 * 생성자 : 필드의 초기화(객체를 생성할 때)
 * 메소드 : 동작, 행위
 */
public class ClassName {
	// 필드
	String field1;
	int field2;
	
	// 생성자 : 반환형이 없는 메소드
	// 생성자 : ClassName을 사용
	public ClassName() {
		// 실행부
		field1 = "홍길동";		// 할수는 있지만 사용하지 않음
	}
	
	// 어떤 값을 초기화 할 것인가에 따라서 매개변수를 다르게 사용
	public ClassName(String field1) {
		this.field1 = field1;	// 필드 field1을 매개변수 값으로 초기화
	}
	
	// 생성자 : 매개변수로 field1 과 field2를 받아서 필드 field1 과 field2 초기화
	public ClassName(String field1, int field2) {
		this.field1 = field1;
		this.field2 = field2;
	}

	// 매소드 : 반환형이 존재 -> 어떤 동작을 수행 -> 그 결과를 반환
	// void : 반환하는 것이 없을 떄 void를 사용
	public void method1() {
		
	}
	
	
	//메소드
	public String getField1() {
		return field1;	// field1이 String 이므로 반환형이 String
						// 클래스에 있는 필드 field1의 값을 반환
	}
	
	public int getField2() {
		return field2;	// field2이 int 이므로 반환형이 int
						// 클래스에 있는 필드 field2의 값을 반환
	}
	
	public void setField1(String field1) {	// 매개변수로 받은 field1 값을
		this.field1 = field1;
	}
	
	public void setField2(int field1) {
		this.field2 = field2;
	}
}
