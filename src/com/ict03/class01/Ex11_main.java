package com.ict03.class01;

public class Ex11_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ex11 test1 = new Ex11();
		Ex11 test1 = new Ex11("�Ӳ���", 17);
		System.out.println("�̸� : " + test1.getName());
		System.out.println("���� : " + test1.getAge());
		System.out.println("���� : " + test1.isGender());
		
		Ex11 test2 = new Ex11();
		
		System.out.println("�̸� : " + test2.getName());
		System.out.println("���� : " + test2.getAge());
		System.out.println("���� : " + test2.isGender());
		System.out.println();
		
		test2.setName("������");
		System.out.println("�̸� : " + test2.getName());
		System.out.println("���� : " + test2.getAge());
		System.out.println("���� : " + test2.isGender());
		System.out.println();
		
	}

}
