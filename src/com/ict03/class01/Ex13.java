package com.ict03.class01;

public class Ex13 {
	private String name = "����";
	private int age = 3;
	private String addr = "����";
	
	public Ex13() {
		System.out.println("�⺻ ������" + this);
	};
	
	public Ex13(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Ex13(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}
