package com.ict11.ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		//Scanner�� �̿��ؼ� ���ǻ��� ������ ����.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		String msg = sc.next();
		
		
		//DB ó���� �ʿ��� Ŭ����
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		int result = 0;
		try {
			//1. ����̹� �ε�.
			Class.forName("oracle.jdbc.OracleDriver");
			//2. ���� ���� (3��)
			String url = "jdbc:oracle:thin:@203.236.220.4:1521:xe";
			String user = "c##ictedu02";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			//���� �ۼ�
			String sql = "select * from book where publisher = ? order by bookid";
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, "%" + msg + "%");
			rs = pstm.executeQuery();
			System.out.println("������ȣ\t������\t���ǻ�\t����");
			
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
				rs.close();
				pstm.close();
				conn.close();			
			} catch (Exception e2) {
					System.out.println(e2);
			}
		}
	}
}
