package com.ict07.IO;

import java.io.*;
//�̰ǰ� 12���ΰ� ���� �������ߴµ� ����� �ȳ�
public class Ex11 {
	// c:\\study\\util\\java_1.png ������ 
	// c:\\study\\util\\res�ȿ� �����ϴ� �ڵ�
	public static void main(String[] args) {
		//�д� ��ġ
		String pathname1 = "C:"+File.separator+"study"+File.separator
				+"util"+File.separator+"java_1.png";
	
		File read_file = new File(pathname1);
		
		//���� ��ġ
		String pathname2 = "C:"+File.separator+"study"+File.separator
				+"util"+File.separator+"res"+File.separator+"java_1.png";
	
		File wirte_file = new File(pathname2);
		
		
		//���� �о ����
		//inputStream
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		//OutputStream
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream(read_file);
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream(wirte_file);
			bos = new BufferedOutputStream(fos);
			
			//�׸�, �Ҹ�, ������ ���ϵ��� ó���� ���� ������ 1byte�� ó���ؾߴ�
			int k = 0;
			//1byte �б�
			while((k = bis.read()) != -1) {
				//1byte ����
				bos.write(k);
			}
			bos.flush();
			
		} catch (Exception e) {
			
		}finally {
			try {
				bos.close();
				fos.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
				
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
}
