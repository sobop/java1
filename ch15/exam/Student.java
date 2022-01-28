package ch15.exam;

public class Student implements Comparable<Student> {
	public int studentNum;
	public String name;
	
	public String id;
	public int score;
	
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	public Student(String id, int score) {
		this.id = id;
		this.score = score;
	}
	
	// 학번이 같으면 동일한 Student로 간주
	@Override
	public boolean equals(Object obj) {
		// 코드 작성
		if(obj instanceof Student) {
			Student s = (Student)obj;
			if(studentNum == s.studentNum)
				return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// 코드 작성
		return studentNum;
	}

	// score 필드값으로 자동 정렬
	@Override
	public int compareTo(Student o) {
		return Integer.compare(score, o.score);
	}
}