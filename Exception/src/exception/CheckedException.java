package exception;

public class CheckedException {
	public static void main(String[] args)  {
		//ClassNotFoundException
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//������ -�������� ������ �˷���
		//1)ù��° �ذ� - Ŭ���� ���� throws ClassNotFoundException��� ����
		//2)�ι�° �ذ� - try/catch
	}
}
