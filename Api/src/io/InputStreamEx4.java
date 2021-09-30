package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx4 {
	public static void main(String[] args) {
		InputStream in = System.in;
		OutputStream out = System.out;

		byte[] datas = new byte[100];

		// ����ڷκ��� �̸��� �ϰ� ���� ���� �Է¹��� �Ŀ�
		// String ��ü�� ��ȯ

		System.out.print("�̸� : ");
		try {
			int nameBytes = in.read(datas);
			// int java.io.InputStream.read(byte[] b) throws IOException
			// read�� ������ int Ÿ������ �޴´�.
			// read�� �޴� �� IOException�� ���� �޾ƾ� �Ѵ�.
			String name = new String(datas, 0, nameBytes - 2);// ���Ͱ��� ���� ���� -2�� ��
			// Enter : carriage return : 13, line feed :10 => ACSII�ڵ� 2byte�� ����
			// name�� String ��ü�� �ȴ�.
			System.out.print("�ϰ� ���� �� : ");
			int commentByte = in.read(datas);
			String commnet = new String(datas, 0, commentByte - 2);

			System.out.println("�Է��� �̸� : " + name);
			System.out.println("�Է��� �ϰ� ���� �� :" + commnet);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		
		
		
	}
}
