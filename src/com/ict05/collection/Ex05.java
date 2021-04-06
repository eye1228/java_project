package com.ict05.collection;

import java.util.*;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		stack.add("�Ѹ�");
		stack.addElement("������");
		stack.push("������");
		System.out.println(stack);
		
		
		stack.add("�����");
		stack.add("��ġ");
		stack.add("�Ѳ�");
		stack.add("�Ѹ�");
		System.out.println(stack);
		System.out.println("=================");
		
		System.out.println(stack.peek());
		System.out.println(stack);
		
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println();
		
		
		
		if(stack.contains("�Ѹ�")) {
			System.out.println(stack.indexOf("�Ѹ�") + "��° ��ġ");
			System.out.println(stack.search("�Ѹ�") + "��° ��ġ");
			System.out.println(stack.get(1));
			System.out.println(stack.get(stack.indexOf("�Ѹ�")));
			System.out.println(stack.elementAt(stack.indexOf("�Ѹ�")));
			System.out.println(stack.firstElement());
			System.out.println(stack.lastElement());
		}else {
			System.out.println("�������� ����");
		}
		System.out.println(stack.size() + "��Ұ� �����մϴ�.");
		
		stack.set(3, "������");
		System.out.println(stack);
		
		for(String k : stack) {
			System.out.println(k);
		}
		System.out.println(stack.size() + "��Ұ� ������");
		
		Iterator<String> it = stack.iterator();
		while(it.hasNext()) {
			String msg = (String)it.next();
			System.out.println(msg);
		}
		System.out.println(stack.size() + "��Ұ� ������");
		
		while(!stack.isEmpty()) {
			String k = stack.pop();
			System.out.println(k+"����, ũ��� " + stack.size() );
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
