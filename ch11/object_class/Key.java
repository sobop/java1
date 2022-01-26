package ch11.object_class;

public class Key {
	int number;		// 고유한 값
	
	public Key(int number) {
		this.number = number;
	}
	
	@Override
	public int hashCode() {
		return number;	// number가 같으면 hashCode() 값이 같도록 정의
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key key = (Key)obj;
			if(number == key.number) {
				return true;
			}
		}
		return false;
	}
}
