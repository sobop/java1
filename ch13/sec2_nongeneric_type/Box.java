package ch13.sec2_nongeneric_type;

public class Box {
	private Object object;	// 어떤 객체를 담기 위해서 : 모든 클래스의 부모
		// 자동 타입 변환에 의하여 모든 객체를 대입받을 수 있다.
	// setter : 저장하는 방법
	public void set(Object object) {
		this.object = object;
	}
	// getter : 꺼내는 방법
	public Object get() {
		return object;
	}
}
