package com.ict03.class02;


public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "hello";
		System.out.println(msg);
		
		msg += " java";
		System.out.println(msg);
		
		StringBuffer sb = new StringBuffer("welcome");
		System.out.println(sb.toString());
		
		//StringBuffer == ������ �Ӽ�
		//���� �������� ���� �߰�. String�� +�� �� ��� ���ο� ����(�޸�)�� ����
		//������ �߰��� �� append("���ڿ�")
		
		sb.append(" JAVA");
		
		System.out.println(sb.toString());
		
	}

}
