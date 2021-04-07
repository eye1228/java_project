package com.ict06.Thread;

/*
	���� : �� ���� �����带 �����Ͽ� ù ��° �������� ����� 1 ~ 50���� ���, �� ��° �������� ����� 51 ~ 100���� ���
	�ٽ� ù ��° �����尡 101���� 150���� ��� �� ��° �����尡 151 ~ 200���� ���
*/
public class Ex16 implements Runnable{
	int x = 0;
	@Override
	public synchronized void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + (++x));
			if(x == 50 || x == 100) {
				try {
					//System.out.println("�� �ȳ���");
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else  {
				notify();
			}
		}
	}
}
