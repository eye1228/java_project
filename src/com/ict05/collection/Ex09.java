package com.ict05.collection;

import java.util.*;


public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("�ѱ�", "����");
		map.put("�����ѱ�", "����");
		map.put("KOREA", "����");
		map.put("korea", "����");
		map.put("�̱�", "������");
		map.put("�߱�", "�ϰ�");
		map.put("�Ϻ�", "����");
		map.put("�±�", "����");
		map.put("ĳ����", "��Ÿ��");
		
		Set<String> sets = map.keySet();
		
		Scanner sc = new Scanner(System.in);
		
		esc:
		while(true) {
			System.out.print("���� : ");
			String msg = sc.next();
			if(sets.contains(msg)) {
				String result = map.get(msg);
				System.out.println(msg + "�� ������ " + result + "�̴�.");
			}else {
				System.out.println("�����Ϳ� ���� �����.");
			}
			
			while(true) {
				System.out.print("��� �ұ��? (y/n) : ");
				String str = sc.next();
				if(str.equalsIgnoreCase("y")) {
					continue esc;
				}else if(str.equalsIgnoreCase("n")) {
					break esc;
				}else {
					System.out.println("�� �� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���(y/n) : ");
					continue;
				}
			}
		}
		
	}

}
