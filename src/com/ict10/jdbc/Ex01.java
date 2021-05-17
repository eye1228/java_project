package com.ict10.jdbc;

import java.sql.*;

public class Ex01 {
	public static void main(String[] args) {
		//JDBC�� �ڹٿ��� �����ͺ��̽��� ���� �� �� �ֵ��� �����ϴ� �ڹ� API
		
		//DB ó���� �ʿ��� Ŭ���� 3��
		Connection conn = null;
		//Statement �� ��ӹ��� �������̽�
		PreparedStatement pstmt = null;
		ResultSet rs = null;     //select���� ����� ���� Ŭ������ cursor�� ����ؼ� ������ ������ �� �ִ�.
		int result = 0;
		try {
			//1. �帮�̹� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. ���� ���� (3��)
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=utf-8&serverTimezone=UTC";
			String user = "root";
			String password = "a007005618!@";
			conn = DriverManager.getConnection(url, user, password);
			
			//������ �ۼ�(select, insert, update, delete)
			String sql = "select * from book order by bookid";
			
			//���� ���� ����
			pstmt = conn.prepareStatement(sql);
			
			//���� DB�� �����ϰ� ��� �ޱ�
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getInt("bookid") + "\t");
				System.out.print(rs.getString("bookname") + "\t");
				System.out.print(rs.getString("publisher") + "\t");
				System.out.println(rs.getInt("price"));
			}
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
