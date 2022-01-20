package ch08.interface_basic;

public class KumhoTire extends Tire {

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {	// 수명내
			System.out.println(location + " KumhoTire 수명: " + 
				(maxRotation - accumulatedRotation) + "회");
			return true;
		} else {	// 수명 다함
			System.out.println(location + " KumhoTire 펑크 ***");
			return false;
		}
	}
}
