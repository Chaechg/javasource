package classTest;

public class TvEx {
	public static void main(String[] args) {
		//��ü ����, ����
		TV tv1 = new TV("black",8); 
		//2��° �����ڷ� �Ѱ��ش�. 
		//black�� color��, 8�� channel�� �޴´�.
		
		
//		TV tv1 = new TV("black",8);
//		tv1.color="black"
//		tv1.channel = 8;
		//�̷� ������δ� ���� �ʴ´�. ���� �ǹ��̱�� �ϴ�
		
		TV tv2 = new TV();
		tv2.color="white";
		
		//��ü����
		System.out.println("ä�� ���� : "+tv1.channel);
		System.out.println("ä�� ���� : "+tv2.channel);
		
		
		
		
	}

}
