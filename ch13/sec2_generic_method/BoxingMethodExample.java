package ch13.sec2_generic_method;

import ch13.sec2_generic_type.Box;

public class BoxingMethodExample {

	public static void main(String[] args) {
		Box<Integer> box1 = Util.boxing(100);
		int intValue = box1.get();
		
		Box<String> box2 = Util.boxing("금요일");
		String str = box2.get();
	}

}
