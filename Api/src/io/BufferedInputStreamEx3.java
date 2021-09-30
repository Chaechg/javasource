package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputStreamEx3 {
	public static void main(String[] args) {
		
		//버퍼의 성능 테스트를 진행 
		
		//FileInputStream만 사용하는 경우
		try(FileInputStream fis = new FileInputStream("c:\\temp\\picture.jpg")) {
			long start = System.currentTimeMillis();
			while(fis.read() != -1) { }
			long end = System.currentTimeMillis();
			System.out.println("FileInputStream만 사용시 " + (end-start));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//FileInputStream + BufferedInputStream 사용하는 경우
		try (FileInputStream fis = new FileInputStream("c:\\temp\\picture.jpg");
				BufferedInputStream bis = new BufferedInputStream(fis)){
			long start = System.currentTimeMillis();
			while(bis.read() != -1) { }
			long end = System.currentTimeMillis();
			System.out.println("FileInputStream+BufferedInputStream 사용시 " + (end-start));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
