package chapter7;

interface Repairable {
}

class Unit3 {
	int hitPoint;
	final int MAX_HP;
	
	Unit3() {
		this(0);}
	
	Unit3(int hp) {
		MAX_HP = hp;
	}

}

class GroundUnit extends Unit3 {
	GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit3 {
	AirUnit(int hp) {
		super(hp);
	}
}

class Tank3 extends GroundUnit implements Repairable {
	Tank3() {
		super(150);	// Tank의 HP는 150이다.
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "Tank";
	}
}

class Dropship3 extends AirUnit implements Repairable {
	Dropship3() {
		super(125);	// Dropship의 HP는 125이다.
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "Dropship";
	}
}

class Marine3 extends GroundUnit implements Repairable {
	Marine3() {
		super(40);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Marine";
	}
}

class SCV3 extends GroundUnit implements Repairable {
	SCV3() {
		super(60);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "SCV";
	}
	
	void repair(Repairable r) {
		if (r instanceof Unit3) {
			Unit3 u = (Unit3) r;
			while(u.hitPoint != u.MAX_HP) {
				// Unit의 HP를 증가시킨다.
				u.hitPoint++;
			}
			System.out.println(u.toString() + "의 수리가 끝났습니다.");
		}
	}
	
	
}






public class RepairableTest {

	public static void main(String[] args) {
		Tank3 tank = new Tank3();
		Dropship3 dropship = new Dropship3();
		Marine3 marine = new Marine3();
		SCV3 scv = new SCV3();
		
		scv.repair(tank);
		scv.repair(dropship);
		scv.repair(marine);
	}

}
