package exception;

public class AccountEx {
	public static void main(String[] args) {
		Account account = new Account();
		
		//java.lang.Exception: �ܰ����
		//�� ȸ�縸�� exception�� ���� �� �ִ�.
		try {
			account.withdraw(10000);
		} catch (Exception e) {
			//e.printStackTrace(); // ������ ��� ������ �����ؼ� �������.
			System.out.println(e.getMessage());//������ ������ ����ڿ��� ������ �˷��ֱ� ���ؼ� ���
		}
		
		//try ������ �ܵ����� �� �� ����
		//try~finally �Ǵ� try~catch�� ���� �´�.
		
		
	}
}
