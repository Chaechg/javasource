package classTest;

public class AccountEx3 {
	public static void main(String[] args) {
		// Account3 ��ü�� 5�� �����ϰ� �ʹ�.
//		
//		Account3 account1 = new Account3("122-12", 25000, "ȫ�浿");
//		Account3 account2 = new Account3("122-13", 26000, "��浿");
//		Account3 account3 = new Account3("122-14", 27000, "��浿");
//		Account3 account4 = new Account3("122-15", 28000, "�ֱ浿");
//		Account3 account5 = new Account3("122-16", 29000, "�̱浿");
		
		//������ Ÿ������ ��ü ������ ȿ������ �����Ѵٸ�?
		//�迭
		Account3 accArr[] = new Account3[5];
		System.out.println(accArr[0]); //null => �޸𸮿� ������ �����
		
		//Ÿ�� - 1)�⺻Ÿ�� 2)����Ÿ��
		//����Ÿ�� : null�� �ʱ�ȭ�� �ȴ�.
		//-�迭, Ŭ����, 
		//Ŭ���� => ��Ī�� �빮�ڷ� ����
		// �⺻Ÿ�� �迭�� �ҹ���������, Ŭ���� �迭�� �빮�ڷ� �����Ѵ�. Arr
		
		// int a,b,c,d,e,.... => int arr[]=new int[0]; �ʱⰪ�� ����.
		// double arr[] = new double[5]; arr[0] => 0.0
		// arr[0] print => 0
		
		accArr[0] = new Account3("122-12", 25000, "ȫ�浿");
		accArr[1] = new Account3("122-13", 26000, "��浿");
		accArr[2] = new Account3("122-14", 27000, "��浿");
		accArr[3] = new Account3("122-15", 28000, "�ֱ浿");
		accArr[4] = new Account3("122-16", 29000, "�̱浿");
	
		
		
		
	}
}
