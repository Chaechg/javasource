package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx4 {
	public static void main(String[] args) {
		InputStream in = System.in;
		OutputStream out = System.out;

		byte[] datas = new byte[100];

		// 사용자로부터 이름과 하고 싶은 말을 입력받은 후에
		// String 객체로 변환

		System.out.print("이름 : ");
		try {
			int nameBytes = in.read(datas);
			// int java.io.InputStream.read(byte[] b) throws IOException
			// read를 받으면 int 타입으로 받는다.
			// read를 받는 게 IOException을 같이 받아야 한다.
			String name = new String(datas, 0, nameBytes - 2);// 엔터값을 빼기 위해 -2를 함
			// Enter : carriage return : 13, line feed :10 => ACSII코드 2byte를 가짐
			// name은 String 객체가 된다.
			System.out.print("하고 싶은 말 : ");
			int commentByte = in.read(datas);
			String commnet = new String(datas, 0, commentByte - 2);

			System.out.println("입력한 이름 : " + name);
			System.out.println("입력한 하고 싶은 말 :" + commnet);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		
		
		
	}
}
