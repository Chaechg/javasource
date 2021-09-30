package inheritance;

public class CheckingAccountEx {
	public static void main(String[] args) {
		CheckingAccount checkingAccount = new CheckingAccount("122-12",20000,"홍길동","122-12-133");
		
		System.out.println(checkingAccount.pay("322-12", 2000));
		//카드번호가 안맞는 경우
		
		System.out.println("현재 잔액 "+checkingAccount.pay("122-12-133", 2000));
		
		
	}
}
