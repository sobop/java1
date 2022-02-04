package ch13.sec2_generic_type;

// 제네릭 표기법을 사용해서 정의
// <T>를 class 이름 뒤에 붙여준다.
// 제네릭 객체(Object)
// 어떤 객체든지 저장할 목적으로 제네릭 표기법을 사용해서 Box클래스를 정의한다.

public class Box<T> {
	private T t;	// Object -> T라고 표기(나중에 구체화한다 : String, Integer)
	// setter
	public void set(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
}
