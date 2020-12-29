package chapter6_Book;

public class MyPoint {
	int x;
	int y;
	
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x1, int y1) {
		return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));
	}
	
	
	static void main(String[] args) {
		MyPoint mp = new MyPoint(1, 1);
		System.out.println(mp.getDistance(2, 2));
	}
}
