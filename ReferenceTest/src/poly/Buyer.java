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
	
	//������  - �θ�� �����ε� ���� �ذ� ����
	//���� �θ�
	void buy (Product p) {
		//toString�� �������̵� �Ǿ��� ������, �ڽ��� ����Ű�� toString�� �����Ѵ�.
		if (money < p.getPrice()) {
			System.out.println("�ܾ� �������� ���� ���� ���� ����");
			return;  //void�̱� ������ �׳� return ����
		}
		money -= p.getPrice();
		bonusPoint += p.getBounsPoint();
		System.out.println(p+"�� �����ϼ̽��ϴ�."); 	//toString�� �������̵� �Ǿ��� ������, �ڽ��� ����Ű�� toString�� �����Ѵ�.
												// �׷��� p�� Product�� ȣ������ �ʴ´�.
	}
	
}
