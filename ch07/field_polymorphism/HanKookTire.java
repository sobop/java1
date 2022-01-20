package ch07.field_polymorphism;

public class HanKookTire extends Tire {

	public HanKookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	// 부모 메소드를 재정의
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {	// 수명내
			System.out.println(location + " HanKookTire 수명: " + 
				(maxRotation - accumulatedRotation) + "회");
			return true;
		} else {	// 수명 다함
			System.out.println(location + " HanKookTire 펑크 ***");
			return false;
		}
	}
}
