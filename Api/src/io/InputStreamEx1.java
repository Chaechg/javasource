package io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx1 {
	public static void main(String[] args) {
		//InputStrea�� �߻�Ŭ����
		InputStream in = System.in; 
		//System.in : Ű���� �Է��� �ǹ��Ѵ�.
		int input=0;
		
//		try {
//			int input = in.read();  //read�� 1�� ���ڸ� ���� �� �ִ�.
//			System.out.println((char)input); //charŸ������ 97=>a ����ȯ
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		try {
			while ((input = in.read())!=-1) { //-1�� ��� ������ �����ٴ� �ǹ��ΰ�?
				System.out.print((char)input);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		//�ѱ��� 1 byte�����δ� ǥ������ ���Ѵ�. 2~3 byte�� �ʿ��ϴ�.
		
		
	}
}
