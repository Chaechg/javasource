package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputStreamEx1 {
	public static void main(String[] args) {
		
//		try {
//			InputStream in = new FileInputStream("c:\\temp\\test1.txt");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} finally {
//			in.close(); //in이 try블럭안에서 선언되었기 때문에 인식못함 =>in을 밖으로 보냄
//		}
		InputStream in=null;
		OutputStream out = System.out;
		
		byte[] datas = new byte[100];
		try {
			in = new FileInputStream("c:\\temp\\file1.txt");//실제 파일을 불러옴.
			
			while (in.read(datas)!=-1) {
				out.write(datas);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
				out.close(); //연 통로를 닫음
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
		
		
		
		
	}
}
