package com.ict05.collection;

import java.util.*;

public class Ex06 {

	public static void main(String[] args) {
		// ArrayList(����ȭ ���� ����), Vector(����ȭ ���� = ���� ����)
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("����ȣ");
		list.add("������");
		list.add("�����");
		System.out.println(list);
		System.out.println();
		
		list.add(1, "�߽ż�");
		
		System.out.println(list);
		System.out.println();
		
		Vector<String> vector = new Vector<String>();
		vector.add("�Ѹ�");
		vector.add("�����");
		vector.addElement("��ġ");
		System.out.println(vector);
		System.out.println();
		
		//����
		vector.add(2, "����");
		System.out.println(vector);
		System.out.println();
		
		if(list.contains("�����")) {
			System.out.println(list.indexOf("�����")+"��° ��ġ");
			System.out.println(list.get(3));
			System.out.println(list.get(list.indexOf("�����")));
		}else {
			System.out.println("����");
		}
		//set
		list.set(3, "�̴�ȣ");
		System.out.println(list);
		System.out.println();
		
		if(list.contains("�߽ż�")) {
			list.set(list.indexOf("�߽ż�"), "������");
		}else {
			System.out.println("no");
		}
		System.out.println();
		
		for(String k : list) {
			System.out.println(k);
		}
		System.out.println();
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String s1 = (String)it.next();
			System.out.println(s1);
		}
		System.out.println();
	}

}
