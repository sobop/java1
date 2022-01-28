package ch15.sec5_treeset;

import java.util.TreeSet;

/*
 * TreeSet : 바이너리 트리 형태로 저장되는 Set의 일종 -> 검색을 빠르게 할 때 사용
 * Set : index가 없다.
 * 	- 중복된 값을 허용하지 않는다.
 * first(), last() 
 */
public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		// 가장 낮은 점수
		int score = scores.first();
		System.out.println("가장 낮은 점수 : " + score);
		
		score = scores.last();
		System.out.println("가장 높은 점수 : " + score);
		
		// 95점 아래 점수
		score = scores.lower(new Integer(95));	// 바로 아래
		System.out.println("95점 아래 점수 : " + score);
		
		// 95점 위의 점수
		score = scores.higher(new Integer(95));	// 바로 위
		System.out.println("95점 위의 점수 : " + score);
		
		// 95점 이거나 바로 아래 점수
		score = scores.floor(new Integer(95));	// 바로 아래
		System.out.println("95점 이거나 바로 아래 점수 : " + score);
		
		// 85점 이거나 바로 위의 점수
		score = scores.ceiling(new Integer(85));	// 바로 아래
		System.out.println("85점 이거나 바로 위 점수 : " + score);
		
		// 오름차순
		while(!scores.isEmpty()) {
			score = scores.pollFirst();	// 제거
			System.out.println(score + "(남은 객체 수: " + scores.size() + ")");
		}
	}

}
