package io;

import java.io.File;

/* File
 * ������ �ٷ�� ���� Ŭ���� 
 * ����(���丮) : /, \�� ǥ���� �ü���� ���� �ٸ���.
 * 
 * \�� escape ���ڷ� �ν��Ѵ�.=> \t, \n, \b...
 * �׷��� \\�� 2���� ����.
 */

public class FileEx1 {
	public static void main(String[] args) {
		File file1 = new File("c:\\temp\\test1.txt"); //��ü �����ÿ��� ������ ��� ������ ���� �ʴ´�.
		File file2 = new File("c:\\temp","test1.txt"); //String parent-String child
		
		File file3 = new File("C:\\temp");
		File file4 = new File(file3,"test.text"); //File parent - String child
		//File file4 = new File(new File("c:\\temp"),"test1.txt");); ���� ���� �ǹ��̴�.
		
		
		
		
		
		
		
		
		
	}
}
