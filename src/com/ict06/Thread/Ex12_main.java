package com.ict06.Thread;

public class Ex12_main {

	public static void main(String[] args) {
		System.out.println("main ����");
		Ex12 t1 = new Ex12();
		Thread thread1 = new Thread(t1);
		thread1.start();
		
		
		
		//join() : ���� ������� join()�� ȣ���� �����尡 ���������� �����¿� ���� �ִٰ� join()�� ȣ����
		//			�����尡 ������ �ٽ� ����. �� join()�� ȣ���� �����尡 ���������� ���� �� �� ����.
		//			== ������ ���� ���������� �� ���´�.
		
		try {
			thread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main ��");

	}
}
