package com.ict01.grammar.day04;

class  Ex02
{
	public static void main(String[] args) 
	{
		//�ȳ��ϼ��� 10�� ���


		for(int i=0;i<10;i++)
		{
			System.out.println("�ȳ��ϼ���." + (i + 1));
		}

		for (int i = 0;i < 16 ;i++ )
		{
			System.out.print(i + " ");
		}
		System.out.println();

		//0~10 ¦�� ���
		System.out.print("0~10 ¦�� ��� : "); 
		for (int i = 0;i <= 10 ;i++ )
		{
			if(i % 2 == 0)
				System.out.print(i + " ");
		}
		System.out.println();


		//0~10 Ȧ�� ���
		System.out.print("0~10 Ȧ�� ��� : "); 
		for (int i = 0;i <= 10 ;i++ )
		{
			if(i % 2 != 0)
				System.out.print(i + " ");
		}
		System.out.println();
		//0~50 7�� ��� ���
		System.out.print("0~50 7�� ��� ��� : "); 
		for (int i = 1;i <= 50 ;i++ )
		{
			if(i % 7 == 0)
				System.out.print(i + " ");
		}
		System.out.println();

		//5�� ���
		System.out.print("������ 5�� ��� : "); 
		for (int i = 1;i < 10 ;i++ )
		{			
			System.out.print(i * 5 + " ");
		}

		//Ȧ���� �����հ� ¦���� �������� ���� ���Ͻÿ�
		int sum_couple = 0;
		for (int i = 1; i < 11 ;i++ )
		{
			if(i%2==0)
			{
				sum_couple += i;
			}
		}
		int sum_solo = 0;
		for (int i = 1; i < 11 ;i++ )
		{
			if(i%2==1)
			{
				sum_solo += i;
			}
		}




	}
}
