package inheritance;

public class TV2 {
	TV2 tv; 
	//�Ӽ�
	private String color;
	private boolean power;
	private int channel;
	
	//������
//	public TV2() {
//		super();
//	}
	public TV2(TV2 tv, String color, boolean power, int channel) {
		super();
		this.tv = tv;
		this.color = color;
		this.power = power;
		this.channel = channel;
	}

	//����
	void power(){
	};
	
	void channelUp() {
		channel++;
	};
	void channelDown() {
		channel--;
	}

	public TV2 getTv() {
		return tv;
	}

	public String getColor() {
		return color;
	}

	public boolean isPower() {
		return power;
	}

	public int getChannel() {
		return channel;
	};
	
	
	
}
	
