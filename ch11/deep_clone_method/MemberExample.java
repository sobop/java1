package ch11.deep_clone_method;

public class MemberExample {

	public static void main(String[] args) {
		Member original = new Member("홍길동", 25, new int[] { 90, 90 }, new Car("그랜저"));

		// 복제
		Member cloned = original.getMember();
		cloned.scores[0] = 100;
		cloned.car.model = "전기자동차";
		cloned.age = 30;

		// 복제된 객체의 정보를 출력
		System.out.println("복제된 객체의 정보");
		System.out.println("name=" + cloned.name);
		System.out.println("age=" + cloned.age);
		// 점수 출력
		System.out.print("점수: {");
		for (int i = 0; i < cloned.scores.length; i++) {
			System.out.print(cloned.scores[i]);
			System.out.print((i == cloned.scores.length - 1) ? "" : ",");
		}
		System.out.println("}");
		// 차 정보 출력
		System.out.println("차의 모델: " + cloned.car.model);
		System.out.println("-----------------------------------");

		// 원본 객체의 정보를 출력
		System.out.println("원본 객체의 정보");
		System.out.println("name=" + original.name);
		System.out.println("age=" + original.age);
		// 점수 출력
		System.out.print("점수: {");
		for (int i = 0; i < original.scores.length; i++) {
			System.out.print(original.scores[i]);
			System.out.print((i == original.scores.length - 1) ? "" : ",");
		}
		System.out.println("}");
		// 차 정보 출력
		System.out.println("차의 모델: " + original.car.model);
	}

}
