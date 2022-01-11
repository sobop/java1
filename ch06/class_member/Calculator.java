package ch06.class_member;

	// 정적 맴버 : 객체의 생성과 무관하게 사용할 수 있는 필드, 메소드 -> static 키워드를 사용
	// 클래스 이름을 사용하여 호출
public class Calculator {
	// 필드 -> 인스턴스 필드
	String owner;
	String model;
	int result;
	static int battery = 0;	// 정적 맴버 필드
	
	// 생성자 : 필드를 초기화
	public Calculator() { }
	
	public Calculator(String owner, String model) {
		this.owner = owner;	// this : Calculator 클래스
		this.model = model;	// 매개변수로 전달된 model과 필드인 model이 이름이 같으므로
							// 구별을 하기 위하여 필드에는 this.를 붙여준다.
	}
	
	public int add(int num1, int num2) {
		result = num1 + num2;
		return result;
	}
	
	public static void chargeBattery(int amount) {
		battery = amount;
	}
}
