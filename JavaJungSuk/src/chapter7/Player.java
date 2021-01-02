package chapter7;

public abstract class Player {
	boolean pause; // �Ͻ����� ���¸� �����ϱ� ���� ����
	int currentPos; // ���� Play�ǰ� �ִ� ��ġ�� �����ϱ� ���� ����

	Player() { // �߻�Ŭ������ �����ڰ� �־���Ѵ�.
		pause = false;
		currentPos = 0;
	}

	// ������ ��ġ(pos)���� ����� �����ϴ� ����� �����ϵ��� �ۼ��Ǿ�� �Ѵ�.
	abstract void play(int pos); // �߻�޼���

	// ����� ��� ���ߴ� ����� �����ϵ��� �ۼ��ؾ� �ϴ�.
	abstract void stop();

	void play() {
		play(currentPos); // �߻�޼��带 ����� �� �ִ�.
	}

	void pause() {
		if (pause) { 			// pause�� true�� ��(��������) pause�� ȣ��Ǹ�,
			pause = false; 		// pause���¸� false�� �ٲٰ�
			play(currentPos); 	// ������ ��ġ���� play�Ѵ�.
		} else { 				// pause�� false�� �� (play����) pause�� ȣ��Ǹ�,
			pause = true;		// pause���¸� true�� �ٲٰ�
			stop(); 			// play�� �����
		}
	}
}

class CDPlayer extends Player {
	void play(int currentPos) {
		// ������ �߻�޼��带 ����.
	}
	
	void stop() {
		// ������ �߻�޼��带 ����
	}
	
	// CDPlayerŬ������ �߰��� ���ǵ� ���
	int currentTrack; // ���� ������� Ʈ��
	
	void nextTrack() {
		currentTrack++;
	}
	
	void preTrack() {
		if(currentTrack > 1) {
			currentTrack--;
		}
	}
	
}


