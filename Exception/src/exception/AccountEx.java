package exception;

public class AccountEx {
	public static void main(String[] args) {
		Account account = new Account();
		
		//java.lang.Exception: 잔고부족
		//각 회사만의 exception을 만들 수 있다.
		try {
			account.withdraw(10000);
		} catch (Exception e) {
			//e.printStackTrace(); // 오류가 어디서 났는지 추적해서 출력해줌.
			System.out.println(e.getMessage());//개발이 끝나고 사용자에게 오류를 알려주기 위해서 사용
		}
		
		//try 구문만 단독으로 올 수 없음
		//try~finally 또는 try~catch가 따라 온다.
		
		
	}
}
