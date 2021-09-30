package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysEx4 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple","사과","lemon");
		//list.add("수박");	//UnsupportedOperationException
							//asList()의 단점 =>List의 크기를 변경할 수 없음
		System.out.println(list);
		
		List<String> list1 = new ArrayList<String>();
		list1.add("apple");
		list1.add("사과");
		list1.add("lemon");
		//asList가 훨씬 더 간단하다.
		
		//asList의 단점을 커버하기 위해 위 두 방식을 합친다. 괄호안에 asList를 넣어준다.
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		list2.add(6);
		System.out.println(list2);
		
		// java.util.Arrays.asList(Integer... a) => ...은 괄호안에 넣을 수 있는 제한이 없음을 의미
	}
}
