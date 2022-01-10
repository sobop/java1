package ch06.constructor;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car();	
		// 객체를 생성 : default 생성자를 정의하지 않더라도 사용 가능
		// default 생성자 : 어떤 필드도 초기화하지 않음
		// 객체를 생성하면서 필드값을 초기화하고 싶다
		Car car2 = new Car("람보기");	// 모델명을 초기화
		System.out.println("모델: " + car2.model);
		
		Car car3 = new Car("현대", "소나타");
		System.out.println("회사: " + car3.company);
		System.out.println("모델: " + car3.model);
	}

}
