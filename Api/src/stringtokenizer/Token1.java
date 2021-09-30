package stringtokenizer;

import java.util.StringTokenizer;

public class Token1 {
	public static void main(String[] args) {
		String text = "홍길동/성춘향/박연수/이수홍"; // /로 구분되는 이름이 토큰이다.(text,/)
		
		String[] names = text.split("/");
		for (String s : names) {
			System.out.println(s);
		}
		
		System.out.println();
		
		String text1 = "홍길동 성춘향 박연수 이수홍"; 
		names = text1.split(" "); //공백으로 자르는 것도 가능하다.
		for (String s : names) {
			System.out.println(s);
		}
		
		System.out.println();
		
		StringTokenizer st = new StringTokenizer(text,"/"); //객체만 생성
		while (st.hasMoreTokens()) { //토큰을 가지고 있다면 
			System.out.println(st.nextToken()); //다음 토큰을 가져와라
		}
		
		
		
		
		
		
		
	}
}
