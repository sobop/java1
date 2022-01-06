package ch05;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = {"Java", "array", "copy"};
		String[] newStrArray = new String[5];
		// 얕은 복제 : 내용은 그대로 재사용하고, 참조배열을 복사
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
			for(int i = 0; i < newStrArray.length; i++) {
				System.out.println(newStrArray[i]);
			}
			// 깊은 복제 : 내용도 새로운 객체로 생성, 참조배열은 생성된 객체를 참조
			// 새로운 복제된 개체가 생기는 것
			for(int i = 0; i < oldStrArray.length; i++) {
				newStrArray[i] = new String(oldStrArray[i]);
			}
			
			for(int i = 0; i < oldStrArray.length; i++) { // 주소 비교
				if(oldStrArray[i] == newStrArray[i]) {
					System.out.println("물리적으로 같은 주소");
				} else {
					System.out.println("물리적으로 다른 주소");
				}
				if(oldStrArray[i].equals(newStrArray[i])) { // 내용 비교
					System.out.println("같은 내용");
				} else {
					System.out.println("다른 내용");
				}
				 
			}
	}

}
