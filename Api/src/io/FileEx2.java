package io;

import java.io.File;

public class FileEx2 {
	public static void main(String[] args) {
		File file = new File("c:\\temp\\InputStreamEX1.java");
		
		//���� �̸� 
		String fileName = file.getName();
		//��(.)�� ��ġ - Ȯ����
		int pos = fileName.lastIndexOf(".");
		
		System.out.println("���ϸ� : "+fileName);
		//Ȯ���� ���� ���� ���ϸ�
		System.out.println("Ȯ���ڸ� ������ ���ϸ� : "+fileName.substring(0, pos));
		//substring (a,b) => a-������ġ, b-���� ��ġ)
		//Ȯ���� �̸���
		System.out.println("Ȯ���� : "+fileName.substring(pos+1));
		//��α��� ����
		System.out.println("��θ� ������ ���ϸ� : "+file.getPath());
		//������ ���� �ִ� ����
		System.out.println("������ ���� �ִ� ������ : "+file.getParent());
		//���丮 ���� - ������� \�� �����Ѵ�.
		System.out.println("File.separator : "+File.separator);
		//�����Ǵ� �ĺ��� - ������� ;
		System.out.println("File.pathseparator : "+File.pathSeparator);
		
		
		
	}
}	
