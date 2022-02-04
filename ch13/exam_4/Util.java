package ch13.exam_4;

public class Util {

	public static <K, V> V getValue(Pair <K, V> pair, String key) {
		String pairKey = (String)pair.getKey();
		if(key.equals(pairKey)) {
			return (V)pair.getValue();
		} else {
			return null;
		}
	}
	
}
