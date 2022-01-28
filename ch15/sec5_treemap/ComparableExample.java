package ch15.sec5_treemap;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<Person>();
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("감자바", 25));
		treeSet.add(new Person("박지원", 31));
		
		// 나이의 오름차순으로 정렬
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Person p = iterator.next();
			System.out.println(p.name + ", " + p.age);
		}
	}

}
