package com.ict01.grammar.day03;

import java.util.*;
class Ex08{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//���ڸ� �޾� Ȧ�� ¦�� ����
	int i = sc.nextInt();
	
	String res1 = (i%2 == 0) ? "¦��" : "Ȧ��";
	System.out.println(res1);	
	
	//���� ���� ������ �޾� ������ ����� 60�̻��̰�, ������ ������ 40�� �̻��� �� �հ�, �ƴϸ� ���հ�
	
	int kor = sc.nextInt(), eng = sc.nextInt(), math = sc.nextInt();
	int sum = kor + eng + math;
	double avg = sum / 3.0;

	String res2 = (avg >= 60) ? (((kor >= 40) && (eng >= 40) && (math >= 40)) ? "�հ�" : "���հ�") : "���հ�";
	System.out.println(res2);
	//�˹� �ð� �Է�, �ð� �� 8720�� ,8�ð� �ʰ��� 1.5��   ���� �ݾ� ���.
	
	int time = sc.nextInt();
	double res3 = (time >= 10) ? ((time - 8) * (8720 * 1.5) + 8 * 8720) : (time * 8720);
	System.out.println(res3);
	
	
	
	
	
	
	
	
	
	}
}