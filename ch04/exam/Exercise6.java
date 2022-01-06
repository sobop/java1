package ch04.exam;

public class Exercise6 {

	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			if(i == 1) {
				System.out.println("*");
			} if(i == 2) {
				System.out.println("**"); 
				} if(i == 3) {
				System.out.println("***"); 
					} if(i == 4) {
						System.out.println("****"); 
						} if(i == 5) {
							System.out.println("*****"); 
							}
		}
		
		for(int i = 1; i <=5 ; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println(); //줄바꿈
		}

	}

}
