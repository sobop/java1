package ch05;

public class ArrayCreateValueListExample {

	public static void main(String[] args) {
		int[] arr = {90, 80, 97};	// 방법 1
		int[] arr2 = null;
//		arr2 = { 30, 40, 50 };	// 데이터 타입이 정의되지 않아 에러(8줄에서)
		int[] scores;
		scores = new int[] {83, 90, 87};	// 방법 2
		int sum1 = 0;
		for(int i =0; i < scores.length; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합: " + sum1);
		
//		int sum2 = add({1, 2, 3});	// 메소드에 배열 정보를 넣어주어야함. (데이터타입이 정의되지않음.)
		int sum2 = add(new int[] {1, 2, 3});	// 방법 2번 사용해야함.
		System.out.println("총합: " + sum2);
	}
	// 배열의 합을 반환하는 메소드
	private static int add(int[] scores) {
		int sum1 = 0;
		for(int i =0; i < scores.length; i++) {
			sum1 += scores[i];
		}
		return sum1;
		
	
	}
}
