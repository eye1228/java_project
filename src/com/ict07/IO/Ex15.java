package com.ict07.IO;

import java.io.*;

public class Ex15 {
	//���� ��Ʈ��(��� �߽�) : ��� ó���� 2byte�� ó��
	//��� : �� ���� ��� ���� ������ ���� ���ϵ�
	//�ֻ��� Ŭ���� : Reader(�Է�), Writer(���) .....?
	
	//FileOutputStream(����Ʈ)	: 1byte ó��, write(int b), wirte(byte[] b) 
	//FileWriter(����)			: 2byte ó��, write(int b), write(char[] b), write(String str)
	public static void main(String[] args) {
		String pathname = "C:"+File.separator+"study"+File.separator
				+"util"+File.separator+"ict05.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			
			
			//�ѱ��� ����
			fw.write(97);
			fw.write(65);
						
			fw.write('J');
			fw.write('A');
			fw.write('V');
			fw.write('A');
			fw.write('��');			
			fw.write('��');			
			fw.write('J');
			fw.write('A');
			fw.write('V');
			fw.write('A');		
			fw.write('\n');		
			
			char[] c = {'k','o','r','e','a','=','��','��','��','��','\n'};
			
			fw.write(c);
			
			fw.write("�ù� ���� ������\n");
		} catch (Exception e) {
			
		}finally {
			try {
				fw.close();
			} catch (Exception e2) {
				
			}
		}
	}

}
