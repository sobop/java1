package ch13.sec2_nongeneric_type;

public class BoxExample {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동");
		String name = (String) box.get();	// 강제 타입 변환 Object -> String
		
		box.set(new Apple());	// Apple 객체를 저장
		Apple apple = (Apple) box.get();	// 타입변환

	}

}
