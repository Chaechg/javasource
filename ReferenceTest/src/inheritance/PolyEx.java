package inheritance;

public class PolyEx {
	public static void main(String[] args) {
		
		Parent2 p2 = new Child3();
		//Parent2의 필드와 메서드만 카르킬 수 있다.
		p2.field="";
		p2.method1();
		p2.method2();  //오버라이딩 된 상태라면 자식 클래스의 메소드가 실행
		
		//method3 실행? 
		Child3 c = (Child3) p2; //업캐스팅
		c.method3();
		
		//java.lang.ClassCastException
//		Parent2 obj = new Parent2();
//		Child3 c2 = (Child3) obj;// Exception 출력 => runtime error 17번 라인 이상
//		c2.method3(); //실제 메모리에 올라간 것은 Parent2이기 때문에, 에러가 난다.
		// 작은 걸 가리키는 obj가 큰 것 c2를 지정할 수 없다.
		
		
				
		
	}
}
