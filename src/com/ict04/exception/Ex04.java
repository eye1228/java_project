package com.ict04.exception;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//finally
		//try ~ catch ~ finally
		Scanner sc = new Scanner(System.in);
		
		try {
			int var = 27;
			System.out.print("���� �Է� : ");
			int su = sc.nextInt();
			System.out.println("���� : " + (var/su));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("����� �Է�" + e);
			return;
		}finally {
			System.out.println("�ݵ�� ���� �Ǿ���");
		}
		//System.out.println("����");
		
		
		
	}

}
