package inheritance;

public class BonusPointAccount extends Account2 {
	//계좌번호, 계좌주, 잔액, 보너스포인트
	//입금하다(보너스포인트 추가), 출금하다
	//입금을 하면서 보너스 포인트를 추가	
	private int bonusPoint;
	
	public BonusPointAccount(String accountNo, int balance, 
			String name,int bonusPoint) {
		super(accountNo, balance, name);
		this.bonusPoint = bonusPoint;
	}
	@Override
	void deposit(int amount) {
		// 예금하다 
		super.deposit(amount);
		//setBalance(getBalance()+amount); //부모가 가지고 있다.
		
		//보너스포인트 += 예금액의 0.1%를 보너스 포인트 추가
		bonusPoint += amount*0.001;
	}
	
	public int getBonusPoint() {
		return bonusPoint;
	}
	
	
}
