package classTest;

public class Triangle2 {
	//�ﰢ�� ���� ���ϱ�
	//�غ� * ����  / 2
	
	//�Ӽ� : �غ�, ����
	//���(�޼ҵ�) : �غ� * ����  / 2
	
	//�����ڴ� �⺻ ������
	
	//�Ӽ�
	//�Ӽ��� �ܺο��� ��ȭ���� ���ϰ� ���´�.
	//private
	private int baseLine;
	private int height;
	
	//������
	//Triangle2() is undefined
	Triangle2 (int baseLine, int height){
		this.baseLine = baseLine;
		this.height = height;
	}
	// �����ڰ� �̹� �ִ� ���� �⺻ �����ڸ� ����� ���� �ʴ´�. 
	
	//���
	int getArea () {
		return baseLine * height / 2;
	}
	
	
	
	
	
}
