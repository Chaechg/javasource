package classTest;

public class TV {
	TV tv; 
	//�Ӽ�
	String color;
	boolean power;
	int channel;
	
	//������
	TV(){
		//default(�⺻) ������
		//��������� �����ڰ� �ϳ��� ������� �ʾҴٸ� �����Ϸ��� �ڵ����� ����
	}
	TV(String color, int channel){
		this.color = color;     //this�� �� ��ü�� ������ �Ӽ��� �ǹ��Ѵ�.
		this.channel = channel; //�������� �Ķ��ۿ� �־���.
	}
	
	
	//����
	void power(){
	};
	
	void channelUp() {
		channel++;
	};
	
	void channelDown() {
		channel--;
	};
	
}
	
