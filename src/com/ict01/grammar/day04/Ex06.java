package com.ict01.grammar.day04;

import java.lang.*;
import java.util.*;

class Ex06 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);


		int i = 0;
		do
		{
			System.out.print(i + " ");
			i++;
		}while (i < 11);
		System.out.println();

		//�ݺ�Ƚ�� �Է¹޾� ó���ϱ�
		System.out.print("�ݺ� Ƚ�� : ");
		i = sc.nextInt();
		do
		{
			System.out.print(i + " ");
			i--;
		}while (i > 0);
		System.out.println();
	
		//�ݺ� Ƚ���� �Ϲ� ���ڸ� �޾Ƽ� Ȧ��, ¦���� ���.
		System.out.print("Ƚ���� �Է��Ͻÿ� : ");
		i = sc.nextInt();
		int num;
		do
		{
			System.out.print("���ڸ� �Է��Ͻÿ� : ");
			num = sc.nextInt();
			if(num % 2 == 0){
				System.out.println(num + "�� ¦�� �Դϴ�.");
			}
			else
				System.out.println(num + "�� Ȧ�� �Դϴ�.");
			i--;
		}while (i > 0);
		System.out.println();






















	}
		

}
