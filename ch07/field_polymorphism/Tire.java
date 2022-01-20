package ch07.field_polymorphism;

public class Tire {
	// 필드
	public int maxRotation;			// 타이어의 수명
	public int accumulatedRotation;	// 운행하는 시간
	public String location;			// 장착 위치
	
	// 생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// 메소드
	// 반환형 : true(정상 동작), false(수명을 다함)
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {	// 수명내
			System.out.println(location + " Tire 수명: " + 
				(maxRotation - accumulatedRotation) + "회");
			return true;
		} else {	// 수명 다함
			System.out.println(location + " Tire 펑크 ***");
			return false;
		}
	}
}
