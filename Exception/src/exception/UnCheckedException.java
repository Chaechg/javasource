package exception;

public class UnCheckedException {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try { //try - 예외가 발생할 수 있는 구문
			data1 = args[0];
			data2 = args[1];
		} catch (Exception e) { 
			//catch - 예외가 발생하면 어떻게 처리할 것인지 작성
			System.out.println("실행 매개 변수 수가 부족합니다.");
		}

	}

}
