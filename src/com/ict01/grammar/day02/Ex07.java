package com.ict01.grammar.day02;

class Ex07{

	public static void main(String[] args) {
	//1�� �̸��� ȫ�浿�� ����� ����, ����, ���� ������ 90 80 90
	//������ ����� ���Ͻÿ�. �̸� ���� ����� ��� (����� �Ҽ��� ù°�ڸ� ����

	int kor = 90, eng = 80, math = 90;
	String name = "ȫ�浿";
	int sum = kor + eng + math;

	int avg1 = (sum * 10) / 3;
	System.out.println(avg1);
	double avg2 = (double)avg1 / 10;

	System.out.println("�̸� : " +name + " ���� : " + sum + " ��� : " + avg2);
	}

}