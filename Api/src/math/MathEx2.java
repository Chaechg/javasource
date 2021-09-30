package math;

public class MathEx2 {
	public static void main(String[] args) {
		Math.random();	//0<= Math.random() <1
		
		//세 개의 랜덤값을 구하기 (1 ~ 3 까지 나오도록)
		//똑같은 수를 내 놓으면 반복문을 멈춘다.
		
		while (true) {
			int num1 = (int)(Math.random()*3)+1;
			int num2 = (int)(Math.random()*3)+1;
			int num3 = (int)(Math.random()*3)+1;
			
			System.out.printf("%d\t%d\t%d\n",num1,num2,num3);
			
			if (num1==num2 && num1==num3) {
				break;
			}
		}
		
		
		
		
	}	
}
