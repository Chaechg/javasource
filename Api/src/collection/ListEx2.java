package collection;

import java.util.ArrayList;
import java.util.Comparator;

public class ListEx2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(); //�������� E�� ���� �����ϴ�.
		
		list.add("java");
		list.add("JDBC");
		list.add("Servlet");
		list.add("jsp");
		list.add("java");  //ArrayList�� �ߺ��� �����ϴ�.
		
		System.out.println(list);
		
		//�߰�
		list.add(2, "oracle");//oracle �߰�
		System.out.println(list);
		
		//����
		list.remove(1); //JDBC ����
		System.out.println(list);
		
		//����
		list.sort(Comparator.reverseOrder()); //���ĺ� �������� ����. naturalOrder() : ��������
		System.out.println(list);
		
		
	}
}
