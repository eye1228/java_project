package com.ict01.grammar.day03;

class Ex10{

	public static void main(String[] args) {
		
		//k1�� 60�̻��̸� �հ� �ƴϸ� ���հ�
		int k1 = 76;
		String res1 = "���հ�";
		if(k1 >=60)
			res1 = "�հ�";
		System.out.println(res1);

		//k2�� Ȧ������ ¦������ �Ǻ�
		int k2 = 25;
		String res2 = "";
		if(k2 % 2 == 1){
			res2 = "Ȧ��";
		} else {
			res2 = "¦��";
		}
		System.out.println(res2);
		//�빮�� �ҹ��� �Ǻ�
		char k3 = 'E';
		String res3 = "";
		if(k3>='A' && k3 <= 'Z') {
			res3 = "�빮��";
		} else {
			res3 = "�ҹ���";
		}
		System.out.println(res3);		
		
		//k4 �� 1�Ǵ� 3�̸� ���� �ƴϸ� ����
		int k4 = 3;
		String sex ="";
		if(k4 == 3 || k4 == 1) {
			sex = "����";
		} else{
			sex = "����";
		}
		System.out.println(sex);
		

		//�ٹ��ð� ~ 8720, 8�ð� �ʰ� �� 1.5�� 10�ð��� �� ��?
		
		int time = 10;
		int pay;
		if(time > 8) {
			pay = (time - 8) * 8720 * 15 / 10 + 8 * 8720;
		} else {
			pay = time * 8720;
		}
		System.out.println(pay);		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

}