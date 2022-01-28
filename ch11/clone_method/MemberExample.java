package ch11.clone_method;

public class MemberExample {

	public static void main(String[] args) {
		Member original = new Member("blue", "홍길동", "12345", 25, true);
		
		// 복제
		Member cloned = original.getMember();
		cloned.password = "67890";
		
		// 복제된 객체의 정보를 출력
		System.out.println("복제된 객체의 정보");
		System.out.println("id=" + cloned.id);
		System.out.println("name=" + cloned.name);
		System.out.println("password=" + cloned.password);
		System.out.println("age=" + cloned.age);
		System.out.println("adult=" + cloned.adult);
		
		// 원본 객체의 정보를 출력
		System.out.println("원본 객체의 정보");
		System.out.println("id=" + original.id);
		System.out.println("name=" + original.name);
		System.out.println("password=" + original.password);
		System.out.println("age=" + original.age);
		System.out.println("adult=" + original.adult);
	}

}