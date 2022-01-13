package ch06.getter_settter;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
//		myCar.speed = callMethod();	// 직접 필드에 참조변수를 통해서 수정할 수 있는 권한을 부여
		// 바람직하지 않은 결과를 가져올 수 있다. -> 직접 수정하지 못하게 하기
		myCar.setSpeed(callMethod());	// 간접적으로 수정할 수 있는 방법을 사용
//		System.out.println("속도 : " + myCar.speed);
		System.out.println("속도 : " + myCar.getSpeed());
	}
	
	private static int callMethod() {
		// 동작을 수행
		return -20;	// 
	}

}
