package classTest;

public class MethodTest2 {
	int sum2() {
		return 0;
		// add return statement
	}
	
	void sum3() {
		// change return type to 'void'
	}
	
	// �� ���� ���ڸ� �޾Ƽ� ���� ����� �����ֱ�
	// �� ���� ����(����, �Ǽ�)�� �޴´�. - (�Է°�)
	// => �������� 2���� ���ڸ� �޴´�- �� �� ��Ȯ�ϰ� ��ü������..
	int sum(int num1, int num2) { 	//2���� ������ �޴´�.
		int result = num1+num2;  	// 2�� ������ ���Ѵ�.
		return result;				// ����� ������. - (��°�, ��ȯ��)	
		//return num1+num2			//�̷��� ����ȭ �� �� �ִ�.
	}
	
	//������ 2~9�� ����ϱ�
	//�Է°� : ����, ��ȯ�� : ���� - void
	void print99dan() {
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10 ; j++) {
				System.out.printf("%d * %d = %d\n", i,j,i*j);
			}
		}
	}
	
	//�� ���� ������ �޾Ƽ�(�Է°�) ���ϱ��� ����� ����(��ȯ��)�ϱ�
	int multiply (int x, int y) { //�� ���� int�� ������ Ÿ���� ����
		return x * y;
	}
	
	
}
