package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderEx1 {
	public static void main(String[] args) {
		
		try(FileReader fr = new FileReader("c:\\temp\\file1.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("c:\\temp\\test5.txt");
			BufferedWriter bw = new BufferedWriter(fw)) {
			
			String line = "";
			
			while ((line = br.readLine()) != null) { //br.readLine() => 한 줄씩 읽어옴 
				bw.write(line);
				bw.newLine();  //엔터
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
