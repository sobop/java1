package ch06.constructor;

public class Car {
	String company = "포드 자동차";	// 초기값 -> 객체를 생성할 때마다 디폴트값으로 저장됨
	String model;	// 초기화하지 않음 -> default 값 null로 초기화가 됨
	int speed;
	
	// 생성자 : new 연산자로 객체를 생성하면서 필드값을 초기화할 때 사용된다.
	// 형식 : 접근제한자(public) 클래스이름() { }
	// public Car() { } // default 생성자
	// default 생성자를 정의하지 않더라도 컴파일러는 있는 것으로 간주한다.
	// 생성자를 추가
	public Car(String model) { 
		this.model = model;	// 매개변수로 초기값을 받아서 필드 model을 초기화
	}
//	public Car(String company) {	// 매개변수의 이름은 중요하지않다.
//		this.company = company;		// 위에서 정의한 생성자와 구별을 하지 못한다.
//	}
	// 다른 생성자를 추가하면 default 생성자는 없어진다.
	// 추가한 생성자를 사용해서 객체를 생성해라.
	// default 생성자가 필요하면, 별도로 정의를 해주어야한다.
	public Car() { }
	
	public Car(String company, String model) {
		this.company = company;	// 왼쪽(필드) = 오른쪽(매개변수)
		this.model = model;
	}
//	public Car(String company, String model) {		//위랑 구별하지 못한다.
//		this.company = company;	// 왼쪽(필드) = 오른쪽(매개변수)
//		this.model = model;
//	}
	// 다른 생성자를 또 만들 수 있음 -> 생성자 오버로딩
	public Car(String c, String m, int s) {
		company = c;
		model = m;
		speed = s;
	}
}
