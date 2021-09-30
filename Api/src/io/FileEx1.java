package io;

import java.io.File;

/* File
 * 파일을 다루기 위한 클래스 
 * 폴더(디렉토리) : /, \의 표현은 운영체제에 따라 다르다.
 * 
 * \는 escape 문자로 인식한다.=> \t, \n, \b...
 * 그래서 \\로 2개를 쓴다.
 */

public class FileEx1 {
	public static void main(String[] args) {
		File file1 = new File("c:\\temp\\test1.txt"); //객체 생성시에는 파일이 없어도 에러가 나지 않는다.
		File file2 = new File("c:\\temp","test1.txt"); //String parent-String child
		
		File file3 = new File("C:\\temp");
		File file4 = new File(file3,"test.text"); //File parent - String child
		//File file4 = new File(new File("c:\\temp"),"test1.txt");); 위와 같은 의미이다.
		
		
		
		
		
		
		
		
		
	}
}
