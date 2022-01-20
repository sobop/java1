package jungsuk;

public class Exercise6_3 {
	public static void main(String args[]) {
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("이름:"+s.name);
		System.out.println("총점:"+s.getTotal());
		System.out.println("평균:"+s.getAverage());
	}
	static class Student {
		String name;
		int ban;
		int no;
		int kor;
		int eng;
		int math;

		int getTotal() {
			return kor + eng + math;
		}
		float getAverage() {
			return (int)((((float)getTotal() / 3) + 0.05f) / 0.1f) / 10f;
			// return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
		}

	}
	
}
