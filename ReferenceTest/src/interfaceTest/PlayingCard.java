package interfaceTest;

public interface PlayingCard {
	int SPADE = 4;  //public static final ���� ����
	final int DIAMOND = 3;
	static int HEART =2 ;
	// �� ��� ����� �ν��Ѵ�.
	
	public abstract String getCardNumber();
	String getCardKind (); //public abstract ���� ����
	
			
}
