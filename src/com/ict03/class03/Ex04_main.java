package com.ict03.class03;

public class Ex04_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex03 t1 = new Ex03();
		
		System.out.println(t1);
		
		
		//�θ� �ڽ��� ���� ��ü�� ������ �ڽĸ���� ���� ��� == �޼ҵ嵵 ��������
		System.out.println(t1.name);
		System.out.println(t1.addr);
		
		
		
		t1.sound();
		t1.prn();
		
		System.out.println(Ex03.hobby);
		System.out.println(Ex02.car);
		t1.eat();
	}

}
