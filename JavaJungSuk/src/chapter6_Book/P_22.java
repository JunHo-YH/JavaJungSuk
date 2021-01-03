package chapter6_Book;

public class P_22 {

	static boolean isNumber(String str) {
		if(str == null || str == "s") {
			return false;
		}
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if (ch < '0' || ch > '9')
				return false;
		}
		
		return true;
		
	}

	public static void main(String[] args) {

		String str = "123";
		System.out.println(str + "�� �����Դϱ�? " + isNumber(str));
		
		String str2 = "";
		System.out.println(str + "�� �����Դϱ�? " + isNumber(str2));
	}

}
