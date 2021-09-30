package shop;

//인터페이스 = 완전추상화 => 상수필드, 추상메서드만 가질 수 있다.
// jdk 8 version => dafault, static을 가질 수 있기는 함

public interface Ishop {
	void setTitle(String title);	//public abstract가 생략된 것이다. 
	void genUser();
	void genProduct();
	void start();
}
