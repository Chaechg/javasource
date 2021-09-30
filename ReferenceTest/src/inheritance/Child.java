package inheritance;

//클래스 이름 + extends + 부모클래스명
// 생성자와 초기화 블럭은 상속되지 않음
// private 멤버변수는 접근이 제한됨
// 상속의 개념 보다는 확장의 개념이 상속의 더 정확한 개념이다.

public class Child extends Parent {
//Implicit super constructor Parent() is undefined for default constructor. 
//Must define an explicit constructor
	
//	public Child () {
//		super(); //Parent의 기본 생성자 호출
//	}
	
	public Child(int age) {
		super(age);  //Parent의 int를 받는 생성자 호출
	}
	
	
	void play() {
		System.out.println("놀자!!!");
	}
	
	@Override //print + ctrl+ space > overriding parent
		public void print() {
			System.out.println("Hello");
		}
}
