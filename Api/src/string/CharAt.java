package string;

public class CharAt {
	public static void main(String[] args) {
		String str1 = "�ڹ� ���α׷���";

		char ch = str1.charAt(3); // index�̱� ������, 0������ ������� 3��°�� �ִ� ���� ���(��������)
		System.out.println(ch);

		System.out.println();

		// str1�� '��'��� ���ڰ� �ִ��� Ȯ���ϰ� ����ִٸ�
		// �����ϰ� ����, ���ٸ� �����ϰ� ���� �����̶�� ���
		boolean flag = false;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == '��') {
				flag = true;
				break;
			}
		}
		System.out.println(flag ? "�����ϰ� ����" : "�����ϰ� ���� ����");

		String str2 = "Hello java!!";

		// str2�� char �迭�� ��� �� �迭�� ���
		// char �迭 ����

//		for (int i = 0; i < str2.length(); i++) {
//			System.out.print(str2.charAt(i));
//		}  �� ���Ǹ� ���� �迭�� ����� �ʴ´�.
		char chArr2[] = new char[str2.length()]; // String ���ڿ��� ���̸� �ҷ��� .length()

		for (int i = 0; i < str2.length(); i++) {
			chArr2[i] = str2.charAt(i);
			// System.out.print(str2.charAt(i));
		}
		for (char ch1 : chArr2) {
			System.out.printf("%c ", ch1);
		}

	}
}
