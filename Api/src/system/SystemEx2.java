package system;

public class SystemEx2 {
	public static void main(String[] args) {
		long sum = 0;
		
		long start = System.currentTimeMillis(); // 1/1000 초 //시작시간
		
		for (int i = 1; i < 10000000; i++) {
			sum+=i;
		}
		long end = System.currentTimeMillis(); // 끝난 시간
		System.out.println("1 ~ 10,000,000 걸린 시간 "+(end-start)+"/1000 초");
		System.out.println("1 ~ 10,000,000 합 "+(sum));
	}
}
