package object;

public class ObjectEx1 {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		//equals(주소비교) => false
		System.out.println(obj1.equals(obj2));
		//heap의 서로 다른 영역에 다른 주소값으로 올라가기 때문에 false가 나온다.
		
		// String이 사용하는 equals는 오버라이딩이 되었음을 알 수 있다.
		// 주소값 비교가 아닌 결과를 비교
		String str1 = "홍길동";
		String str2 = "홍길동";
		System.out.println(str1.equals(str2));
		
		//Object가 넘겨주는 equal를 이용하면 false가 나타난다.
		Value value1 = new Value(10);
		Value value2 = new Value(10);
		System.out.println(value1.equals(value2)); //결과 값이 false에서 true로 바뀐 것을 확인
		
		
	}
}
