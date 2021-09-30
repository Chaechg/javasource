package collection;

import java.util.LinkedList;
import java.util.List;

/* ArrayList vs LinkedList
 * - 순차적으로 추가/삭제 시  ArrayList가 좀 더 빠름
 * - 중간 데이터를 추가/삭제 시 LinkedList가 좀 더 빠름
 * ArrayList는 연속된 공간을 사용, LinkedList는 주소를 연결해 넣음
 */
public class ListEx4 {
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		
		//추가
		list.add("사과");
		list.add("배");
		list.add("복숭아");
		list.add("딸기");
		list.add("수박");
		list.add("바나나");
		
		System.out.println(list);
	}
}
