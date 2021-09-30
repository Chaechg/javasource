package interfaceTest;

public class PlayEx {
	public static void main(String[] args) {
		//Cannot instantiate the type PlayingCard
		//인터페이스는 객체 생성이 불가능 
		//PlayingCard = new PlayingCard(); 
		
		//상수는 부를 수 있으므로, 굳이 객체 생성할 필요가 없다.
		//PlayingCard.DIAMOND; 
		
		PlayingCard card = new Playing();
		//추상, 인터페이스의 부모클래스를 부를 수는 없어도, 자식 클래스는 부를 수 있다.
		card.getCardKind();
	}
}
