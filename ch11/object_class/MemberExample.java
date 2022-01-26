package ch11.object_class;

public class MemberExample {

	public static void main(String[] args) {
		Member m1 = new Member("kdhong");
		Member m2 = new Member("kdhong");
		Member m3 = new Member("blue");
		
		System.out.println("m1==m2 : " + (m1 == m2));	// false
		System.out.println("m1.equals(m2) : " + m1.equals(m2));	// true
		
		System.out.println("m1.equals(m3) : " + m1.equals(m3));	// false
		System.out.println("m1.hashCode() : " + m1.hashCode());
		System.out.println("m2.hashCode() : " + m2.hashCode());
		System.out.println("m1.hashCode() : " + m1.id.hashCode());
		System.out.println("m2.hashCode() : " + m2.id.hashCode());
	}

}
