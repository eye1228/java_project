package com.ict07.IO;

import java.io.File;
import java.text.SimpleDateFormat;

public class Ex02 {
	public static void main(String[] args) {	
		String pathname_1 = "C:\\study\\util"; //�ü�� windows�� ��
		String pathname_2 = "C:/study/util";//�ü�� Linux�� ��
		
		//�ü�� ������� ���
		String pathname_3 = "C:" + File.separator + "study" + File.separator + "util";
		
		File file = new File(pathname_3);
		String[] arr = file.list();
		
		//��¥ ���ϱ�. ��¥���� ����. ���� �����̴ϱ� ���� for�� �ȿ� �ȳ־�� �׷��� ��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		
		
		for(String k : arr) {
			//System.out.println(k);
			File file2 = new File(pathname_3, k);
			//System.out.println(file2);
			//��ǻ�Ϳ� ������ �� �ִ� ������ ���丮, ���� ��
			
			
			if(file2.isDirectory()) {
				System.out.println("���丮 : " + file2 + " ũ��� �������� ����" + 
									"���� �� ������ ��¥ : " + sdf.format(file2.lastModified()));
			}else {
				System.out.println("���� : " + file2 + " ũ�� : " + (int)(file2.length() / 1024) + "KB" + 
									"���� �� ������ ��¥ : " + sdf.format(file2.lastModified()));
			}
		}
	}
		
}


