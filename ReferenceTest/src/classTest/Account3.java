package classTest;

public class Account3 {
	// 속성 : 계좌번호(122-01-12222), 잔액(정수),이름
	//기본생성자
	// 기능 : 입금한다(입력값 : 입금액, 반환값 : 없음) => 현재잔액 += 입금액
	//      출금한다. (입력값 : 출금액, 반환값 : 현재잔액) => 현재잔액 -=출금액
	
	// 속성
	private String accountNo;
	private int balance;
	private String name;
	
	
	//기본생성자만들기 //constructor = 생성자
	//마우스 오른쪽 >> Soruce >> Generate Constructor from superclass...
	public Account3() {
		super();
	}
	//생성자 만들기
	//마우스 오른쪽 >> Soruce >> Generate Constructor using Fields....
	public Account3(String accountNo, int balance, String name) {
		//super(); 
//		this.accountNo = accountNo;
//		this.name = name;
		this(accountNo,name); //this() : 다른 생성자 호출
							  // super를 막으면 사용할 수 있다. 
							  // 대개 자동으로 완성되는 생성자를 사용한다.
		this.balance = balance;
		
	}
	public Account3(String accountNo, String name) {
		super();
		this.accountNo = accountNo;
		this.name = name;
	}
	//기능
	void deposit (int amount ) {
		balance += amount;
	}
	int withdraw (int amount) {
		if (balance > amount) {
			balance -= amount;
		}
		return balance;
	}
	
	//외부로부터 값을 받아서 멤버변수의 값을 변경하는 작업시
	// set~ 으로 메소드를 작성한다.
	
	//멤버변수 : 계좌번호를 변경하고 싶다면, 메소드를 어떻게 만들 것인가?
	// set + ctrl + space  또는
	// 마우스 오른쪽 >> source >> generate getters and setters...
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	// 멤버변수인 이름을 변경하고 싶다면?
	public void setName(String name) {
		this.name = name;
	}
	
	//잔액 변경
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// 멤버 변수의 값을 리턴하고 싶다면?
	// get~~ + ctrl + space
	// 현재 잔액 리턴
	public int getBalance() {
		return balance;
	}
	
	
	
}
