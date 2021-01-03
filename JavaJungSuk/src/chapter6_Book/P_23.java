package chapter6_Book;

public class P_23 {

	static int max(int[] arr) {
		// 주어진 배열이 null이거나 크기가 0이면 -9999999999를 반환하라
		if (arr == null || arr.length == 0)
			return -99999;

		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}

	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값 :" + max(data)); // 최대값
		System.out.println("최대값 :" + max(null)); // 최대값
		System.out.println("최대값 :" + max(new int[] {})); // 0 최대값 크기가 인 배열

	}

}
