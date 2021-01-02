package chapter7;

abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() { /*해당 위치에 정지*/}
}

public class Marine extends Unit{
//	int x, y;
//	void move(int x, int y) {}
//	void stop() {}
	void move(int x, int y) { /* 지정된 위치로 이동*/}
	void stimPack() {} 
}

class Tank extends Unit{
//	int x, y;
//	void move(int x, int y) {}
//	void stop() {}
	void move(int x, int y) {}
	void changeMode() {}
}

class Dropship extends Unit{
//	int x, y;
//	void move(int x, int y) {}
//	void stop() {}
	void move(int x, int y) {}
	void load() {}
	void unload() {}
}

