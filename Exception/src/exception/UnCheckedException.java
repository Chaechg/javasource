package exception;

public class UnCheckedException {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try { //try - ���ܰ� �߻��� �� �ִ� ����
			data1 = args[0];
			data2 = args[1];
		} catch (Exception e) { 
			//catch - ���ܰ� �߻��ϸ� ��� ó���� ������ �ۼ�
			System.out.println("���� �Ű� ���� ���� �����մϴ�.");
		}

	}

}
