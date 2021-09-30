package interfaceTest;

/* 1) ��� �ʵ常 ����
 * 2) �߻� �޼ҵ常 ����. ��, static/default�޼���� �Ϲ� �޼��尡 ���� �� �ִ�. ��, �ٵ� ������.
 *  
 * 
 */
public interface AdderInterface {

	// private int x;
	// interface field AdderInterface.x; only public, static & final are permitted
	public static final int X = 100;

	// Abstract methods do not specify a body
	// �ٵ� ���� �� ����.
//	void method1() {}
	void method1();
	
	//�ڹ� 1.8���� 
	// static�޼ҵ�� default�޼ҵ尡 ���� �� ����
	static void method2() {
		
	}
	default void method3() {
		
	}

}
