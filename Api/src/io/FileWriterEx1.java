package io;

import java.io.File;
import java.io.FileWriter;

public class FileWriterEx1 {
	public static void main(String[] args) {
		try(FileWriter writer = new FileWriter(new File("c:\\temp\\test2.txt"),true)) {
			//true�� boolean append�����̴�.
			
			writer.write("FileWriter�� ���ڿ��� �ٷ� \r\n"); //\r\n�� ���Ϳ� ����.
			writer.write("����� �� �ִ�.\r\n");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
