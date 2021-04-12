package com.ict08.network;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

//�Ľ� : �����͸� �м��ؼ� ���ϴ� �����͸� �����ϴ� ��
//�ļ� : �Ľ��� ���ִ� ���α׷�

//XML �Ľ� : ���û
public class Ex06 {
	public static void main(String[] args) {
		BufferedReader br = null;
		
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		Document document = null;
		try {
			URL url = new URL("https://www.kma.go.kr/XML/weather/sfc_web_map.xml");
			URLConnection conn = url.openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));
			
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while((msg = br.readLine()) != null) {
				sb.append(msg + "\n");
			}
			//System.out.println(sb.toString());
			//StringBuffer�� ����� ���� �б�
			InputSource is  = new InputSource(new StringReader(sb.toString()));
			
			//xml �Ľ��ϱ� : �������� �������� Document ��ü ����
			builder = factory.newDocumentBuilder();
			document = builder.parse(is);
			
			//�±׿� �Ӽ�, �ؽ�Ʈ �����ϱ�
			
			//1. local �±׵��� ����
			NodeList local = document.getElementsByTagName("local");
			StringBuffer sb2 = new StringBuffer();
			//2. for ���� �̿��� local ������ŭ �ݺ�
			for (int i = 0; i < local.getLength(); i++) {
				//�±��� ���� ����
				sb2.append(local.item(i).getFirstChild().getNodeValue() + ", ");
				//�±��� �Ӽ� ����
				sb2.append(((Element)local.item(i)).getAttribute("ta") + ", ");
				sb2.append(((Element)local.item(i)).getAttribute("desc") + "\n");
			}
			System.out.println(sb2.toString());
			
			
		} catch (Exception e) {
		}finally {
			try {
				br.close();
			} catch (Exception e2) {
			}
		}
	}
}
