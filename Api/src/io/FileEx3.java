package io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx3 {
	public static void main(String[] args) {
		File temp = new File("c:\\temp");
		File dir = new File("c:\\temp\\dir");
		File file1 = new File("c:\\temp\\file1.txt");
		File file2 = new File("c:\\temp\\file2.txt");
		File file3 = new File(temp,"file3.txt");
		File file4 = new File("c:\\temp\\dir\\file4.txt");
		
		//폴더 생성
		if (!temp.exists()) { //!temp.exists() => temp라는 폴더가 존재하지 않으면
			temp.mkdir();		//실제 폴더를 생성
		}
		if (!dir.exists()) {
			dir.mkdir();
		}
		
		//파일 생성
		try {
			if (!file1.exists()) {
				file1.createNewFile();
			}
			if (!file2.exists()) {
				file2.createNewFile();
			}
			if (!file3.exists()) {
				file3.createNewFile();
			}
			if (!file4.exists()) {
				file4.createNewFile();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//파일 정보 출력
		System.out.println("\t날짜\t시간\t형태\t크기\t이름");
		System.out.println("------------------------------------------------------");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		File contents[] = temp.listFiles();//listFiles()-리스트 출력, File[]형태로 리턴
		for (File f : contents) {
			//long access = f.lastModified();
			//Date date = new Date(access);
			//String formatDate = sdf.format(date);
			//syso(formatDate());  이 같은 과정을 축약해서 한줄로 표현한 것이다.
			
			System.out.print(sdf.format(new Date(f.lastModified())));
			//last~는 long타입으로 리턴 => Date를 받는다.=> sdf에서 지정한 형태로 출력
			if (f.isDirectory()) {
				System.out.print("\t<DIR>\t\t"+f.getName()); //폴더라면 <DIR>+이름을 출력
			}else {
				System.out.print("\t\t"+f.length()+"\t"+f.getName()); //폴더가 아니라면 크기와 이름을 출력
			}
			System.out.println();
		}
		
		//파일에 쓰거나, 파일 내용을 읽어오는 것은 InputStream, OutputStream을 가져와야 한다.
		
		
		
		
		
		
	}
}
