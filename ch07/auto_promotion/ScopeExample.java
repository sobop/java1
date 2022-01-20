package ch07.auto_promotion;

public class ScopeExample {

	public static void main(String[] args) {
		Parent p1 = new Parent();	// Parent 객체 생성 -> Child 멤버는 존재하지 않음
		// Parent 객체가 정의한 멈버에 접근 가능
		p1.field1 = 20;
		p1.method1();
		p1.method2();
		
		if(p1 instanceof Child) {
			Child c3 = (Child)p1;	// 강제타입변환 : 자식 = (Child)부모
				// ClassCastException 발생됨
			c3.childField = "접근 시도";	// 에러 발생 -> 존재하지 않는 멤버에 접근
			c3.childMethod();
		}
		// p1이 Child 객체의 인스턴스가 아니면 강제 타입 변환이 수행되지 않음
		
		// 생성한 객체는 Child 이다.
		Parent parent = new Child();	// 자동 타입 변환 : 부모 타입 = 자식 타입
		// parent로 접근할 수 있는 것이 무엇인가?
		// Parent 타입은 Parent만 접근 가능하다.
		// 예외는 자식이 재정의한 메소드에는 접근 가능
		parent.field1 = 30;	// Parent가 정의한 필드
		parent.method1();	// Child가 재정의한 메소드 -> 다형성 (예외)
		parent.method2();	// Parent가 정의한 메소드
//		parent.childField = "접근 불가능";	// 참조변수 타입이 Parent이므로 Parent만 접근 가능
//		parent.childMethod();	// 접근 불가능 : 원래 생성된 것이 Child임에도 불구하고
		
		// 자동 타입 변환 : 부모 = 자식
		// 강제 타입 변환 : 자식 = 부모 -> 에러
//		Child c1 = parent;	// 에러 발생
		if(parent instanceof Child) {	// parent가 Child로부터 생성되었는지 확인을 하고
			// 강제 타입 변환 수행
			Child c2 = (Child)parent;	// 강제 타입 변환
			// 원래 생성한 객체가 Child이므로 Child가 정의한 멤버에 접근할 수 있음
			c2.childField = "접근 가능";
			c2.childMethod();			// 접근 가능
		}
		
//		int num = 3.14;		// 에러 : 정수 = 실수
		int num = (int)3.14;	// 강제 타입 변환 : 소수점이 없어지는 것을 감안해서 작업을 하겠다.
		
		// Child 데이터 타입은 Child만 보인다. -> 상속을 받았으므로 Parent도 접근 가능
		Child child = new Child();
		child.field1 = 30;
		child.childField = "접근 가능";
		child.method1();	// 재정의한 메소드가 호출됨
		child.method2();
		child.childMethod();
	}

}
