package abstractTest;

public abstract class Player {
	boolean pause;
	int currentPos;
	
	public Player() {
		this.pause=false;
		currentPos = 0;
	}
	
	abstract void play(int pos);
	abstract void stop();
	
	void play () {
		play(currentPos);
	}
	//�߻�޼ҵ�� �ٸ� �޼ҵ�-�߻�޼ҵ尡 �ƴ� -�� �θ� �� �ִ�.
	//�޼��� �̸��� ���� ���� �޼����� �����ε��� ������ ����ȴ�.
	//��ȣ���� ��������� �ٸ��Ƿ� �ٸ� �޼����̴�.
	
	void pause() {
		if (pause) {
			pause = false;
			play(currentPos);
		}else {
			pause=true;
			stop();
		}
		
		
	}
}
