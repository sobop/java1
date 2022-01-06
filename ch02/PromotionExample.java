package ch02;

/* 타입변환 : 자동 타입 변환, 강제 타입 변환
 * 자동 타입변환 : 작은 값을 큰 값에 저장할 때
 * byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
 */
public class PromotionExample {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 13;
		double avg1 = (num1 + num2) /2;
		System.out.println("평균 = " + avg1);
		double avg2 = (double)(num1 + num2) /2;
		System.out.println("평균 = " + avg2);

	}

}
