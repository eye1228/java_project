package com.ict01.grammar.day03;

class Ex05 {

	public static void main(String[] args) {
	
	//int k1�� 60�̻��̸� �հ� �ƴϸ� ���հ�

	int k1 = 58;
	String result = (k1 >= 60) ? "�հ�" : "���հ�";
	System.out.println(result);

	//int k2�� Ȧ������ ¦������ �Ǻ�

	int k2 = 61;
	result = (k2 % 2 == 0) ? "¦��" : "Ȧ��";
	System.out.println(result);
	//char k3�� �빮������ �빮�ڰ� �ƴ��� �Ǻ�

	char k3 = 'A';
	result = ((k3 >= 'A') && (k3 <= 'Z')) ? "�빮��" : "�ƴϴ�" ;
	System.out.println(result);
	//�ٹ��ð��� 8�ð������� �ð��� 8720�̰� 8�ð��� �ʰ��� �ð���ŭ�� 1.5��
	//���� �ٹ��ð��� 10�ð�, �� �޾ƾ��ϳ�?
	
	int time = 10;
	double val = (time >= 10) ? ((time - 8) * (8720 * 1.5) + 8 * 8720) : (time * 8720);
	System.out.println(val);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}