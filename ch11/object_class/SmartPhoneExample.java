package ch11.object_class;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone("S22", "안드로이드");
		System.out.println(phone);	// 목적 : 객체의 정보를 출력
		// 재정의 하기 전
		// 현재는 Object 클래스의 toString() 메서드를 호출
		// 결과 : ch11.object_class.SmartPhone@15db9742
		// 재정의를 한다.
	}

}
