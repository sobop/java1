package ch06.filed;

public class Car<Body, Engine, Tire> {
	// 고유 데이터
	String company = "현대자동차";
	String model = "소나타";
	String color;
	int maxSpeed;
	
	{	//블록을 사용 -> 필드를 조작해서 하거나
		color = company + "검정";		// 많이 사용하지 않음.
	}
	
	
	int speed;
	int rpm;
	
	Body body;
	Engine engine;
	Tire tire;
	
	public Car() { }
	public Car(String company, String color) {
		this.company = company;
		this.color = color;
	}
}
