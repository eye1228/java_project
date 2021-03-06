package com.ict11.ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.ict10.jdbc.EX05_VO;
//DAO란 Data Access Object의 약어로서 실질적으로 DB에 접근하는 객체를 말한다.
//DAO의 사용 이유는 효율적인 커넥션 관리와 보안성 때문이다.
//DAO(Data Access Object)는 DB를 사용해 데이터를 조화하거나
//                        조작하는 기능을 전담하도록 만든 오브젝트를 말한다.
public class DAO {
	Scanner sc = new Scanner(System.in);
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;   
	int result = 0;
	
	//싱글톤 패턴 : 소프트웨어 디자인 패턴에 사용하는 패턴 중 하나. 생성자가 여러 차례 호출되더라도 실제 생성 되는 객체는 하나이고
	//			 최초 생성 이후에는 호출된 생성자는 최초의 생성자가 생성한 객체를 리턴한다.
	//			 이와 같은 유형을 싱글톤 패턴이라고 한다.
	//			 가장 대표적인 것이 Spring이 기본적으로 싱글톤 패턴을 사용한다.
	private static DAO dao = new DAO();
	
	public static DAO getInstance() {
		return 	dao;
	}
	//DB접속 역할 수행
	public Connection getConnection() {
		try {
			//1. 드리이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. 접속 정보 (3개)
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=utf-8&serverTimezone=UTC";
			String user = "root";
			String password = "a007005618!@";
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			System.out.println(e);
		}
		return conn;
	}
	
	//각종 DB접근 메소드 생성
	//select
	public void getList() {
		
		try {
			conn = getConnection();
			String sql = "select * from book order by bookid asc";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("도서번호\t도서명\t출판사\t가격");
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
				System.out.println("삽입 성공");
			}else {
				System.out.println("삽입 실패");
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
				System.out.println("삭제 성공");
			}else {
				System.out.println("삭제 실패");
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
				System.out.println("수정 성공");
			}else {
				System.out.println("수정 실패");
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
			System.out.println("도서번호\t도서명\t출판사\t가격");
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
