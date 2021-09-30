package stringtokenizer;

import java.util.StringTokenizer;

public class Token1 {
	public static void main(String[] args) {
		String text = "ȫ�浿/������/�ڿ���/�̼�ȫ"; // /�� ���еǴ� �̸��� ��ū�̴�.(text,/)
		
		String[] names = text.split("/");
		for (String s : names) {
			System.out.println(s);
		}
		
		System.out.println();
		
		String text1 = "ȫ�浿 ������ �ڿ��� �̼�ȫ"; 
		names = text1.split(" "); //�������� �ڸ��� �͵� �����ϴ�.
		for (String s : names) {
			System.out.println(s);
		}
		
		System.out.println();
		
		StringTokenizer st = new StringTokenizer(text,"/"); //��ü�� ����
		while (st.hasMoreTokens()) { //��ū�� ������ �ִٸ� 
			System.out.println(st.nextToken()); //���� ��ū�� �����Ͷ�
		}
		
		
		
		
		
		
		
	}
}
