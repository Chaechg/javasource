package abstractTest;

public abstract class Unit {
	//Unit Ŭ������ ��ü�� ���� ���������� ���� �����̴�.
	
	int x, y;
	
	abstract void move(int x, int y);
		
	void stop() {
		System.out.println("������ ��ġ���� stop");
	}
	
	// �������� ���� �θ�Ŭ������
	
}
