package com.ict11.ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.ict10.jdbc.EX05_VO;
//DAO�� Data Access Object�� ���μ� ���������� DB�� �����ϴ� ��ü�� ���Ѵ�.
//DAO�� ��� ������ ȿ������ Ŀ�ؼ� ������ ���ȼ� �����̴�.
//DAO(Data Access Object)�� DB�� ����� �����͸� ��ȭ�ϰų�
//                        �����ϴ� ����� �����ϵ��� ���� ������Ʈ�� ���Ѵ�.
public class DAO {
	Scanner sc = new Scanner(System.in);
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;   
	int result = 0;
	
	//�̱��� ���� : ����Ʈ���� ������ ���Ͽ� ����ϴ� ���� �� �ϳ�. �����ڰ� ���� ���� ȣ��Ǵ��� ���� ���� �Ǵ� ��ü�� �ϳ��̰�
	//			 ���� ���� ���Ŀ��� ȣ��� �����ڴ� ������ �����ڰ� ������ ��ü�� �����Ѵ�.
	//			 �̿� ���� ������ �̱��� �����̶�� �Ѵ�.
	//			 ���� ��ǥ���� ���� Spring�� �⺻������ �̱��� ������ ����Ѵ�.
	private static DAO dao = new DAO();
	
	public static DAO getInstance() {
		return 	dao;
	}
	//DB���� ���� ����
	public Connection getConnection() {
		try {
			//1. ����̹� �ε�.
			Class.forName("oracle.jdbc.OracleDriver");
			//2. ���� ���� (3��)
			String url = "jdbc:oracle:thin:@203.236.220.4:1521:xe";
			String user = "c##ictedu02";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			System.out.println(e);
		}
		return conn;
	}
	
	//���� DB���� �޼ҵ� ����
	//select
	public void getList() {
		
		try {
			conn = getConnection();
			String sql = "select * from book order by bookid asc";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("������ȣ\t������\t���ǻ�\t����");
			while(rs.next()) {
				System.out.print(rs.getInt("bookid") + "\t");
				System.out.print(rs.getString("bookname") + "\t");
				System.out.print(rs.getString("publisher") + "\t");
				System.out.println(rs.getInt("price"));
			}
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	//insert
	public void getInsert(int bookid, String bookname, String publisher, int price) {
		try {
			conn = getConnection();
			String sql = "insert into book values(?,?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, bookid);
			pstmt.setString(2, bookname);
			pstmt.setString(3, publisher);
			pstmt.setInt(4, price);
			result = pstmt.executeUpdate();
			if(result > 0) {
				System.out.println("���� ����");
			}else {
				System.out.println("���� ����");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	//delete
	public void getDelete(int bookid) {
		try {
			conn = getConnection();
			String sql = "delete from book where bookid = (?)";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, bookid);
			result = pstmt.executeUpdate();
			if(result > 0) {
				System.out.println("���� ����");
			}else {
				System.out.println("���� ����");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	//update
	public void getUpdate(String bookname, String publisher, int price, int target_bookid) {
		try {
			conn = getConnection();
			String sql = "update book set bookname = ?, publisher = (?), price = (?) "
					+ "where bookid = (?)";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, bookname);
			pstmt.setString(2, publisher);
			pstmt.setInt(3, price);
			pstmt.setInt(4, target_bookid);
			result = pstmt.executeUpdate();
			if(result > 0) {
				System.out.println("���� ����");
			}else {
				System.out.println("���� ����");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	//select
	public void getSelect(int bookid) {
		try {
			conn = getConnection();
			String sql = "select * from book where bookid = (?)";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, bookid);
			rs = pstmt.executeQuery();
			System.out.println("������ȣ\t������\t���ǻ�\t����");
			while(rs.next()) {
				System.out.print(rs.getInt("bookid") + "\t");
				System.out.print(rs.getString("bookname") + "\t");
				System.out.print(rs.getString("publisher") + "\t");
				System.out.println(rs.getInt("price"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
