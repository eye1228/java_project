package com.ict03.class07;

public class Ex03 {
	String name = "�Ѹ�";
	int hight = 160;
	public Ex03() {
		System.out.println("Out : " + this);
	}
	public void sound() {
		String addr = "Seoul";
		System.out.println("Hoi!");
	}
	
	//���� Ŭ������ ���� �޼ҵ�.
	public void play() {
		int age = 24;
		class Inner02{ //public can't use
			String name = "Hydong";
			int time = 36;
			public Inner02 () {
				System.out.println("In : " + this);
			}
			public void hobby() {
				System.out.println(name);
				System.out.println(hight);
				//System.out.println(addr);//�ڱⰡ ���� �޼ҵ� �ƴ϶� �� ��
				System.out.println(age);
				System.out.println(time);
			}//���� �޼ҵ� ��
		}//���� Ŭ���� ��
		Inner02 in02 = new Inner02();
		//�ܺ� ���
		System.out.println(name);
		//�ܺ� �޼ҵ�
		sound();
		
	}//�ܺ� �޼ҵ� ��
}
