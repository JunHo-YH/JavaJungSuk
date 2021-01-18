package chapter6_;

public class Exercise6_22 {

	public static boolean isNumber(String str) {
		if (str == null || str.equals("")) {
			return false;
		}
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch < '0' || ch > '9') {
				return false;
			}
		}
		return true;
		
	}

}
