package ch15.sec5_treemap;

//비교방법으로 Person 객체에 Comparable 인터페이스를 구현하는 방법
// 비교방법으로 어떻게 할 것인지를 정의를 한다.
// name, age -> age

public class Person implements Comparable<Person> {
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		return Integer.compare(age, o.age);
	}
}
