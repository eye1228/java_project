package com.ict03.class01;

public class Ex02 {
	int k1 = 80; //�ν��Ͻ� ���� == �Ϲ� ����
	static int K2 = 90;//static ����
	final int K3 = 85; // �ν��Ͻ� ���
	static final int K4 = 95; //static ��� == API���� �����ϴ� �������
	
	
	//��� �޼ҵ� : ����, ���
	//�ν��Ͻ�, ��ȯ���� ����.
	public void prn01() {
		
	}
	
	//static, ��ȯ���� ����.
	public static void prn02() {
		//���������� static ������
		/*�������� : �޼ҵ� �ȿ��� ��������� ����
					�޼ҵ� �ȿ��� ������� ������ �޼ҵ带 ȣ���� �� ����
					�޼ҵ尡 ������� �������
					���������� static �� ���� �� ����.*/
	}
	
	//�ν��Ͻ�, ��ȯ���� ����
	public int prn03() {
		k1 += 20;
		K2 += 10;
		System.out.println("k1 = " + k1);
		System.out.println("K2 = " + K2);
		
		return k1;
	}
	
	//static ��ȯ���� ����
	public static double prn04() {
		//static �޼ҵ忡�� �ν��Ͻ� ���� ��� �Ұ�
		//k1 += 20; ����
		//K3 += 10;����
		
		return 147;
//		return 0;
	}
	
	
	
	
}
