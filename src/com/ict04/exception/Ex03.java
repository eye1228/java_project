package com.ict04.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		//���� catch��
		//
		
		Scanner sc = new Scanner(System.in);
		
		/*try {
			int var = 3;
			System.out.print("���� �Է� : ");
			int su = sc.nextInt();
			System.out.println("���� : " + (var/su));
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("���ڶ�� ���� �ù߾�");
		}catch(ArithmeticException e) {
			System.out.println("0���� �ȳ�����");
		}*/
		
		try {
			int var = 27;
			System.out.print("���� �Է� : ");
			int su = sc.nextInt();
			System.out.println("���� : " + (var/su));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("����� �Է�");
		}
		System.out.println("����");
	}

}
