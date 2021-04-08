package com.ict07.IO;

import java.io.*;

public class Ex13 {
	//DataOutputStream �� DataInputStream
	//�⺻ �ڷ����� �ְ� ���� �� ���(�⺻ �ڷ����� �а� ���� �޼ҵ尡 ������ ����)
	//FileInputStream, FileOutputStream�� �ٸ� ���� ���� �����͸� ������� �� ���(Ÿ �ý��۰� ������� �� ����)
	//** �Է� ������ ��¼��� �� �ٸ��� �������� ����� �޶��� �� �ִ�.
	//BufferedInputStream, BufferedOutputStream�� Ȱ�� ����
	public static void main(String[] args) {
		String pathname = "C:"+File.separator+"study"+File.separator
				+"util"+File.separator+"ict03.txt";
		
		File file = new File(pathname);
		
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		DataOutputStream dos = null;
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			dos = new DataOutputStream(bos);
			
			//���� �޼ҵ� : writeXXX(XXX == �⺻ �ڷ���)
			dos.writeLong(126L);
			dos.writeBoolean(true);
			dos.writeFloat(3.14f);
			dos.writeInt(256);
			dos.writeDouble(235.41);
			dos.writeChar('A');
			dos.flush();
			
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
			
			//�д� �޼ҵ� : readXXX(��)
			//���� ������� �������� �� ����. 0, 1 �� �̷�����Ŷ� �׷� ��¿ �̤� ����
			System.out.println(dis.readLong());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readFloat());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
		} catch (Exception e) {

		}finally {
			try {
				dos.close();
				bos.close();
				fos.close();
				dis.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {

			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
