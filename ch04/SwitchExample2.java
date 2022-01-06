package ch04;

public class SwitchExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random()*6 + 1);
		switch(num) {
		case 1:
		case 3:
		case 5:
			System.out.println("홀수");
			break;
		case 2:
		case 4:
		case 6:
			System.out.println("짝수");
			break;
		}
	}

}
