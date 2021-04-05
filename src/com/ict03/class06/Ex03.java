package com.ict03.class06;


enum Type2{
	//���� ��Ű��
	//1. �� ����
	WALK("��ŷȭ",270),
	RUN("����ȭ",280),
	TRACK("Ʈ��ŷȭ",260),
	HIK("����ŷȭ",265);
	//2. ��������
	final private String name;
	final private int size;
	//3. ������
	Type2(String name, int size){
		this.name = name;
		this.size = size;
	}
	//4. getter/setter
	public String getName() {
		return name;
	}
	
	
	public int getSize() {
		return size;
	}
}



public class Ex03 {
	public static void main(String[] args ) {
		Type2[] arr = Type2.values();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName() + ",  " + arr[i].getSize());
		}
		
		//������ for == foreach = forin
		//':' �� �ǹ� => �迭�� ������ �ִ� ó������ ������ ���ʴ�� ������ ����
		//�� �迭�� Ư���� ��Ҹ� ó���� �Ұ���.
		for(Type2 type2 : arr) {
			System.out.println(type2.getName() + " " + type2.getSize());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		String[] msg = {"java", "jsp", "spring", "android"};
		for(String k : msg) {
			System.out.println(k);
		}
		
		
	}
}
