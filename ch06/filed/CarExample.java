package ch06.filed;

public class CarExample {

	public static void main(String[] args) {
		// 자동차를 생성 : new 연산자를 사용
		Car myCar = new Car();
		System.out.println("company: " + myCar.company);
		// 필드를 선언하면서 초기화를 하였으므로 값이 출력됨
		System.out.println("color: " + myCar.color);
		// default 값 null 출력
		System.out.println("speed: " + myCar.speed);
		System.out.println("body: " + myCar.body);
		
		Car yourCar = new Car();
		System.out.println("company: " + yourCar.company);
		
		Car car1 = new Car("기아자동차", "흰색");
		System.out.println("company: " + car1.company);

		// 필드의 값읇 변경(초기화)하는 방법
		// 필드의 값을 초기화하거나, 생성자를 사용해서 초기화한다.
	}

}
