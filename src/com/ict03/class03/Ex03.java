package com.ict03.class03;

public class Ex03 extends Ex02{
	String name = "���θ�";
	int age = 34;
	static String hobby = "��ȭ����";
	
	
	public Ex03() {
		System.out.println("�ڽ�Ŭ���� ������");
		
	}
	public void sound() {
		System.out.println("�ڽ� Ŭ���� �޼ҵ�");
	}
	
	public void study() {
		System.out.println("���� ��� : " + addr);
		System.out.println("�� �̸� : " + name);
		System.out.println("�ƺ��� �̸� : " + super.name);
	}
	@Override
	public void eat() {
		System.out.println("�ȸ���");
	}
	
	
}
