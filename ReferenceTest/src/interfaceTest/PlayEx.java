package interfaceTest;

public class PlayEx {
	public static void main(String[] args) {
		//Cannot instantiate the type PlayingCard
		//�������̽��� ��ü ������ �Ұ��� 
		//PlayingCard = new PlayingCard(); 
		
		//����� �θ� �� �����Ƿ�, ���� ��ü ������ �ʿ䰡 ����.
		//PlayingCard.DIAMOND; 
		
		PlayingCard card = new Playing();
		//�߻�, �������̽��� �θ�Ŭ������ �θ� ���� ���, �ڽ� Ŭ������ �θ� �� �ִ�.
		card.getCardKind();
	}
}
