package string;

public class CharAt {
	public static void main(String[] args) {
		String str1 = "자바 프로그래밍";

		char ch = str1.charAt(3); // index이기 때문에, 0번부터 순서대로 3번째에 있는 문자 출력(공백포함)
		System.out.println(ch);

		System.out.println();

		// str1에 '그'라는 문자가 있는지 확인하고 들어있다면
		// 포함하고 있음, 없다면 포함하고 있지 않음이라고 출력
		boolean flag = false;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == '그') {
				flag = true;
				break;
			}
		}
		System.out.println(flag ? "포함하고 있음" : "포함하고 있지 않음");

		String str2 = "Hello java!!";

		// str2를 char 배열에 담고 그 배열을 출력
		// char 배열 선언

//		for (int i = 0; i < str2.length(); i++) {
//			System.out.print(str2.charAt(i));
//		}  이 조건만 쓰면 배열에 담기지 않는다.
		char chArr2[] = new char[str2.length()]; // String 문자열의 길이를 불러줌 .length()

		for (int i = 0; i < str2.length(); i++) {
			chArr2[i] = str2.charAt(i);
			// System.out.print(str2.charAt(i));
		}
		for (char ch1 : chArr2) {
			System.out.printf("%c ", ch1);
		}

	}
}
