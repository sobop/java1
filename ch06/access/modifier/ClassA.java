package ch06.access.modifier;

/*
 * 접근 제한자(Access Modifier) : 클래스, 필드, 생성자, 메소드
 * 접근 권한에 제한을 건다. 패키지 경로에 따라서 다른 권한을 부여
 * public : 제한(사용)이 없다. 패키지(같은, 다른)에서 접근에 제한이 없다.
 * protected : 상속관계가 있는 자식 클래스에게는 public처럼 동작(접근허용), 그 외는 default처럼 동작
 * default : 같은 패키지 내의 다른 클래스에서 접근을 허용. 다른 패키지의 클래스에서는 접근 불가능
 * private : 클래스 자기자신만이 접근을 허용. 다른클래스는 접근 허용 X
 * 
 * class에는 public과 default만 존재.
 */
public class ClassA {
	public String field1;
	protected int field2;
	long field3;
	private float field4;
	
	public ClassA() { }
	protected ClassA(String field1) {
		this.field1 = field1;
	}
	ClassA(String field1, int field2) {
		this.field1 = field1;
		this.field2 = field2;
	}
	private ClassA(int field2) {
		this.field2 = field2;
	}
	
	public void method1() {
		System.out.println("ClassA:method1() 호출됨");
	}
	protected void method2() {
		System.out.println("ClassA:method2() 호출됨");
	}
	 void method3() {
		System.out.println("ClassA:method3() 호출됨");
	}
	private void method4() {
		System.out.println("ClassA:method4() 호출됨");
	}
}
// 접근 제한자를 기술하지 않음 -> default
class ClassB {
	
}
