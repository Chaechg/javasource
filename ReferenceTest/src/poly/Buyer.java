package poly;

public class Buyer {
	int money =2000;
	int bonusPoint = 0;
	
//	void buy(Tv tv) {
//	}
//	void buy(Computer computer) {
//	}
//	void buy(Audio audio) {
//	}
	
	//다형성  - 부모로 오버로딩 없이 해결 가능
	//왼쪽 부모
	void buy (Product p) {
		//toString이 오버라이딩 되었기 때문에, 자식이 가르키는 toString을 실행한다.
		if (money < p.getPrice()) {
			System.out.println("잔액 부족으로 인해 물건 구매 실패");
			return;  //void이기 때문에 그냥 return 가능
		}
		money -= p.getPrice();
		bonusPoint += p.getBounsPoint();
		System.out.println(p+"을 구입하셨습니다."); 	//toString이 오버라이딩 되었기 때문에, 자식이 가르키는 toString을 실행한다.
												// 그래서 p는 Product를 호출하지 않는다.
	}
	
}
