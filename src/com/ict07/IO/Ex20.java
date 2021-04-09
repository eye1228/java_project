package com.ict07.IO;

import java.io.*;
import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// ����Ʈ - ���� ���� : ü�� ���
		// �Է� : InputStreamReader : InputStream -> Reader
		//		 InputStream -> InputStreamReader -> Reader -> BufferedReader
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϴ� ���� �Է� : ");
		String msg = sc.next();
		
		System.out.println("���� ���� : " + msg);*/

		
		//���� ���� ���α׷�
		System.out.print("���ϴ� ���� �Է� : ");
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			
			String msg = br.readLine();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				isr.close();
			} catch (Exception e2) {
			}
		}
		
		
		
		
		
	}

}
