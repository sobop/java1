package ch15.sec5_treemap;

import java.util.Comparator;

// 비교방법을 제공하는 Comparator
/* 비교
 * 방법 1. 비교하고자하는 객체에서 Comparable<> 인터페이스 구현
 * 방법 2. 구현하지 않았을 때, 비교Comparator를 생성
 */

// 10 8 6 4
// 2, 4, 6, 8 -> 오름차순

public class DescendingComparator implements Comparator<Fruit> {
	// 반환값 : 1(o1 - o2 > 0), 0(o1==o2), -1(o1-o2 < 0) -> 오름차순
	//        -1			  0			   1           -> 내림차순
	@Override
	public int compare(Fruit o1, Fruit o2) {	// o1 - o2 : 가격을 이용해서 비교
//		return Integer.compare(o1.price, o2.price);	// 오름차순 o1.price - o2.price
		return Integer.compare(o2.price, o1.price);	// 내림차순
	}

}
