package classTest;

public class MethodTestEx2 {
	public static void main(String[] args) {
		MethodTest2 obj = new MethodTest2();
		
		//구구단 출력 기능
		obj.print99dan();
		
		//덧셈 기능
		//메소드를 호출하는 쪽에서 입력값을 넣어주기
		obj.sum(11, 15);
		// obj.sum(11.5, 15.5); 정수형이 아닌 것을 입력하면 오류가 난다.
		
		byte b1=3;
		byte b2=5;
		obj.sum(b1, b2); //obj.sum(3,5)와 같은 의미이다.
		// byte로 선언된 것을 int로 담았다. 
		//	int = byte 형변환 - 자동형변환
		//형변환  (1)자동형변환 -Promotion 작은 타입을 큰 타입에 대입
		//	   (2)강제형변환 -Casting   큰 타입을 작은 타입에 대입
		//		int =(int)float - 강제형변환	
		
		
		
	}
}
