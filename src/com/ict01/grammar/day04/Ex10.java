package com.ict01.grammar.day04;

import java.util.Scanner;
class Ex10 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		esc1:
		while(true){
			System.out.print("���� �Է� : ");
			int k = sc.nextInt();
			String msg = "";
			if(k % 2 == 0){
				msg = "¦��";
			}
			else
				msg = "Ȧ��";

			System.out.println(k + "�� " + msg + " �Դϴ�.");
			while(true) {
				System.out.print("����ұ��? (1. yes 2. no) >>> ");
				int k2 = sc.nextInt();
				if(k2 == 1) 
					break;
				else if(k2 ==2) 
					break esc1;
				else 
					System.out.println("�ٽ� �Է� ���ֽʽÿ�.(1. yes 2. no) >>>");
			}
		}
		System.out.println("���� while�� ��");
	}
}
