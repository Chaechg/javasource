package inheritance;

/* 상속
 * 기존의 클래스를 재살용하여 새로운 클래스를 작성
 * 
 * 적은 양의 코드로 새로운 코드를 작성할 수 있음
 * 공통적으로 관리하기 때문에 코드의 추가 및 변경이 용이함
 * 코드의 중복 제거 => 프로그램 생산성이 높아지고, 유지보수 용이
 * 
 * 조상 클래스 : 부모, 상위, super
 * 자손 클래스 : 자식, 하위, sub
 */
public class Parent {
	private int age;

	public Parent(int age) {
		super(); //부모클래스(object)의 기본 생성자 호출한다는 의미이다.
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void print() {
		System.out.println("안녕하세요");
	}
	
	
}
