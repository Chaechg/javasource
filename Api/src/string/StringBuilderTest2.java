package string;

public class StringBuilderTest2 {
	public static void main(String[] args) {
		String str1 = "hello java!!!";
		
		//String ���·� �ΰ� �Ųٷ� ���
		//chArr.length�� ������ �ִ� ���ڼ��� 13���̳�, �迭�� 0~12���� �����Ǳ� ������ -1�� ��
		char [] chArr = str1.toCharArray(); //ĳ���� �迭�� ������
		for (int i = chArr.length-1; i >=0; i--) {
			System.out.print(chArr[i]+" ");
		}
		
		System.out.println();
		
		//StringBuilder �Ųٷ� ���
		StringBuilder builder = new StringBuilder(str1);
		System.out.println(builder.reverse());
	}
}
