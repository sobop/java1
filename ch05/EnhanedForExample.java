package ch05;

public class EnhanedForExample {

	public static void main(String[] args) {
		
		int[] scores = {90, 87, 97};
		int total = 0;
		
		for(int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		System.out.println("총합 = " + total);
		
		// Enhanced for 문
		// 왼쪽 항목 : 여러 개 중의 하나 (데이터타입 변수명) -> int score
		// 오른쪽 항목 : 여러 개 (배열, 컬렉션)
		total = 0;
		for(int score : scores) {
			total += score;
		}
		System.out.println("총합 = " + total);
	}

}
