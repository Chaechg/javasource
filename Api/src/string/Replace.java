package string;

// String Ŭ������ Ư¡ => Immutable (�Һ�)

public class Replace {
	public static void main(String[] args) {
		String str1 = "�ڹٴ� ��ü���� ����Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";
		
		//�ڹ� =>Java
		
		System.out.println(str1);
		str1.replace("�ڹ�", "Java");
		System.out.println(str1); //������� ����
		// ó�� �����Ǵ� ���� �ٲ��� �ʴ���.
		// ������ ���� �ٽ� str1�� ��ƾ� �Ѵ�. 
		
		str1 = str1.replace("�ڹ�", "Java"); //������ �ִ� ���� ���ְ� �ٽ� ���� �ǹ��̴�.
		System.out.println(str1); 
		
		//replaceAll => ��� �ٲ�
		//replaceFirst => �տ��� �ٲ�
		
		String str2 = "�ڹٴ� ��ü���� ����Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";
		str2 = str2.replaceFirst("�ڹ�", "Java"); 
		System.out.println(str2); 
	}
}
