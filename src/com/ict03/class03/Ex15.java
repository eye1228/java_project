package com.ict03.class03;

public class Ex15 extends Ex14{
	String name = "ȫ����";
	int id = 2410;
	public Ex15() {
		super("������",27);
		name = "ȫ�β�";
		id = 1004;
	}
	
	public Ex15(String name) {
		super("��", 37);
		this.name = name;
	}
	
	
	public void prn() {
		String name = "ȫ��";
		System.out.println("���� + " + name);
		System.out.println("���� + " + this.name);
		System.out.println("�θ� + " + super.name);
		
		System.out.println("���� + " + age);
		System.out.println("���� + " + this.age);
		System.out.println("�θ� + " + super.age);
		
		System.out.println("���� + " + id);
		System.out.println("���� + " + this.id);
		//System.out.println("�θ� + " + super.id); ����
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
