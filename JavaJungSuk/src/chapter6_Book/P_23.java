package chapter6_Book;

public class P_23 {

	static int max(int[] arr) {
		// �־��� �迭�� null�̰ų� ũ�Ⱑ 0�̸� -9999999999�� ��ȯ�϶�
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
		System.out.println("�ִ밪 :" + max(data)); // �ִ밪
		System.out.println("�ִ밪 :" + max(null)); // �ִ밪
		System.out.println("�ִ밪 :" + max(new int[] {})); // 0 �ִ밪 ũ�Ⱑ �� �迭

	}

}
