package com.ict04.exception;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// throws (���� �絵, ����)
		Ex05 test = new Ex05();
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("���� �Է� : ");
		String msg = sc.next();
		test.setData(msg);
		} catch (Exception e) {
			System.out.println("ù ���ڴ� ���ڷ� ����");
		}
		
	}
	public void setData(String msg) {
		if(msg.length()>=1) {//���� ���̰� �ϳ� �̻� �� �� ����
			String str = msg.substring(0, 1);//ù���ڸ� ����
			prnData(str);
		}
	}
	public void prnData(String str) throws NumberFormatException {
		int dan = Integer.parseInt(str);
		System.out.println(dan + "��");
		for (int i = 0; i < 10; i++) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
		}
	}
}
