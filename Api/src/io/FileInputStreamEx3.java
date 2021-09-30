package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx3 {
	public static void main(String[] args) {
		// 그림파일 읽어오기
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream(new File("c:\\temp\\picture.jpg"));
			fos = new FileOutputStream("c:\\temp\\picture_copy.jpg");
			
			byte[] datas = new byte[1024];
			while (fis.read(datas) != -1) {
				fos.write(datas);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
}
