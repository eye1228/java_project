package com.ict06.Thread;

public class Ex09_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex07 t1 = new Ex07();
		Ex08 t2 = new Ex08();
		Ex09 t3 = new Ex09();
		
		//t1.start(); ������. ��? Runnable�� Ex07,08,09�� start�޼ҵ尡 ���.
		
		
		
		
		//Thread thread1 = new Thread();//�̳��� start�޼ҵ� ����. Ÿ���� ������ �� �⺻ �����ڸ� ���� ����.
		Thread thread1 = new Thread(t1);//Ÿ���� �ִ� t1
		
		thread1.start();
		
		new Thread(t2).start();
		
		Thread thread3 = new Thread(t3);
		thread3.start();
		
		new Thread(new Runnable() {//�͸� ����Ŭ����
			@Override
			public void run() {
				while(true) {
					System.out.println(Thread.currentThread().getName() + "������������������");
				}
			}
		}).start();
		
	}
}
