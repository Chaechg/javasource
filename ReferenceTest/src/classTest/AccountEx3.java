package classTest;

public class AccountEx3 {
	public static void main(String[] args) {
		// Account3 객체를 5개 생성하고 싶다.
//		
//		Account3 account1 = new Account3("122-12", 25000, "홍길동");
//		Account3 account2 = new Account3("122-13", 26000, "장길동");
//		Account3 account3 = new Account3("122-14", 27000, "김길동");
//		Account3 account4 = new Account3("122-15", 28000, "최길동");
//		Account3 account5 = new Account3("122-16", 29000, "이길동");
		
		//동일한 타입으로 객체 생성시 효율성을 적용한다면?
		//배열
		Account3 accArr[] = new Account3[5];
		System.out.println(accArr[0]); //null => 메모리에 공간만 잡아줌
		
		//타입 - 1)기본타입 2)참조타입
		//참조타입 : null로 초기화가 된다.
		//-배열, 클래스, 
		//클래스 => 명칭은 대문자로 시작
		// 기본타입 배열은 소문자이지만, 클래스 배열은 대문자로 시작한다. Arr
		
		// int a,b,c,d,e,.... => int arr[]=new int[0]; 초기값이 들어간다.
		// double arr[] = new double[5]; arr[0] => 0.0
		// arr[0] print => 0
		
		accArr[0] = new Account3("122-12", 25000, "홍길동");
		accArr[1] = new Account3("122-13", 26000, "장길동");
		accArr[2] = new Account3("122-14", 27000, "김길동");
		accArr[3] = new Account3("122-15", 28000, "최길동");
		accArr[4] = new Account3("122-16", 29000, "이길동");
	
		
		
		
	}
}
