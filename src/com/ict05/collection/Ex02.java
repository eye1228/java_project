package com.ict05.collection;

import java.util.*;

public class Ex02 {

	public static void main(String[] args) {
		// 
		// Set �������̽��� ��ӹ��� Ŭ���� : HashSet, TreeSet
		// -HashSet�� TreeSet ��� ����� ��� ����
		// 	�׷��� TreeSet�� ���ο��� �׻� ���� ���� ���� ���¸� ����
		// set�� Ư�� �������� ������ �� �� ����.
		// -HashSet, TreeSet �ߺ� �ȵ�
		// 
		// �÷��� ����
		// HashSet<���׸�Ÿ�� = ��ü Ÿ�� = ���� Ŭ����> �������� = new HashSet<���׸�Ÿ��>();
		// HashSet<���׸�Ÿ�� = ��ü Ÿ�� = ���� Ŭ����> �������� = new HashSet<>();
		HashSet<String> h1 = new HashSet<>();
		HashSet<Integer> h2 = new HashSet<>();
		HashSet<Double> h3 = new HashSet<>();
		HashSet<Boolean> h4 = new HashSet<>();
		
		/* h2 (������)�� ��ü�� �߰��ϴ� ���
		   ���1) �⺻ �ڷ����� ��ü�� ���� �ֱ� =>Boxing
		*/
		
		Integer k1 = new Integer(10);
		Integer k2 = new Integer("10");
		//��� 2 �⺻ �ڷ����� �׳� �ִ´�, �⺻�ڷ����� �ڵ����� ��ü�� �Ǿ(AutoBoxing) �־���
		
		//h2 �÷��ǿ� ��ü �ֱ�(add(���))
		h2.add(k1);
		h2.add(k2);
		h2.add(10);
		
		h2.add(new Integer(10));
		//���� ���׸� Ÿ�� �ƴϸ� ������
		h3.add(3.14);
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		
		
		h1.add("java");
		h1.add("Java");
		h1.add("JAVA");
		h1.add("jsp");
		h1.add("JSP");
		h1.add("spring");
		System.out.println(h1);
		//�ϳ��� ������ ���
		//1, ������ for�� ���(�Ϲ� for���� ��� ���� ==index�� ����)
		//2. iterator();
		
		for(String k : h1) {
			String msg = k;
			System.out.println(msg);
		}
		Iterator<String> it = h1.iterator();
		while(it.hasNext()) {
			String msg = (String) it.next();
			System.out.println(msg);
		}
	}

}
