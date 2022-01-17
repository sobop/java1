package ch07.auto_promotion;

public class ScopeExample {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.field1 = 20;
		p1.method1();
		p1.method2();
		
		if(p1 instanceof Child) {
			Child c3 = (Child)p1;	// 강제타입변환
			c3.childField = "접근 시도";	// 에러 발생
			c3.childMethod();
		}
		
		Parent parent = new Child();	// 자동 타입변환 : 부모타입 = 자식타입
		// Parent로 접근할 수 있는것
		// Parent 타입은 Parent만 접근 가능
		// 예외는 자식이 재정의한 메소드에는 접근 가능
		parent.field1 = 30;	// Parent가 정의한 필드
		parent.method1();	// Child가 정의한 필드
		parent.method2();	// Parent가 정의한 메소드
//		parent.childField = "접근 불가능"	// 참조변수 타입이 Parent이므로 Parent만 접근 가능
//		parent.childMethod();	// 원래 생성된 것이 Child임에도 불구하고 접근 불가능
		
		// 자동 타입 변환 : 부모 = 자식
		// 강제 타입 변환 : 자식 = 부모 -> 에러
//		Child c1 = parent; // 에러
		if(parent instanceof Child) {	// parent가 Child로부터 생성되었는지 확인

		}
		Child c2 = (Child)parent;	// 강제 타입변환
		c2.childField = "접근가능";
		c2.childMethod();
//		int num = 3.14;		// 에러 : 정수 = 실수
		int num = (int)3.14;
		
		// Child 데이터타입은 Child만 보인다. -> 상속을 받았으므로 Parent도 접근 가능
		Child child = new Child();
		child.field1 = 30;
		child.childField = "접근 가능";
		child.method1();
		child.method2();
		child.childMethod();
	}

}
