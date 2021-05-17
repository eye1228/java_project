package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		//�����͸� �޾Ƽ� VO�� �ִ´�.
		Scanner sc = new Scanner(System.in);
		ArrayList<VO> list = new ArrayList<VO>();
		
		
		
		
		
		//db�� �ʿ��� 3���� Ŭ����
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null; //Select���� ����� �޴´�.
		int result = 0;
		try {
			//1. ����̹� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. ������ ���� ����(3��)
			String url = "jdbc:mysql://203.236.220.111:3306/test02db?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "test02";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			//db����
			esc:while (true) {
				System.out.print("�й� : ");
				int no = sc.nextInt();
				System.out.print("�̸� : ");
				String name = sc.next();
				System.out.print("�а� : ");
				String det = sc.next();
				System.out.print("�ּ� : ");
				String addr = sc.next();
				System.out.print("��ȭ : ");
				String tel = sc.next();
				
				//���� ���� ����
				list.add(new VO(no, name, det, addr, tel));
				while(true) {
					System.out.println("����ұ��?(y/n)");
					String msg = sc.next();
					if(msg.equalsIgnoreCase("y")) {
						continue esc;
					}
					else if(msg.equalsIgnoreCase("n")) {
						break esc;
					}
					else {
						continue;
					}
				}
			}
			
			for(VO vo : list) {
				String sql = "insert into student_db(no,name,det,addr,tel) "
						+ "values("+vo.getNo()+",'"+vo.getName() +"','"+
						vo.getDet() +"','"	+ vo.getAddr()+"','"+ vo.getTel()+"')";
				stmt = conn.createStatement();
				result = stmt.executeUpdate(sql);
				System.out.println(sql);
				if(result < 0) {
					System.out.println("���� �߸���");
				}
			}
			
			//3. ������ �ۼ�
			//cust id�� 7�� ����� �̸� = ����ȣ, �ּ� = ���ѹα� ���� �� ����
			String sql = "select * from student_db";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.print(rs.getString("No") + "\t");
				System.out.print(rs.getString("name") + "\t");
				System.out.print(rs.getString("det") + "\t");
				System.out.print(rs.getString("addr") + "\t");
				System.out.println(rs.getString("tel") + "\t");
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
	}
}
