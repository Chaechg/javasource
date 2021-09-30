package classTest;

public final class FinalTest { //클래스에 final
	final int MAX_SIZE = 10; //멤버변수에 final. 상수의 개념으로는 대문자를 쓴다.(암묵적인 약속)
	
	final void getMaxSize () {    // 메소드에 final
		final int LV = MAX_SIZE;  //지역 변수에 final
	}
}
