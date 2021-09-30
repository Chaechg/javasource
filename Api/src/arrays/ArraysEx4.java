package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysEx4 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple","���","lemon");
		//list.add("����");	//UnsupportedOperationException
							//asList()�� ���� =>List�� ũ�⸦ ������ �� ����
		System.out.println(list);
		
		List<String> list1 = new ArrayList<String>();
		list1.add("apple");
		list1.add("���");
		list1.add("lemon");
		//asList�� �ξ� �� �����ϴ�.
		
		//asList�� ������ Ŀ���ϱ� ���� �� �� ����� ��ģ��. ��ȣ�ȿ� asList�� �־��ش�.
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		list2.add(6);
		System.out.println(list2);
		
		// java.util.Arrays.asList(Integer... a) => ...�� ��ȣ�ȿ� ���� �� �ִ� ������ ������ �ǹ�
	}
}
