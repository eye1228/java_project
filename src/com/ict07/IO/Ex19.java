package com.ict07.IO;

import java.io.*;
import java.util.*;

public class Ex19 {

	public static void main(String[] args) {
		//���� ��ҿ� ���ϸ��� �ް� ���̱� ��ҿ� ���ϸ��� �޾Ƽ� ���̱� ����.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ ������ ��� : ");
		String copy_path = sc.next();
		System.out.print("������ ������ �̸� : ");
		String copy_file = sc.next();
		
		System.out.print("������ ������ ���� ��� : ");
		String paste_path = sc.next();
		System.out.print("������ ������ ���� �̸� : ");
		String paste_file = sc.next();
		
		
		File c_file = new File(copy_path + "\\" + copy_file);
		File p_file = new File(paste_path + "\\" + paste_file);
		
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		
		try {
			//�б�
			fr = new FileReader(c_file);
			br = new BufferedReader(fr);
			
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while((msg = br.readLine()) != null) {
				sb.append(msg + "\n");
			}
			//����
			fw = new FileWriter(p_file);
			bw = new BufferedWriter(fw);
			
			//bw.write(sb.toString());
			String str = sb.toString();
			str.replace("���ѹα�", "��������");
			bw.write(sb.toString());
			
			bw.flush();
		} catch (Exception e) {
			
		}finally {
			try {
				bw.close();
				fw.close();
				br.close();
				fr.close();
			} catch (Exception e2) {
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
