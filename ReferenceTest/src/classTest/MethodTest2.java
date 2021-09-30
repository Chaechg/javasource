package classTest;

public class MethodTest2 {
	int sum2() {
		return 0;
		// add return statement
	}
	
	void sum3() {
		// change return type to 'void'
	}
	
	// 두 개의 숫자를 받아서 더한 결과를 보내주기
	// 두 개의 숫자(정수, 실수)를 받는다. - (입력값)
	// => 정수형의 2개의 숫자를 받는다- 좀 더 명확하게 구체적으로..
	int sum(int num1, int num2) { 	//2개의 정수를 받는다.
		int result = num1+num2;  	// 2개 정수를 더한다.
		return result;				// 결과를 보낸다. - (출력값, 반환값)	
		//return num1+num2			//이렇게 간략화 할 수 있다.
	}
	
	//구구단 2~9단 출력하기
	//입력값 : 없음, 반환값 : 없음 - void
	void print99dan() {
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10 ; j++) {
				System.out.printf("%d * %d = %d\n", i,j,i*j);
			}
		}
	}
	
	//두 개의 정수를 받아서(입력값) 곱하기한 결과를 리턴(반환값)하기
	int multiply (int x, int y) { //맨 앞의 int는 리턴할 타입을 결정
		return x * y;
	}
	
	
}
