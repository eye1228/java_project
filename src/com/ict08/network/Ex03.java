package com.ict08.network;
import java.util.*;
//ex02 ���� �� ����� ���� ����.
import java.io.*;
import java.net.*;
import java.util.Map;

public class Ex03 {
	public static void main(String[] args) {
		
		BufferedReader br = null;
		try {
			URL url = new URL("https://www.naver.com");
			URLConnection conn = url.openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));
			System.out.println("���ڵ� : " + conn.getContentEncoding());
			System.out.println("���� : " + conn.getContentLength());
			System.out.println("����Ÿ�� : " + conn.getContentType());	
			System.out.println("=========================================");
			
			//HTTP ����� �ٵ�� ������. 
			//����� ���� : HTTP �ٵ� �� ��û/���信 ���� ������ ����
			//�ٵ��� ���� : html��, �̹���, css, javascript
			
			Map<String, List<String>> list = conn.getHeaderFields();
			/*for (Map<String, List<String>> k : list) {
				
			}*/
		} catch (Exception e) {
		}finally {
			try {
				br.close();
			} catch (Exception e2) {
			}
		}
	}
}
