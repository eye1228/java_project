package com.ict07.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) {
		/* 1. FileInputStream; ������ ������� 1byte�� �����͸� �б⸦ �� �� �ִ� ��Ʈ��
			-������ : FileInputStream(File file), FileInputStream(String name)
				File file, String name => Ư�� ��ġ + ���� �̸�
			-�ֿ� �޼ҵ�
				read() : int -> ����� ����(�ƽ�Ű �ڵ�)�� ����
								char������ ����ȯ �ؾ� ���ڰ� ����
								�� �̻� ���� ���� ���� �� -1
								�� ����� ���ڴ� ���� �� ����.
				read(byte[] b) : int -> �迭�� ���� ���ڿ� ������ �迭 ũ�⸸ŭ ���ڸ� ���� �� �ִ�.
										(byte[] b�� ���� ���ڵ��� �迭 ũ�⸸ŭ ����ȴ�.)
				
				close : open �� 
		
		*/
		String pathname = "C:"+File.separator+"study"+File.separator
				+"util"+File.separator+"ict01.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			
			//�ѱ��� �о����
			//int k = fis.read();
			//System.out.println(k + " : " + (char)(k));
			
			//�ѱ��ھ� ��� �б� : �׸�, �Ҹ�, ������ ������ ������ �ش� ����� ���. �� ������� ���ڵ��� ���� �� ����.
			//int k = 0;
			/*while(fis.read() != -1) {
				k = fis.read();
				System.out.println(k + " : " + (char)(k));				
			}*/
			/*while((k = fis.read()) != -1) {
				System.out.println(k + " : " + (char)(k));
			}*/
			
			//�迭�� �̿��ϴ� ��� �� ����� ��� ����
			/*byte[] b = new byte[(int) file.length()];
			fis.read(b);
			for(byte k : b) {
				System.out.println(k + " : " + (char)(k));
			}*/
			//String�� �̿����� ���� �̿� ���� ����
			
			byte[] b = new byte[(int) file.length()];
			fis.read(b);
			String str = new String(b);
			System.out.println(str);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
