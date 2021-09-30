package collection;

import java.util.Set;
import java.util.TreeSet;

public class SetEx4 {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		//Set의 개념과 같다. 중복된 것은 담지 않는 것은 같으나, 정렬되어서 나온다.

		while (set.size() < 6) {
			int lotto = (int) (Math.random() * 45) + 1;
			set.add(lotto);
		}
		System.out.println(set);
		
		
		
		
	}
}
