package interfaceTest;

public interface PlayingCard {
	int SPADE = 4;  //public static final 생략 가능
	final int DIAMOND = 3;
	static int HEART =2 ;
	// 위 모두 상수로 인식한다.
	
	public abstract String getCardNumber();
	String getCardKind (); //public abstract 생략 가능
	
			
}
