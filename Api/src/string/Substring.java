package string;

public class Substring {

	public static void main(String[] args) {
		String ssn = "880512-1220146";
		
		//문자열 잘라내기
		System.out.println(ssn.substring(7)); //-까지 잘라냄
		System.out.println(ssn.substring(0,6)); //0~5를 제거. 6은 포함되지 않음
		
	}

}
