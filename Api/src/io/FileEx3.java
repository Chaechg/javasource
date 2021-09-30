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
		
		//���� ����
		if (!temp.exists()) { //!temp.exists() => temp��� ������ �������� ������
			temp.mkdir();		//���� ������ ����
		}
		if (!dir.exists()) {
			dir.mkdir();
		}
		
		//���� ����
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
		
		//���� ���� ���
		System.out.println("\t��¥\t�ð�\t����\tũ��\t�̸�");
		System.out.println("------------------------------------------------------");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		File contents[] = temp.listFiles();//listFiles()-����Ʈ ���, File[]���·� ����
		for (File f : contents) {
			//long access = f.lastModified();
			//Date date = new Date(access);
			//String formatDate = sdf.format(date);
			//syso(formatDate());  �� ���� ������ ����ؼ� ���ٷ� ǥ���� ���̴�.
			
			System.out.print(sdf.format(new Date(f.lastModified())));
			//last~�� longŸ������ ���� => Date�� �޴´�.=> sdf���� ������ ���·� ���
			if (f.isDirectory()) {
				System.out.print("\t<DIR>\t\t"+f.getName()); //������� <DIR>+�̸��� ���
			}else {
				System.out.print("\t\t"+f.length()+"\t"+f.getName()); //������ �ƴ϶�� ũ��� �̸��� ���
			}
			System.out.println();
		}
		
		//���Ͽ� ���ų�, ���� ������ �о���� ���� InputStream, OutputStream�� �����;� �Ѵ�.
		
		
		
		
		
		
	}
}
