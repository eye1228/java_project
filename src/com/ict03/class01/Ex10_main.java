package com.ict03.class01;

import java.util.Iterator;
import java.util.Scanner;

public class Ex10_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Ex10[] arr = new Ex10[4];
		
		int p_count = 0;
		int price = 0;
		System.out.print("����� ���� �Է� >>> ");
		p_count = sc.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("1. �Ƹ޸�ī��(2500");
			System.out.println("2. ī���ī(3000");
			System.out.println("3. ī���(3500");
			System.out.println("4. �ڸ��꽺(3000");
			System.out.print("�����ϼ��� >>>");
			
			Ex10 product = new Ex10();
			
			int drink = sc.nextInt();
			if(drink == 1) {
				product.setName("�Ƹ޸�ī��");
				product.setPrice(2500);				
			}else if(drink == 2) {
				product.setName("ī���ī");
				product.setPrice(3000);				
			}else if(drink == 3) {
				product.setName("ī���");
				product.setPrice(3500);				
			}else if(drink == 4) {
				product.setName("�ڸ��꽺");
				product.setPrice(3000);				
			}
			
			arr[i] = product;
		}
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			sum = sum + arr[i].getPrice();
		}
		System.out.println("�Ѿ� : " + sum);
		System.out.print("�� �� �� ");
		int input = sc.nextInt();
		System.out.println("�� �� : " + (input - sum));
		
		
		
		
		
	}	

}
