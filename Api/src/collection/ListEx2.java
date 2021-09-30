package collection;

import java.util.ArrayList;
import java.util.Comparator;

public class ListEx2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(); //오른쪽의 E는 생략 가능하다.
		
		list.add("java");
		list.add("JDBC");
		list.add("Servlet");
		list.add("jsp");
		list.add("java");  //ArrayList는 중복이 가능하다.
		
		System.out.println(list);
		
		//추가
		list.add(2, "oracle");//oracle 추가
		System.out.println(list);
		
		//삭제
		list.remove(1); //JDBC 제거
		System.out.println(list);
		
		//정렬
		list.sort(Comparator.reverseOrder()); //알파벳 내림차순 정렬. naturalOrder() : 오름차순
		System.out.println(list);
		
		
	}
}
