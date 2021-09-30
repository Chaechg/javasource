package io;

import java.io.FileReader;
import java.io.Reader;

/* ó���� ������ "����"��� Reader, Writer�� ���� 
 * char ���·� ó��	
 */

public class FileReaderEx2 {
	public static void main(String[] args) {
		try (Reader reader = new FileReader("c:\\temp\\file1.txt") //byte������ �ƴ�, single character�� �о�´�.
				){
			
			char[] cbuf = new char[100];  //�迭 ���� =>100���� �о��
			
			int readcharNo; //������ �о�� ������ ����
			
			while ((readcharNo=reader.read(cbuf)) != -1) {//FileInputStream�� ����
				String data = new String(cbuf, 0, readcharNo); //String ���·� ��ȯ ����
				System.out.println(data);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
}
