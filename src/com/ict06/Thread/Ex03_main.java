package com.ict06.Thread;

public class Ex03_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		Ex03 t1 = new Ex03();
		Ex03 t2 = new Ex03();
		Ex03 t3 = new Ex03();
		Ex03 t4 = new Ex03();
		Ex03 t5 = new Ex03();
		t1.go();
		System.out.println("=============����!==============");
		
		t1.start();//start -> run �̾�� �ϴµ� start �Լ��� �־ run���� �Ȱ� == �����尡 �ƴ�
		System.out.println("=============����!==============");
		
		
	}

}
