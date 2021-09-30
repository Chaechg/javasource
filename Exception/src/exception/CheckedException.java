package exception;

public class CheckedException {
	public static void main(String[] args)  {
		//ClassNotFoundException
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//빨간줄 -컴파일의 오류를 알려줌
		//1)첫번째 해결 - 클래스 옆에 throws ClassNotFoundException라고 써짐
		//2)두번째 해결 - try/catch
	}
}
