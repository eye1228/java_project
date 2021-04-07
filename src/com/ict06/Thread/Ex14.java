package com.ict06.Thread;

public class Ex14 implements Runnable{
	/*
	����ȭ ó�� �� �� ���� ���� �����带 ������ ��� ���·� �����Ű�� �޼ҵ带 wait()��� �Ѵ�.
	�ѹ� wait()�� ������� Ǯ������ ������ �״�� ��� ���¿��� ���α׷��� �����.
	wait()�� �����带 Ǯ���ִ� �޼ҵ尡 notify(). notifyAll()�̴�.
	*/
	int x = 0;
	
	@Override
	public synchronized void run() {
		for(int i = 0;i < 50; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + (++x));
			if(x == 25) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else {
				notify();
			}
		}
		
	}
	
	
}
