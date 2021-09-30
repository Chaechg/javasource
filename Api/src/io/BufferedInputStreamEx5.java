package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputStreamEx5 {
	public static void main(String[] args) {
		
		//버퍼의 성능 테스트를 진행 
		
		//FileInputStream만 사용하는 경우 + byte 배열
		//FileOutputStream
		try(FileInputStream fis = new FileInputStream("c:\\temp\\Rolling.mp3");
				FileOutputStream fos = new FileOutputStream("c:\\temp\\Rolling_copy4.mp3")) {
			
			byte data[] = new byte[1024];
			
			long start = System.currentTimeMillis();
			while(fis.read(data) != -1) {
				fos.write(data);
			}
			long end = System.currentTimeMillis();
			System.out.println("FileInputStream + byte + FileOutputStream 사용시 " + (end-start));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//FileInputStream + BufferedInputStream 사용하는 경우 + byte 배열
		//FileOutputStream + BufferedOutputStream
		try (FileInputStream fis = new FileInputStream("c:\\temp\\Rolling.mp3");
			BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream("c:\\temp\\Rolling_copy5.mp3");
			BufferedOutputStream bos = new BufferedOutputStream(fos)){
			
			byte data[] = new byte[1024];
			
			long start = System.currentTimeMillis();
			while(bis.read(data) != -1) {
				bos.write(data);
			}
			bos.flush();
			long end = System.currentTimeMillis();
			System.out.println("FileInputStream + BufferedInputStream + byte 사용시 " + (end-start));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
