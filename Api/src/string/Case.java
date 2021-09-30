package string;

public class Case {
	public static void main(String[] args) {
		//대소문자 변경
		String str1 = "Java programming";
		String str2 = "JAVA PROGRAMMING";
		
		System.out.println(str1.equals(str2)); //=>false
		//대소문자 구별하지 말고 비교하기
		System.out.println(str1.equalsIgnoreCase(str2)); //=> true
		
		System.out.println(str1.toUpperCase());  //=> 모두 대문자로+
		System.out.println(str1); //원본은 그대로이다. 변경하려면 변수 str1에 다시 담아야 한다.
		System.out.println(str2.toLowerCase());  //=> 모두 소문자로
	}
}
