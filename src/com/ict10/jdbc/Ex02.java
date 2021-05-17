package com.ict10.jdbc;

import java.sql.*;

public class Ex02 {
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
			
			//String sql = "select * from book where bookid = ?";
			//String sql = "select * from book where publisher like ?";
			String sql = "insert into book values(?,?,?,?)";
			
			//���� ����ǥ�� �������� �ٲٴ� ���� excuteQuery�� ������ �Ѵ�.= ���ε� ���� ó�� �κ�
			
			//���� ���� ����
			pstmt = conn.prepareStatement(sql);
			
			//���ε� ���� ó��
			
			//pstmt.setInt(1, 3);
			//pstmt.setString(1, "%�̻�%");
			pstmt.setInt(1, 15);
			pstmt.setString(2, "�� ���̺�");
			pstmt.setString(3, "���ѹ̵��");
			pstmt.setInt(4, 13000);
			
			//���� DB�� �����ϰ� ��� �ޱ�
			//rs = pstmt.executeQuery();
			//�������� select ���̸� excuteQuery(). select���� �ƴ϶�� executeUpdate()
			result = pstmt.executeUpdate();
			
			/*while(rs.next()) {   //���� select�� �� 
				System.out.print(rs.getInt("bookid") + "\t");
				System.out.print(rs.getString("bookname") + "\t");
				System.out.print(rs.getString("publisher") + "\t");
				System.out.println(rs.getInt("price"));
			}*/
			
			//��� Ȯ��
			if(result > 0) {
				
				sql = "select * from book order by bookid asc";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					System.out.print(rs.getInt("bookid") + "\t");
					System.out.print(rs.getString("bookname") + "\t");
					System.out.print(rs.getString("publisher") + "\t");
					System.out.println(rs.getInt("price"));
				}				
			}
			else {
				System.out.println("�̹� �ִ�.");
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
