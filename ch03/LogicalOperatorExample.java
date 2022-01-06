package ch03;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		if((a = 30) == 20 && (b = 40) == 40) { // false && true = false
		}
		System.out.println("a=" + a + ", b=" + b); // a=30, b=20 (A && B : A값이 false면 B 참조 안함)
		
		if((a = 30) == 20 & (b = 40) == 40) { // false && true = false	
		}
		System.out.println("a=" + a + ", b=" + b); // a=30, b=40 (A & B : A값이 false여도 B 참조함) 
	}
	

}
