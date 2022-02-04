package ch13.sec2_generic_type;

public class BoxExample {

	public static void main(String[] args) {
		// 구체적으로 T -> String 사용하여 정의
		// Box안에 String을 저장
		Box<String> box = new Box<String>();
		box.set("hello");		// "hello"문자열을 저장
		String str = box.get();	// 강제타입변환이 필요없다. <- 구체적인 타입을 지정해주면
		box.set(new Apple());	// 에러가 발생 : 타입을 String으로 한정을 하였으므로
			// 다른 객체를 저장할 수 없다.
		Box<Apple> appleBox = new Box<Apple>();	// 타입Apple로 지정
		appleBox.set(new Apple());	// Apple저장
		Apple out = appleBox.get();	// Apple 꺼낼 수 있다. -> 강제타입변환 필요 X

	}

}
