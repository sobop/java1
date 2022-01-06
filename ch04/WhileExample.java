package ch04;

public class WhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		int i = 1;
		while (i <= 10) {
			total += i;
			i++;
			System.out.println("total=" + total + ", i=" + i);
		}
		System.out.println("합= " + total);
		
		boolean run = true;
		int j = 0;
		while(run) {
			if(j > 100) {
				break;
			}
			
			j++;
			System.out.println(j);
		}
				
	}


}
