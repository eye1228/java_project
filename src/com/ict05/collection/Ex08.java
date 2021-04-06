package com.ict05.collection;

import java.util.*;

public class Ex08 {

	public static void main(String[] args) {
		// Map �������̽�
		
		//1. key�� ���ڷθ���� for�� ����
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "�ѱ�");
		map1.put(2, "�̱�");
		map1.put(3, "�߱�");
		map1.put(4, "����");
		map1.put(5, "�±�");
		System.out.println(map1);
		
		map1.put(3, "�Ϻ�");//Ű�� �ߺ��Ǽ� �����
		System.out.println(map1);
		
		map1.put(6, "�ѱ�");//Ű�� �ߺ��Ǽ� �����
		System.out.println(map1);
		
		System.out.println(map1.get(1));
		System.out.println(map1.get(2));
		System.out.println(map1.get(3));
		System.out.println(map1.get(4));
		System.out.println(map1.get(5));
		System.out.println("================================");
		for(int i = 0;i<map1.size();i++)
		{
			System.out.println(map1.get(i+1));
		}
		System.out.println("================================");
		//������ for�� ���
		for(Integer k : map1.keySet()) {
			System.out.println(map1.get(k));
		}
		
		System.out.println("================================");
		
		//iterator���
		Iterator<Integer> it = map1.keySet().iterator();
		while(it.hasNext()) {
			int s1 = (int)it.next();
			System.out.println(map1.get(s1));
		}
		System.out.println("================================");
		//2. key�� ���ڷ� ����� ��� �� iterator�� ����ؾ���
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("�̸�", "��浿");
		map2.put("����", "34");
		map2.put("�ּ�", "������");
		map2.put("����", "��");
		map2.put("���", "���ڱ�");
		
		
		System.out.println(map2.get("�̸�"));
		System.out.println(map2.get("����"));
		System.out.println(map2.get("�ּ�"));
		System.out.println(map2.get("����"));
		System.out.println(map2.get("���"));
		System.out.println();
		System.out.println("================================");
		for(String k : map2.keySet()) {
			System.out.println(map2.get(k));
		}
		System.out.println("================================");
		Iterator<String> it2 = map2.keySet().iterator();
		
		while(it2.hasNext()) {
			String k = (String) it2.next();
			System.out.println(map2.get(k));
		}
		
		System.out.println("================================");
		
		
		
		
		
		
	}
}
