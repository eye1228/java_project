package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex09 {
// c:\\study\\util\\test100.txt ���� �ȿ�
		/*
		 * �̸� : ---
		 * ���� : --
		 * ��ȭ��ȣ : 000-0000-0000
		 * �ۼ��ϴ� �ڵ�
		 */
	public static void main(String[] args) {
		String pathname = "C:"+File.separator+"study"+File.separator
				+"util"+File.separator+"test100.txt";
		
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			
			String msg = "�̸� : ������\n���� : 27\n��ȭ��ȣ : 010-5096-4105";
			
			byte[] b = msg.getBytes();
			fos.write(b);
			fos.flush();
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		

	}

}
