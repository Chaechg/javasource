package system;

public class SystemEx2 {
	public static void main(String[] args) {
		long sum = 0;
		
		long start = System.currentTimeMillis(); // 1/1000 �� //���۽ð�
		
		for (int i = 1; i < 10000000; i++) {
			sum+=i;
		}
		long end = System.currentTimeMillis(); // ���� �ð�
		System.out.println("1 ~ 10,000,000 �ɸ� �ð� "+(end-start)+"/1000 ��");
		System.out.println("1 ~ 10,000,000 �� "+(sum));
	}
}
