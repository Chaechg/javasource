package string;

public class StringBuilderTest2 {
	public static void main(String[] args) {
		String str1 = "hello java!!!";
		
		//String 형태로 두고 거꾸로 출력
		//chArr.length가 가지고 있는 글자수는 13개이나, 배열은 0~12까지 지정되기 때문에 -1을 함
		char [] chArr = str1.toCharArray(); //캐릭터 배열로 돌려줌
		for (int i = chArr.length-1; i >=0; i--) {
			System.out.print(chArr[i]+" ");
		}
		
		System.out.println();
		
		//StringBuilder 거꾸로 출력
		StringBuilder builder = new StringBuilder(str1);
		System.out.println(builder.reverse());
	}
}
