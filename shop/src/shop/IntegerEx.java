package shop;

import java.util.Scanner;

public class IntegerEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��� �ּ���");
		
		//5 => "5"
		String input = sc.next();
		System.out.println(input+5); // +�� ������ �ǹ�
		
		//"5"=>5
		int num = Integer.parseInt(input);
		//Integer.parseInt ���ڸ� ���ڷ� ����. ������ �ܿ� ��!!
		//����ڰ� ���� ���·� �Է����� ������ ������ �� �� �ִ�.
		System.out.println(num+5); 	//+�� ������ �ǹ�
	}
}
