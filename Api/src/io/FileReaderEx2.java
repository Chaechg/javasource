package io;

import java.io.FileReader;
import java.io.Reader;

/* 처리할 파일이 "문자"라면 Reader, Writer가 편함 
 * char 형태로 처리	
 */

public class FileReaderEx2 {
	public static void main(String[] args) {
		try (Reader reader = new FileReader("c:\\temp\\file1.txt") //byte단위가 아닌, single character로 읽어온다.
				){
			
			char[] cbuf = new char[100];  //배열 선언 =>100개씩 읽어옮
			
			int readcharNo; //실제로 읽어온 문자의 갯수
			
			while ((readcharNo=reader.read(cbuf)) != -1) {//FileInputStream과 동일
				String data = new String(cbuf, 0, readcharNo); //String 형태로 전환 가능
				System.out.println(data);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
}
