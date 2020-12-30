package chapter6_Book;

public class Exercise6_20 {
	public static int[] shuffle(int[] arr) {
		if(arr == null || arr.length == 0) { // 유효성 검사
			return arr;
		}
		for(int i = 0; i < arr.length; i++) { // index 0번째 ~ 배열의 마지막까지 모두 무작위로 변경
			int j = (int)(Math.random() * arr.length);
			
			// arr[i]와 arr[j]의 위치를 서로 바꾼다.
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
