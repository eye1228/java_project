package com.ict03.class04;

public abstract class Ex01 {
	//�߻� Ŭ���� : �߻� �޼ҵ带 ������ �ִ� Ŭ����
	
	//�߻� �޼ҵ� : ��üȭ�� ���� ���� �޼ҵ带 �ǹ�, body ����� ���� �޼ҵ� = ���๮ x
	//           �ݵ�� abstract ����� ���
	//������ : �ϳ��� �޼ҵ峪 Ŭ������ ���� �� �̰��� �پ��� �������  ���� ��Ű�� ���� �ǹ�
	
	int s1 = 10;
	static int s2 = 10;
	final int S3 = 10;
	static final int S4 = 10;
	
	public void play() {
		System.out.println("�ν��Ͻ� �޼ҵ�");
	}
	public static void prn() {
		System.out.println("static �޼ҵ�");
	}
	
	
	//�߻� �޼ҵ�
	public abstract void sound();
	
}
