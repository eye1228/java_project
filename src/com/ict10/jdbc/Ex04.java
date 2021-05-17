package com.ict10.jdbc;

import java.sql.*;
import java.util.*;

public class Ex04 {
	public static void main(String[] args) {
		//���� bookid�� �ޱ� ���ؼ� Scanner ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ id�� �Է��Ͻÿ� : ");
		int del_id = sc.nextInt();
		
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
			
			String sql = "delete from book where bookid = ?";
			
			//���� ����ǥ�� �������� �ٲٴ� ���� excuteQuery�� ������ �Ѵ�.= ���ε� ���� ó�� �κ�
			
			//���� ���� ����
			pstmt = conn.prepareStatement(sql);
			
			//���ε� ���� ó��			
			pstmt.setInt(1, del_id);
			
			//���� DB�� �����ϰ� ��� �ޱ�			
			result = pstmt.executeUpdate();
			
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
			}else {
				System.out.println("������ �׸��� �������� �ʽ��ϴ�.");
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
