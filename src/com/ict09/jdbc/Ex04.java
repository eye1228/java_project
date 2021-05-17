package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex04 {
	public static void main(String[] args) {
		//db�� �ʿ��� 3���� Ŭ����
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null; //Select���� ����� �޴´�.
		int result = 0;
		try {
			//1. ����̹� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. ������ ���� ����(3��)
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "root";
			String password = "a007005618!@";
			conn = DriverManager.getConnection(url, user, password);
			//3. ������ �ۼ�
			//cust id�� 7�� ����� �̸� = ����ȣ, �ּ� = ���ѹα� ���� �� ����
			String sql = "delete from customer where name = '�����'";
			
			//4.���� DB�� ���� �غ�
			stmt = conn.createStatement();
			
			//5.���� ������ ��� �ޱ�
			//select���� �Ͱ� �ƴѰ� 2���� ��������. ���� select�� �ƴϴϱ� result���. rs����� EX01 ����
			result = stmt.executeUpdate(sql);
			if(result > 0) {
				System.out.println("���� ����");
				
				sql = "select * from customer";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
					System.out.print(rs.getInt("custid") + "\t");
					System.out.print(rs.getString("name") + "\t");
					System.out.print(rs.getString("address") + "\t");
					System.out.println(rs.getString("phone") + "\t");
				}
			}else {
				System.out.println("���� ����-1");
			}
		} catch (Exception e) {
			System.out.println("���� ����-2");
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
