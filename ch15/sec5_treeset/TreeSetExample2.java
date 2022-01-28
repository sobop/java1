package ch15.sec5_treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

// Set은 순서가 없음
// TreeSet은 순서가 있음 : 바이너리 트리 형태로 정렬을 하면서 데이터를 저장 -> 순서를 유지

public class TreeSetExample2 {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		for(int score : scores) {
			System.out.print(score + " ");
		}
		System.out.println("\n");	// 정렬 : 75 80 87 95 98 (오름차순)
		
		// NavigableSet
		// desendingSet() : 내림차순으로 NavigableSet을 반환
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		for(int score : descendingSet) {
			System.out.print(score + " ");
		}
		System.out.println("\n");	// 내림차순으로 정렬
		
		// descendingSet을 한번 더 호출하면 오름차순으로 정렬
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		for(int score : ascendingSet) {
			System.out.print(score + " ");
		}
		System.out.println();	// 오름차순으로 정렬
	}

}
