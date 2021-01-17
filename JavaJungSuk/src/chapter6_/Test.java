package chapter6_;

public class Test {
	int iv = 10;
	static int cv = 20;

	int iv2 = cv;

	public static void main(String[] args) {
		Test t = new Test();
		Test t2 = new Test();

		t.cv = t.iv;
		System.out.println(t.cv);
		System.out.println(t2.cv);
	}

}
