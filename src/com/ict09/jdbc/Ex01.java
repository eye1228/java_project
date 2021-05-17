package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex01 {
	public static void main(String[] args) {
		//JDBC(java database connectivity) : �ڹٿ��� �����ͺ��̽��� ������ �� �ֵ��� �ϴ� �ڹ� API
		//JDBC�� �����ͺ��̽����� �ڷḦ �����ϰų� ������Ʈ �ϴ� ����� ����
		//�� �����ͺ��̽��鿡�� ������ �� �ִ� JDBC ����̹��� �ʿ�
		//Mysql�� �ʿ��� ����̹��� �ٿ�޾Ƽ� �ش� ������Ʈ�� �����ؾߵȴ�.
		//������Ʈ���� ���콺 ������ - Build path - Configure Build Path - Add external jar...
		//�ش� ���̺귯�� ����
		
		//DBó���� �Ƿ��� Ŭ���� 3�� ����
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null; //Select���� ����� �޴´�.
		int result = 0; // update, insert delete�� ���
		try {
			// 1. ����̹� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. ������ ���� ����(3��)
			//���� ������ localhost�� ����� //localhost/  ���
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "root";
			String password = "a007005618!@";
			conn = DriverManager.getConnection(url, user, password);
			
			//3. ������ �ۼ� (CRUD = ���۾�(insert, update, delete, select)
			String sql = "select * from customer";
			
			//4. ���� DB�� ����. Statement Ŭ������ ����.
			stmt = conn.createStatement();
			
			//5. StatementŬ������ ���� ���� �� DB�� ����� �޾Ƽ� ó���Ѵ�.
			//�̶� 2������ ��������. select���� ���� �ƴ� ��
			
			//select���� ���� ResultSet Ŭ������ �޴´�.
			rs = stmt.executeQuery(sql);
			//�ƴ� ���� int�� �޴´�.
			//result = stmt.executeUpdate(sql);
			//6. ������� next() => ���� �ٿ� ������ ������ true
			while(rs.next()) {
				System.out.print(rs.getInt("custid") + "\t");
				System.out.print(rs.getString("name") + "\t");
				System.out.print(rs.getString("address") + "\t");
				System.out.println(rs.getString("phone") + "\t");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				
			}
		}
	}
}
