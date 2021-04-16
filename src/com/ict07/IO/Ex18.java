package com.ict07.IO;

import java.io.*;

public class Ex18 {
	//BufferedReader : �ӵ� ����� ���ؼ� ���. ���� ���д� �޼ҵ尡 ����
	//
	public static void main(String[] args) {
		String pathname = "C:"+File.separator+"study"+File.separator
				+"util"+File.separator+"ict06.txt";
		
		
		File file = new File(pathname);
		
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			//�ѱ��� �б�
			/*int k = br.read();
			System.out.println((char)(k));*/
			
			//��ü �б�
			/*int k = 0;
			while((k = br.read()) != -1) {
				System.out.print((char)(k));
			}*/
			
			//char[] �̿�
			/*char[] c = new char[(int)file.length()];
			br.read(c);
			for(char k : c) {
				System.out.print(k);
			}*/
			
			//String �̿�
			/*char[] c = new char[(int)file.length()];
			br.read(c);
			String str = new String(c);
			System.out.println(str);*/
			
			//���� �б�
			/*String msg = br.readLine();
			System.out.println(msg);*/
			
			//��� �б�
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while((msg = br.readLine()) != null) {
				sb.append(msg + "\n");
			}
			System.out.println(sb.toString());
		} catch (Exception e) {
			
		}finally {
			try {
				fr.close();
				br.close();
			} catch (Exception e2) {
				
			}
		}
	}
}
