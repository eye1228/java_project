package com.ict03.class01;

public class Ex02_main {

	public static void main(String[] args) {
		// 1. Ex02 Ŭ���� ������ ���� X ���� �⺻ �����ڷ� ��ü ����
		//Ŭ���� �������� = new ������;
		
		//void�� ������ �Ѿ���� �ʴ´�.
		//void�� �ƴϸ� ��ȯ���� ���缭 ����
		System.out.println(Ex02.K2);
		System.out.println(Ex02.K4);		
		
		Ex02.prn02();
		
		double su1 = Ex02.prn04();
		System.out.println(su1);
		
		
		Ex02 test = new Ex02();
		System.out.println(test);
		System.out.println(test.k1);
		System.out.println(test.K2);
		System.out.println(test.K3);
		System.out.println(test.K4);
		
	}

}
