package classTest;

public class MyMathEx {
	public static void main(String[] args) {
		//static 메소드(클래스 메소드) 호출 => 객체 생성 없이 호출
		System.out.println(MyMath.add(200L, 100L));  //long type에는 숫자 끝에 L을 붙여야 한다.
		System.out.println(MyMath.subtract(200L, 100L));
		System.out.println(MyMath.multiply(200L, 100L));
		System.out.println(MyMath.divide(200L, 100L));
		
		System.out.println();
		
		//멤버메소드(non-static) 호출
		MyMath math = new MyMath();  //객체 생성 먼저 진행
		math.a = 200L;				//멤버 변수 사용 가능
		math.b = 100L;
		
		System.out.println(math.add());
		System.out.println(math.subtract());
		System.out.println(math.multiply());
		System.out.println(math.divide());
	
		
		
		
	}
}
