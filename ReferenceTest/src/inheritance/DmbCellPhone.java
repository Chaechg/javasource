package inheritance;

public class DmbCellPhone extends CellPhone {
	int channel;
	
	void trunOnDmb() {
		System.out.println("채널 "+channel+" 번 dmb 방송 시작");
	}
	void trunOffDmb() {
		System.out.println("채널 "+channel+" 번 dmb 방송 종료");
	}
	void changeChannelDmb() {
		System.out.println("채널 "+channel+" 번 변경");
	}
}
