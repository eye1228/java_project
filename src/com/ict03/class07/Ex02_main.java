package com.ict03.class07;

public class Ex02_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Member ����Ŭ������ ������ ��ü ���� ����
		//Inner01 t1 = new Inner01();//������ �ȵ�/ �ܺ� Ŭ���� ���ؼ� �� ���� 
		
		Ex02 t1= new Ex02();
		
		
		//�ܺθ� ���ؼ� ���� Ŭ���� ����
		//���� Ŭ���� �ּҸ� ���� $ �� ����.
		
		Ex02.Inner01 t2 =  t1.new Inner01();
		System.out.println(t2.name);
		System.out.println(t2.i2);
		System.out.println(t2.i4);
		System.out.println();
		t2.play();
	}	

}
