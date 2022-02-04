package ch13.sec2_generic_multi_type;

public class Product<T, M> {
	// 필드 : 어떤 객체던지 저장할 수 있다.
	// String, Integer, ...을 모두 저장할 수 있다. -> 제네릭 타입을 사용해서 정의
	private T kind;
	private M model;
	
	public T getKind() {
		return kind;
	}
	public M getModel() {
		return model;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public void setModel(M model) {
		this.model = model;
	}
}
