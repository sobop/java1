package ch15.sec5_treemap;

import java.util.Iterator;
import java.util.TreeSet;

// Fruit이 Comparable 인터페이스를 구현하지 않은 경우

public class ComparatorExample {

	public static void main(String[] args) {
		// 비교방법 DescendingComparator를 TreeSet 생성자에 넣어준다.
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());
		// 중복을 허용하지 않음.
		// 저장이 될 때 정렬이 되어 저장이 된다. -> treeset의 특징
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 10000));
		treeSet.add(new Fruit("딸기", 6000));
		Iterator<Fruit> iterator = treeSet.iterator();	// iterator : 반복자
		while(iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit.name + ", " + fruit.price);
		}
	}

}
