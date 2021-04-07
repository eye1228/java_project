package com.ict06.Thread;

//������ start() => run() �̵��ؾ� ������ ó���� ��
//     start() => start() ������ �ƴ�
//     run() => run() ������ �ƴ�

//������ ���� = Thread Ŭ������ ���, Runnable �������̽� ���
//������ Ŭ������ start(), run() ��� ����
//Runnable�� run() �ϳ� ����

public class Ex03 extends Thread{
	
	public void go(){
		for(int i = 1; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
	
	@Override
	public void run(){
		for(int i = 1; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
	/*@Override
	public void start(){
		for(int i = 1; i < 11; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}*/ // �̰� ������ ������ �ƴ� (���� �̸��� �켱�̶� �׷���. ���ο��� start�� ������ run���� �����ϴµ� ����� �ͼ� �����尡 �ƴϰ� ��
}
