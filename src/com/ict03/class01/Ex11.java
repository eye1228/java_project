package com.ict03.class01;

public class Ex11 {
	private String name = "�Ѹ�";
	private int age = 24;
	private boolean gender = true;
	
	
	
	
	public Ex11() {
		System.out.println("�⺻������");
		name = "�±Ǻ���";
		age = 43;
	}
	public Ex11(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
}
