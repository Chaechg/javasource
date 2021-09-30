package string;

public class StringObject {
	public static void main(String[] args) {
		
	//축약 방법
	String str1 = "안녕하세요";
	
	//정식방법
	String str2 = new String("안녕하세요");
	//코딩에서 주로 문자를 쓰기 때문에 축약방법이 통하도록 허용.
	
	char[] value = {'a','b','c','d','e'};
	//String str3 = new String(char[] value);
	String str3 = new String(value);
	System.out.println(value);
	}	
}
