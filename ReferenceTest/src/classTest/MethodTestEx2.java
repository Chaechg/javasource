package classTest;

public class MethodTestEx2 {
	public static void main(String[] args) {
		MethodTest2 obj = new MethodTest2();
		
		//������ ��� ���
		obj.print99dan();
		
		//���� ���
		//�޼ҵ带 ȣ���ϴ� �ʿ��� �Է°��� �־��ֱ�
		obj.sum(11, 15);
		// obj.sum(11.5, 15.5); �������� �ƴ� ���� �Է��ϸ� ������ ����.
		
		byte b1=3;
		byte b2=5;
		obj.sum(b1, b2); //obj.sum(3,5)�� ���� �ǹ��̴�.
		// byte�� ����� ���� int�� ��Ҵ�. 
		//	int = byte ����ȯ - �ڵ�����ȯ
		//����ȯ  (1)�ڵ�����ȯ -Promotion ���� Ÿ���� ū Ÿ�Կ� ����
		//	   (2)��������ȯ -Casting   ū Ÿ���� ���� Ÿ�Կ� ����
		//		int =(int)float - ��������ȯ	
		
		
		
	}
}
