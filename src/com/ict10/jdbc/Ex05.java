package com.ict10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;


public class Ex05 {
	public static void main(String[] args) {
		//���� bookid�� �ޱ� ���ؼ� Scanner ���
		ArrayList<EX05_VO> list = new ArrayList<EX05_VO>();
		Scanner sc = new Scanner(System.in);
		
		
		esc:while(true) {			
			Ex05_DAO dao = new Ex05_DAO();		
			dao.getList();
			System.out.println("============================================");
			System.out.println("������ ���°�����");
			System.out.println("1. ����");
			System.out.println("2. ����");
			System.out.println("3. ����");
			System.out.println("4. �˻�");
			System.out.print("���� ��ȣ : ");
			String su = sc.next();
			switch(su) {
				case "1" :
					System.out.print("bookid : ");
					int i_bookid = sc.nextInt();
					System.out.print("bookname : ");
					String i_bookname = sc.next();
					System.out.print("pbulisher : ");
					String i_publisher = sc.next();
					System.out.print("price : ");
					int i_price = sc.nextInt();
					
					Ex05_DAO i_dao = new Ex05_DAO();
					i_dao.getInsert(i_bookid, i_bookname, i_publisher, i_price);
					
					break;
				case "2" : 
					System.out.print("������ ���ϴ� bookid �Է� : ");
					int d_bookid = sc.nextInt();
					
					Ex05_DAO d_dao = new Ex05_DAO();
					d_dao.getDelete(d_bookid);
										
					break;
				case "3" : 
					System.out.print("bookname : ");
					String u_bookname = sc.next();
					System.out.print("pbulisher : ");
					String u_publisher = sc.next();
					System.out.print("price : ");
					int u_price = sc.nextInt();
					System.out.print("target_bookid : ");
					int u_target_bookid = sc.nextInt();
					
					Ex05_DAO u_dao = new Ex05_DAO();
					u_dao.getUpdate(u_bookname, u_publisher, u_price, u_target_bookid);
					
					break;
				case "4" : 
					System.out.print("�˻��� ���ϴ� bookid �Է� : ");
					int s_bookid = sc.nextInt();
					
					Ex05_DAO s_dao = new Ex05_DAO();
					s_dao.getSelect(s_bookid);
					break;
				default : 
					System.out.println("1~4 �߿��� �����ÿ�"); 
					continue esc;					
			}
			while(true) {
				System.out.println("��� �ұ��?(y/n)");
				String msg = sc.next();
				if(msg.equalsIgnoreCase("y")) {
					continue esc;
				}else if(msg.equalsIgnoreCase("n")) {
					break esc;
				}else {
					continue;
				}
			}
		}
		System.out.println("����� ���� Ȯ��");
		Ex05_DAO dao = new Ex05_DAO();		
		dao.getList();
	}
}