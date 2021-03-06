package com.ict07.IO;

import java.io.*;

public class Ex14 {

	//PrintStream : 모든 기본 자료형을 출력할 수 있다.
	//				화면에 출력하려면 System.out 을 활용
	//				파일에 출력하려면 FileOutputStream과 BufferedOutputStream 사용
	public static void main(String[] args) {
		String pathname = "C:"+File.separator+"study"+File.separator
				+"util"+File.separator+"ict04.txt";

		File file = new File(pathname);
		
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			ps = new PrintStream(bos);
			
			//화면에 출력
			System.out.println(24.1);
			System.out.println(20);
			System.out.println('C');
			System.out.println(true);
			System.out.println("대한민국");
			
			//파일에 출력
			ps.println(24.1);
			ps.println(20);
			ps.println('C');
			ps.println(true);
			ps.println("대한민국");
			
		} catch (Exception e) {
			
		}finally {
			try {
				bos.close();
				fos.close();
			} catch (Exception e2) {
				
			}
		}
	}

}
