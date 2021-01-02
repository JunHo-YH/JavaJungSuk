package chapter7;

abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() { /*�ش� ��ġ�� ����*/}
}

public class Marine extends Unit{
//	int x, y;
//	void move(int x, int y) {}
//	void stop() {}
	void move(int x, int y) { /* ������ ��ġ�� �̵�*/}
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

