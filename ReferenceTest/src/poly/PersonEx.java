package poly;

public class PersonEx {
	public static void main(String[] args) {
		Person p = new Person("홍길동", "서울", 35);
		System.out.println(p);
		System.out.println(p.toString());
		//toString을 오버라이딩 하기 전에는 주소값이 나오다가,
		//오버라이딩 후에는 Person이 표시됨.
		//오버라이딩을 통해 클래스의 멤버변수를 표시할 수 있다.
		
		
	}
}
