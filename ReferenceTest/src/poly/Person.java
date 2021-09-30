package poly;

public class Person {
	private String name;
	private String address;
	private int age;
	public Person(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public int getAge() {
		return age;
	}
//	@Override
//	public String toString() {
//		return "Person";
//	}
	
//	@Override
//	public String toString() { //toString은 멤버변수를 출력하는데 주로 쓴다.
//		return " name="+name+", address ="+address+", age = "+age;
//	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	// source > toString 오버라이드 생성이 가능하다.
	//오버라이딩은 source 메뉴에서도 다양한 형식으로 가능하다.
	
}
