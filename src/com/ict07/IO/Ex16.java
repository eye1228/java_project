package com.ict07.IO;

import java.io.*;

public class Ex16 {
	//BuffereWrite : �ӵ� ����� ���ؼ� ���. �ٹٲٱ� �޼ҵ� ����
		public static void main(String[] args) {
			String pathname = "C:"+File.separator+"study"+File.separator
					+"util"+File.separator+"ict06.txt";
			
			File file = new File(pathname);
			FileWriter fw = null;
			BufferedWriter bw = null;
			try {
				fw = new FileWriter(file);
				bw = new BufferedWriter(fw);
				//�ѱ��� ����
				bw.write(97);
				bw.write(65);
				
							
				bw.write('J');
				bw.write('A');
				bw.write('V');
				bw.write('A');
				bw.write('��');			
				bw.write('��');			
				bw.write('J');
				bw.write('A');
				bw.write('V');
				bw.write('A');		
				bw.write('\n');		
				
				char[] c = {'k','o','r','e','a','=','��','��','��','��','\n'};
				
				bw.write(c);
				
				bw.write("�ù� ���� ������\n");
			} catch (Exception e) {
				
			}finally {
				try {
					bw.close();
					fw.close();
					
				} catch (Exception e2) {
					
				}
			}
		}
}
