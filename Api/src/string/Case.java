package string;

public class Case {
	public static void main(String[] args) {
		//��ҹ��� ����
		String str1 = "Java programming";
		String str2 = "JAVA PROGRAMMING";
		
		System.out.println(str1.equals(str2)); //=>false
		//��ҹ��� �������� ���� ���ϱ�
		System.out.println(str1.equalsIgnoreCase(str2)); //=> true
		
		System.out.println(str1.toUpperCase());  //=> ��� �빮�ڷ�+
		System.out.println(str1); //������ �״���̴�. �����Ϸ��� ���� str1�� �ٽ� ��ƾ� �Ѵ�.
		System.out.println(str2.toLowerCase());  //=> ��� �ҹ��ڷ�
	}
}
