package interfaceTest;

/* 1) 상수 필드만 가짐
 * 2) 추상 메소드만 가짐. 단, static/default메서드는 일반 메서드가 들어올 수 있다. 즉, 바디를 가진다.
 *  
 * 
 */
public interface AdderInterface {

	// private int x;
	// interface field AdderInterface.x; only public, static & final are permitted
	public static final int X = 100;

	// Abstract methods do not specify a body
	// 바디를 가질 수 없다.
//	void method1() {}
	void method1();
	
	//자바 1.8부터 
	// static메소드와 default메소드가 들어올 수 있음
	static void method2() {
		
	}
	default void method3() {
		
	}

}
