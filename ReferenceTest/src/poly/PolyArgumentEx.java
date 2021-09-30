package poly;

public class PolyArgumentEx {
	public static void main(String[] args) {
		
		Buyer buyer = new Buyer();
		
		//Tv tv = new Tv(100);
		
		//다형성
		//오른쪽 자식
		buyer.buy(new Tv(100));
		buyer.buy(new Computer(150));
		buyer.buy(new Audio(50));
		
		System.out.println("현재 남은 돈은 "+buyer.money);
		System.out.println("현재 보너스 포인트는 "+buyer.bonusPoint);
	}
}
