package com.ict03.class07;


/*
 1. Member ���� Ŭ����
 */
public class Ex04 {
	String name = "ȫ�浿";
	private int age = 24;
	static String addr = "�쵵";
	
	public Ex04() {
		System.out.println("�ܺ� Ŭ���� ������ : " + this);
	}
	
	public void sound() {
		int money = 1000;
		final int time = 2;
		//static int number2 = 12;
		//static final int number2 = 12;
		System.out.println("�ܺ�Ŭ���� �޼ҵ� : " + name + ", money : " + money);
		
	}
	
	public static class Inner03 {
		String name = "ȫ����";
		final int i2 = 10;
		static int i3 = 20; //���� Ŭ������ static ��� ���� �ٵ� Ŭ������ static �޸� ����
		static final int i4 = 30; //
		
		public Inner03() {
			System.out.println("����Ŭ���� ������ : " + this);
		}
		
		public void play() {
			int money = 50000;
			System.out.println("�̸� : " + name);
			System.out.println("�ݾ� : " + money);
			//�ܺ� Ŭ������ �ʵ� static�� �پ�� ��� ����
			//System.out.println("���� : " + age);
			//�ܺ� Ŭ���� �޼ҵ嵵 ��������
			//sound();
		}
	}
}
