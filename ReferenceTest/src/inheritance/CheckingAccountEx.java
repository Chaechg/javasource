package inheritance;

public class CheckingAccountEx {
	public static void main(String[] args) {
		CheckingAccount checkingAccount = new CheckingAccount("122-12",20000,"ȫ�浿","122-12-133");
		
		System.out.println(checkingAccount.pay("322-12", 2000));
		//ī���ȣ�� �ȸ´� ���
		
		System.out.println("���� �ܾ� "+checkingAccount.pay("122-12-133", 2000));
		
		
	}
}
