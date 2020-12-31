package chapter6_Book;

public class Exercise6_20 {
	public static int[] shuffle(int[] arr) {
		if(arr == null || arr.length == 0) { // ��ȿ�� �˻�
			return arr;
		}
		for(int i = 0; i < arr.length; i++) { // index 0��° ~ �迭�� ���������� ��� �������� ����
			int j = (int)(Math.random() * arr.length);
			
			// arr[i]�� arr[j]�� ��ġ�� ���� �ٲ۴�.
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
		return arr;
	}

	public static void main(String[] args) {

		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(java.util.Arrays.toString(original));

		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}

}