package com.ict07.IO;

import java.io.*;
import java.util.ArrayList;
public class Ex25_Input {

	public static void main(String[] args) {
		String pathname = "C:"+File.separator+"study"+File.separator
				+"util" + File.separator + "ict09.ser";
		
		File file = new File(pathname);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			ArrayList<Ex25_VO> list = (ArrayList<Ex25_VO>)ois.readObject();
			
			/*System.out.println("�̸�\t����\t���\t����");
			for (Ex25_VO k : list) {
				System.out.print(k.getName() + "\t");
				System.out.print(k.getSum() + "\t");
				System.out.print(k.getAvg() + "\t");
				System.out.println(k.getHak());
			}*/
			
			
			//���� ���� ����غ���.
			Ex25_VO[] arr = (Ex25_VO[]) list.toArray(new Ex25_VO[0]);
			Ex25_VO tmp = new Ex25_VO();//�ӽ�����
			for (int i = 0; i < arr.length - 1; i++) {
				for(int j = i + 1; j < arr.length; j++) {
					if(arr[i].getSum() < arr[j].getSum()) {
						tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}
			}		
			for (Ex25_VO k : arr) {
				System.out.print(k.getName() + "\t");
				System.out.print(k.getSum() + "\t");
				System.out.print(k.getAvg() + "\t");
				System.out.println(k.getHak());
			}
			
		} catch (Exception e) {
		}finally {
			try {
				ois.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
			}
		}
	}

}
