package io;

import java.io.File;

public class FileEx2 {
	public static void main(String[] args) {
		File file = new File("c:\\temp\\InputStreamEX1.java");
		
		//파일 이름 
		String fileName = file.getName();
		//점(.)의 위치 - 확장자
		int pos = fileName.lastIndexOf(".");
		
		System.out.println("파일명 : "+fileName);
		//확장자 없이 순수 파일명
		System.out.println("확장자를 제외한 파일명 : "+fileName.substring(0, pos));
		//substring (a,b) => a-시작위치, b-점의 위치)
		//확장자 이름만
		System.out.println("확장자 : "+fileName.substring(pos+1));
		//경로까지 포함
		System.out.println("경로를 포함한 파일명 : "+file.getPath());
		//파일이 속해 있는 폴더
		System.out.println("파일이 속해 있는 폴더명 : "+file.getParent());
		//디렉토리 구분 - 윈도우는 \로 구분한다.
		System.out.println("File.separator : "+File.separator);
		//구별되는 식별자 - 윈도우는 ;
		System.out.println("File.pathseparator : "+File.pathSeparator);
		
		
		
	}
}	
