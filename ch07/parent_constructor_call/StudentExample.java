package ch07.parent_constructor_call;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("홍길동", "111111-2222222", 1);
		System.out.println("학생 이름: " + student.name);
		System.out.println("학생 주민 번호: " + student.ssn);
		System.out.println("학생 번호: " + student.studentNo);
	}

}
