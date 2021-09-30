package io;

import java.io.File;
import java.io.FileWriter;

public class FileWriterEx1 {
	public static void main(String[] args) {
		try(FileWriter writer = new FileWriter(new File("c:\\temp\\test2.txt"),true)) {
			//true는 boolean append개념이다.
			
			writer.write("FileWriter는 문자열을 바로 \r\n"); //\r\n은 엔터와 같다.
			writer.write("출력할 수 있다.\r\n");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
