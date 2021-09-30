package classTest;

//메소드 오버로딩
//메소드 이름이 같아야 한다.
//매개 변수의 개수 또는 타입이 달라야 한다.(괄호 안의 내용)

public class Mymath2 {
	int add(int a, int b) {
		return a+b;
	}
	
//	long add(int a, int b) { //리턴타입이 달라도 괄호안 내용이 같으면 에러가 난다.
//		
//	}
	
	long add(long a, long b) { 
		return a+b;
	}
	
	long add(long a, int b) { 
		return a+b;
	}
	
	int add(int[] arr) {
		int result =0;
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		return result;
	}

	
	
}
