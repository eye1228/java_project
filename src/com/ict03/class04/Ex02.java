package com.ict03.class04;

//�Ϲ����� Ŭ������ �߻� Ŭ������ ����Ϸ��� �ݵ�� �߻� Ŭ������ �߻� �޼ҵ带 �������̵� ���ؾ���
//==��üȭ �ؾ��Ѵ�.
class Ex02 extends Ex01{
	@Override
	public void sound() {
		
	}
	
}

//�������̵��� ���� �������� �ڽ�Ŭ������ �߻� Ŭ������ ����� ��.
abstract class Ex03 extends Ex01{
	public void song() {
		System.out.println("�뷡�ϱ�");
	}
	
}
//�������̵��� ���� �������� �ڽ�Ŭ������ �߻� Ŭ������ ����� ��.
abstract class Ex04 extends Ex01{
	public void music() {
		System.out.println("����");
	}
	public abstract void pop();
	
}

