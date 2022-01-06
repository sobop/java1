package ch04;

public class Person {
	String name;	// 이름
	int age;		// 나이
	String candidate;	// 선호하는 후보
	boolean gender;		// 성별(남성:true, 여성:false)
	
	public Person(String name, int age, String candidate, boolean gender) {
		this.name = name;
		this.age = age;
		this.candidate = candidate;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCandidate() {
		return candidate;
	}

	public void setCandidate(String candidate) {
		this.candidate = candidate;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
}