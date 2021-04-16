package com.ict08.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex01 {
	public static void main(String[] args) {
		/* InetAddress : �ڹٿ��� IP �ּҸ� ǥ���ϴ� Ŭ����
						 �����ڰ� ���������� ������� �ʴ´�.	
						 6���� static  �޼ҵ带 �̿�
			**localhost : ���� ���� ����ϰ� �ִ� ��ǻ�͸� ����
		*/
		
		
		InetAddress addr;
		try {
			addr = InetAddress.getByName("www.naver.com");
			System.out.println("�̸� : " + addr.getHostName());
			System.out.println("�ּ� : " + addr.getHostAddress());
			System.out.println("toString : " + addr.toString());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
	}
}
