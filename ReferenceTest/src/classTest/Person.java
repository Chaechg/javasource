package classTest;

//final : 수정불가
//사용되는 곳 : 클래스, 메서드, 멤버변수, 지역변수에 붙여 사용할 수 있다.
//클래스에 final이 붙으면 - 상속 불가의 의미를 가진다.
//메소드에 final이 붙으면 - 오버라이딩 불가
//멤버변수, 지역변수에 final이 붙으면 - 수정 불가의 의미이다.

public class Person {
	final String nation = "Korea";
	final String ssn; 	// 초기화 하지 않아 ssn에 에러가 남
						// The blank final field ssn may not have been initialized
						// 생성자 - 멤버변수의 초기화가 목적이다.
	String name;
	
	public Person(String ssn, String name) {
		super();
		this.ssn = ssn;		//생성자를 통해 초기화하면 에러가 사라진다. 
		this.name = name;
	}
						
	
	
	
}
