package com.ict07.IO;


import java.io.*;

//객체 직렬화 : ObjectOutputStream : writeObject()
public class Ex23_Output {
	public static void main(String[] args) {
		/*직렬화 : 특정 클래스(VO)를 객체로 만들어서  특정 위치에 .ser로 만들어 저장
				 객체들이 가지고 있는 내용이 직렬화 되어 있다(사람은 정보를 제대로 볼 수 없다)
		*/
		
		String pathname = "C:"+File.separator+"study"+File.separator
				+"util" + File.separator + "ict07.ser";
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);//이렇게 연결해서 쓰는 방식 = 체인 방식
			
			//객체 직렬화를 하기 윈한 객체 만듦
			Ex23_VO vo = new Ex23_VO("둘리", 28, 67.3, true);
			
			//객체 직렬화
			oos.writeObject(vo);
			oos.flush();
			
		} catch (Exception e) {

		}finally {
			try {
				oos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
				
			}
		}
	
	
	
	
	
	}
}
