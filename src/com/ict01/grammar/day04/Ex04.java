package com.ict01.grammar.day04;

class Ex04 
{
	public static void main(String[] args) 
	{
		int i = 0;
		//0-15 ���
		System.out.println("0-15 ���");
		while(i<16)
		{
			System.out.println(i++);
		}
		//0-10 Ȧ����
		System.out.println("0-10 Ȧ����");
		i = 0;
		while(i < 11)
		{
			if(i % 2 == 1)
			{
				System.out.println(i);
			}
			i++;
		}
		//0-10 ¦����
		System.out.println("0-10 ¦����");
		i = 0;
		while(i < 11)
		{
			if(i % 2 == 0)
			{
				System.out.println(i);
			}
			i++;
		}
		//0-50 7�� ���
		System.out.println("0-50 7�����");
		i = 0;
		while(i < 51)
		{
			if(i % 7 == 0)
			{
				System.out.println(i);
			}
			i++;
		}
		//5��
		System.out.println("5��");
		i = 1;
		while(i < 10)
		{
			System.out.println("5�� : " + (i * 5));
			i++;
		}
		//0000
		//0000
		//0000
		//0000
		System.out.println("0 16��");
		i = 0;
		while(true)
		{
			if(i>=4)
			{
				break;
			}
			System.out.println("0 0 0 0");
			i++;
		}
		//0-10 ���� ��
		System.out.println("0-10 ������");
		i = 0;
		int sum = 0;
		while(true)
		{
			if(i > 10)
			{
				break;
			}
			sum += i;
			i++;			
		}
		System.out.println(sum);
		//Ȧ�� ¦���� ������ ���� 0-10
		System.out.println("0-10 Ȧ¦ ������");
		i = 0;
		int sum_solo = 0;
		int sum_couple = 0;
		while(true)
		{
			if(i > 10)
			{
				break;
			}
			else if(i % 2 == 0)
			{
				sum_couple += i;
			}
			else{
				sum_solo += i;
			}
			i++;			
		}
		System.out.println("¦�� �� : " + sum_couple + "Ȧ�� �� : " + sum_solo);
	}
}
