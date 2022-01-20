package ch07.field_polymorphism;

public class NexenTire extends Tire {

	public NexenTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {	// 수명내
			System.out.println(location + " NexenTire 수명: " + 
				(maxRotation - accumulatedRotation) + "회");
			return true;
		} else {	// 수명 다함
			System.out.println(location + " NexenTire 펑크 ***");
			return false;
		}
	}
}
