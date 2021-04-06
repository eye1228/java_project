package com.ict05.collection;

import java.util.*;

public class Ex07 {

	public static void main(String[] args) {
		// Queue(ť)
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("����ȣ");
		linkedList.offer("�ڼ���");
		linkedList.add("�����");
		
		System.out.println(linkedList);
		
		linkedList.addFirst("�豤��");
		System.out.println(linkedList);
		
		linkedList.offerFirst("�Ѹ�");
		System.out.println(linkedList);
		
		if(linkedList.contains("�ڼ���")) {
			System.out.println(linkedList.indexOf("�ڼ���")+"��° ��ġ");
			System.out.println(linkedList.get(3));
			System.out.println(linkedList.get(linkedList.indexOf("�ڼ���")));
		}else {
			System.out.println("����");
		}
		
		//���� remove
		linkedList.removeFirst();
		System.out.println(linkedList);
		
		linkedList.removeLast();
		System.out.println(linkedList);
		
		System.out.println(linkedList.remove(1) + "���� ���� �Ǿ����ϴ�.");
		System.out.println(linkedList);
		System.out.println();
	}

}
