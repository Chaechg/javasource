package classTest;

public class MyMath {
	//멤버 변수 long 변수 2개
	long a,b;
	
	//메소드 : add,subtract,multiply,divide
	//     : 입력값 없음, 변환값은 연산 결과
	
	long add() { 
		return a+b;
	}
	long subtract() { 
		return a-b;
	}
	long multiply() { 
		return a*b;
	}
	double divide() { 
		return a/b;
	}
	
	
	static long add(long a, long b) { 
		//Cannot make a static reference to the non-static field a
		//괄호 안에 a,b가 지정되지 않으면 에러가 난다.
		//멤버 변수로 지정된 a,b를 쓸 수 없기 때문이다. => a,b의 색이 다르다.
		return a+b;
	}
	static long subtract(long a, long b) { 
		return a-b;
	}
	static long multiply(long a, long b) { 
		return a*b;
	}
	static double divide(double a, double b) { 
		return a/b;
	}
	

}
