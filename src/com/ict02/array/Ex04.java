package com.ict02.array;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� ���ϱ�
		//1. ��� ����� ������ 1������ �ʱ�ȭ
		//2. ��� ������ ���ؾ� �Ѵ�. �ڱ��ڽ� �� �ʿ� x
		//3. ������ ���� ũ�� �� ������ ����
		
		
		int[] su = {270, 265, 280, 290, 285};
		int[] rank = {1,1,1,1,1};
		
		for(int i = 0 ; i < su.length; i++)
		{
			for(int j=0;j<su.length;j++)
			{
				if(su[i] < su[j] && i != j) {
					rank[i]++;
				}
			}
		}
		for(int i = 0 ; i < rank.length; i++)
		{
			System.out.println(rank[i]);
		}
	}

}
