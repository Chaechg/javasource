package string;

public class IndexOf {
	public static void main(String[] args) {
		String str1 = "�ڹ� ���α׷���";
		
		// ���� : �Ű������� �־��� ���ڿ��� ���۵Ǵ� ��ġ�� ����
		int index = str1.indexOf("���α׷���");
		System.out.println(index);
		
		//ã���� ã�� ��ġ��, ��ã���� -1�� ����Ѵ�.
		System.out.println("��ã�� ��� "+str1.indexOf("���̽�"));
		
		System.out.println();
		
		String str2 = "HelloHelloHello World";
		System.out.println(str2.indexOf(65));  //65�� A�̴�. �ƽ�Ű�ڵ�
		System.out.println(str2.indexOf('f'));  
		System.out.println(str2.indexOf("el",2));  
		
		//lastIndexOf : ���� �ڿ� �ִ� l�� ã���ش�. 
		System.out.println("l ã��:"+str2.lastIndexOf("l"));
		
		
		//�װ� ����ִ��� Ȯ�� - ��
		if (str1.indexOf('��') > -1 ) {
			System.out.println("�����ϰ� ����");
		}else {
			System.out.println("�����ϰ� ���� ����");
		}
		//if~else�� ���׿����ڷ� ��ȯ ����
		
		//�װ� ����ִ��� Ȯ�� - �����
		System.out.println(str1.indexOf("��") > -1?"�����ϰ� ����":"�����ϰ� ���� ����");
		
	}
}
