package inheritance;

public class CreditLineAccount extends Account2 {
	// 계좌번호, 계좌주, 잔액,  / 입금하다, 출금하다.
	//마이너스한도
	private int creditLine; //마이너스 한도
	//생성자 => 초기화
	public CreditLineAccount(String accountNo, int balance, String name, int creditline) {
		super(accountNo, balance, name);
		this.creditLine = creditLine;
	}
	
	//출금하다 오버라이딩
	//부모의 기능 : 잔액 = 잔액 - 출금액
	//자식의 기능 : 잔액(현재잔액 + 마이너스 한도) - 출금액
	@Override
	int withdraw(int amount) {
		// 현재잔액+마이너스한도 필드보다 사용금액이 많으면 인출불가 메세지를 출력, 0을 리턴
		if (getBalance()+creditLine < amount) {
			System.out.println("사용금액 한도 초과");
			return 0;
		}
		// 잔액(현재잔액 + 마이너스 한도) - 출금액
		setBalance(getBalance()-amount);
		
		return getBalance();
	}
	
	
	
}
