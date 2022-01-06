package ch04;

public class IfDiceExample {

	public static void main(String[] args) {
		double value = (int)(Math.random()*6 + 1); // 0~1사이의 double값 발생
		System.out.println(value);
		if(value == 1) {
			System.out.println("1");
		} else if(value == 2) {	
			System.out.println("2");
		} else if(value == 3) {	
			System.out.println("3");
		} else if(value == 4) {	
			System.out.println("4");
		} else if(value == 5) {	
			System.out.println("5");
		} else if(value == 6) {	
			System.out.println("6");
		}

	}

}
