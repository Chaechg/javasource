package io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx1 {
	public static void main(String[] args) {
		//InputStrea은 추상클래스
		InputStream in = System.in; 
		//System.in : 키보드 입력을 의미한다.
		int input=0;
		
//		try {
//			int input = in.read();  //read는 1개 문자만 읽을 수 있다.
//			System.out.println((char)input); //char타입으로 97=>a 형변환
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		try {
			while ((input = in.read())!=-1) { //-1은 계속 루프를 돌린다는 의미인가?
				System.out.print((char)input);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		//한글은 1 byte만으로는 표현하지 못한다. 2~3 byte가 필요하다.
		
		
	}
}
