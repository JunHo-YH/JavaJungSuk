package chapter9_test;

class Value {
	int value;

	Value(int value) {
		this.value = value;
	}

	public boolean equals(Object obj) {

		if (obj instanceof Value) {
			return this.value == ((Value) obj).value;
		} else {
			return false;
		}
	}

}

public class EqualsEx1 {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);

		if (v1.equals(v2)) {
			System.out.println("v1과 v2는 같습니다.");
		} else {
			System.out.println("v1과 v2는 다릅니다");
		}

		v2 = v1;
		if (v1.equals(v2)) {
			System.out.println("v1과 v2는 같습니다.");
		} else {
			System.out.println("v1과 v2는 다릅니다");
		}

	}

}
