package inheritance;

public class DmbCellPhone extends CellPhone {
	int channel;
	
	void trunOnDmb() {
		System.out.println("ä�� "+channel+" �� dmb ��� ����");
	}
	void trunOffDmb() {
		System.out.println("ä�� "+channel+" �� dmb ��� ����");
	}
	void changeChannelDmb() {
		System.out.println("ä�� "+channel+" �� ����");
	}
}
