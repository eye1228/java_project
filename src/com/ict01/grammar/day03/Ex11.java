package com.ict01.grammar.day03;

class Ex11{
	public static void main(String[] args) {
		//int k1�� ������ 90 �̻��̸� A 80�̻��̸� B, 70�̻��̸� C �������� F
		int k1 = 81;
		String res = "";
		if(k1 >= 90)
			res = "A";
		else if(k1 >= 80)
			res = "B";
		else if(k1 >= 70)
			res = "C";
		else
			res = "F";
		System.out.println("��� : " + res);
		//char k2�� �빮������ �ҹ������� �������� ��Ÿ�������� �Ǻ�
		char k2 = '*';
		if(k2 >= 'A' && k2 <= 'Z')
			res = "�빮��";
		else if(k2 >= 'a' && k2 <= 'z')
			res = "�ҹ���";
		else if(k2 >= '0' && k2 <= '9')
			res = "����";
		else 
			res = "��Ÿ����";
		System.out.println("��� : " + res);	
		

		char k3 = 'd';

		if(k3 == 'A' || k3 == 'a')
			res = "������ī";		
		else if(k3 == 'B' || k3 == 'b')
			res = "�����";	
		else if(k3 == 'C' || k3 == 'c')
			res = "ĳ����";	
		else
			res = "�ѱ�";
		System.out.println("��� : " + res);	

		//menu�� 1�̸� ī���ī 3500., 2�� ī����� 4000 3�̸� �Ƹ޸�ī�� 3000, 4�� �����꽺 3500
		//ģ���� 2���� 10000���� �Ծ���. �ܵ���? (�ΰ��� 10% ����)
		
		int menu = 1;
		//int f2 = 3;
		int pay = 0;
		if( menu == 1)
			pay += 3500 / 10 * 11 * 2;
		else if(menu == 2)
			pay += 4000 / 10 * 11 * 2;
		else if(menu == 3)
			pay += 3000 / 10 * 11 * 2;
		else
			pay += 3500 / 10 * 11 * 2;

		
		
		
		System.out.println("��� : " + (10000 - pay));	
		
		
		


	}



}