package com.ict06.Thread;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Thread ������
		//-Thread() : �⺻ ������
		//-Thread(Runnable target) : Runnable �������̽��� ���ڷ� �޾Ƽ� ó�� . �͸� ���� Ŭ������ ��밡��.
		//-Thread(Runnable target, String name) : �̶�  name�� ������ �̸� ���� ����.
		//										  Runnable �������̽��� ���ڷ� �޾Ƽ� ó��
		//-Thread(String name) : �� �� name�� ������ �̸� ���� ����
		
		//�ֿ� �޼ҵ�
		/*
		-join() : ���� ������� join()�޼ҵ带 ȣ���� �����尡 ���� ������ ��� ���·� �����ִٰ� join()�� ȣ����
				  �����尡 ������ �ٽ� ����. ��, join()�� ȣ���� �����尡 ���� ������ ���� �Ұ�
		-start() : start()�� �����ϸ� run()�� ȣ��. (���� start()�� ������ start()�� ��)
		-run() : start()�� ȣ���ؼ� run()�� ����Ǹ� �̶� ������ ó���� �ߴٰ� ��
		-sleep(long millis) : 1000�� 1�ʸ� �ǹ�, ��� �����·� ���� �ִ� ���¸� ����
		-yield() : ���� ���� ������ �� �켱������ ���� �ٸ� �����忡�� ������� �ѱ��.
		-getName() : ������ �̸� ���ϱ�
		-setName() : ������ �̸� ����
		-currentThread() : ���� ����Ǵ� ������ ��ü�� ����(��ȯ)
		
		�տ��� ���� ��� ó���� ���� �����尡 ȥ�� �� ó��
		�̷��� ���� �̱� ������� �Ѵ�.
		�����带 ��ó���ϴ� �ϲ��̶� ����
		
		JVM main �޼ҵ带 ȣ���ϸ� ������ main�����尡 ó���� �Ѵ�.
		*/
		System.out.println(Thread.currentThread().getName());
		
		Ex02 test = new Ex02();
		System.out.println("1" + Thread.currentThread().getName());
		test.add(5, 8);
		System.out.println("4" + Thread.currentThread().getName());
		
		int result = test.sub(8, 5);
		System.out.println("7" + Thread.currentThread().getName());
		System.out.println(result);

		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
