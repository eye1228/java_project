package com.ict01.grammar.day03;

import java.util.Scanner;

class Ex07 { 
	public static void main(String[] args) {
	
	int k2 = 14;

	Scanner sc = new Scanner(System.in);
	
	System.out.print("����� �̸��� : ");
	
	System.out.println(sc.next());
	
	System.out.print("���� ���� : ");
	int kor = sc.nextInt();

	System.out.print("���� ���� : ");
	
	int eng = sc.nextInt();
	System.out.print("���� ���� : ");
	
	int math = sc.nextInt();
	
	int sum = kor + eng + math;
	System.out.print("���� : " + sum);
	
	System.out.print("Ű : ");
	
	double height = sc.nextDouble();
	System.out.println(height);
	System.out.print("������ ����?<true/false> : ");
	
	boolean sex = sc.nextBoolean();
	String str = sex ? "�����Դϴ�" : "�����Դϴ�";
	System.out.print(str);
	
	
	
	
	
	}

}