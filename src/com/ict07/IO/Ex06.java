package com.ict07.IO;

import java.io.*;

public class Ex06 {
	public static void main(String[] args) {
		
		//�ӵ������ ���ؼ� BufferOutputStream�� ���
		//ȥ�ڼ��� ����� �� ����, �ݵ�� OutputStream�� �޾Ƽ� ���
		//�ļ��� : BufferedOutputStream(OutputStream out)
		
		
		String pathname = "C:"+File.separator+"study"+File.separator
				+"util"+File.separator+"ict02.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			
			bos.write(65);
			bos.write(97);
			
			bos.write('j');
			bos.write('a');
			bos.write('v');
			bos.write('a');
			
			bos.write(13);
			
			byte[] b = {'H', 'i', 'J', 'A', 'V', 'A', 13};
			bos.write(b);
			
			String str = "Hell\r�ȳ�\r123\r����";
			byte[] b2 =str.getBytes();
			bos.write(b2);
			
			bos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
